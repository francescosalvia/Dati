package com.contactlab.dati.dati.service;

import com.contactlab.dati.dati.config.ThreadPoolBean;
import com.contactlab.dati.dati.connection.SftpConnection;
import com.contactlab.dati.dati.dao.DaoGeneral;
import com.contactlab.dati.dati.data.UtenteDb;
import com.contactlab.dati.dati.properties.SftpProperties;
import com.contactlab.dati.dati.properties.UtenteProperties;
import com.contactlab.dati.dati.repository.UtentiCopyRepository;
import com.contactlab.dati.dati.repository.UtentiPageRepository;
import com.contactlab.dati.dati.repository.UtentiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;


@Service("utenteService")
@EnableScheduling
public class UtenteService {

    private static final Logger logger = LoggerFactory.getLogger(UtenteService.class);

    @Autowired
    private UtenteProperties utenteProperties;

    @Autowired
    private SftpProperties sftp;

    @Autowired
    private UtentiRepository utentiRepository;

    @Autowired
    private UtentiCopyRepository utentiCopyRepository;

    @Autowired
    private UtentiPageRepository utentiPageRepository;

    @Autowired
    private DaoGeneral daoGeneral;

    @Autowired
    TransactionService transactionService;

    @Autowired
    private ModifyUtentiRunnable modifyUtentiRunnable;

    @Autowired
    private ThreadPoolBean threadPoolBean;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    @Qualifier("taskExecutor")
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;


    /******************************************************************************************************************/

    /*  descrizione stringa
     * args[0]: hostName
     * args[1]: username
     * args[2]: password
     * args[3]: localFilePath
     * args[4]: remoteFilePath
     * args[5]: remoteFilePathDestinazione
     */
    public void uploadFile(){
        Instant start = Instant.now();

        SftpConnection.upload(sftp.getHostName(),sftp.getUsername(),sftp.getPassword(),sftp.getLocalFilePath(),sftp.getRemoteFilePath());

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Method uploadFile execution lasted:" + duration.toMillis() + " ms");
    }

    public void readAll() {

        Instant start = Instant.now();

        logger.info("Scarico il file dal server");
        SftpConnection.download(sftp.getHostName(),sftp.getUsername(),sftp.getPassword(),sftp.getLocalFilePathDownload(),sftp.getRemoteFilePath());

        logger.info("leggo e importo il file");

        daoGeneral.importAll();

        logger.info("File importato nel db");

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Method readAll execution lasted:" + duration.toMillis() + " ms");
    }

    public void out() {

        Instant start = Instant.now();

        logger.info("Metodo salvataggio file csv");

        LocalDateTime data = LocalDateTime.now();

        String composizione = "customer_" + data.getDayOfMonth() + data.getMonthValue() + data.getYear() + "_" + data.getHour() + data.getMinute() + data.getSecond();

        String name = "'/mnt/c/Users/francesco.salvia/Desktop/iscrittiRifatto/" + composizione + ".csv'";

        String url = utenteProperties.getHeader() + utenteProperties.getCol() + name + utenteProperties.getDesc();

        try {
            daoGeneral.outAll(url);
        } catch (Exception e) {
            logger.warn("Eccezione", e.getMessage());
        }

        logger.info("Salvataggio effettuato!");

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Method modifyTable execution lasted:" + duration.toMillis() + " ms");
    }


//@Scheduled(fixedDelayString = "${my.delayString:1000}", initialDelayString = "${my.delayInitialString:10000}")

    public void modificaDati() {

        ThreadPoolTaskExecutor taskExecutor;

        int numItem = 5000;

        taskExecutor = threadPoolBean.newTaskExecutor(true, numItem, numItem, 0, "Utenti-Copy");

        Pageable pageable = PageRequest.of(0, 100);

        Slice<UtenteDb> slice;

        Instant start = Instant.now();
        do {
            slice = utentiPageRepository.findAllByProcessed(0, pageable);

            final List<UtenteDb> lista = slice.getContent();


            for (int i = 0; i < lista.size(); i++) {
                UtenteDb utenteDb = lista.get(i);
                final ModifyUtentiRunnable task = applicationContext.getBean(ModifyUtentiRunnable.class);

                task.setUtenteDb(utenteDb);

                taskExecutor.execute(task);
            }
            int currentMaxNumberOfConcurrentTask =
                    threadPoolBean.waitingQueueCapacity(1000, taskExecutor, 0);
            if (currentMaxNumberOfConcurrentTask == -1) {
                logger.error("Error [waitingQueueCapacity] currentMaxNumberOfConcurrentTask is [-1]");
                throw new IllegalStateException("Error [waitingQueueCapacity] currentMaxNumberOfConcurrentTask is " +
                        "[-1]");
            }



        } while (slice.hasNext());

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Tempo  :" + duration.toMillis() + " ms");

    }


}