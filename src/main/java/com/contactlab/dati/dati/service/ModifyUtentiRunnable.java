package com.contactlab.dati.dati.service;


import com.contactlab.dati.dati.data.UtenteDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ModifyUtentiRunnable implements Runnable{


    @Autowired
    TransactionService transactionService;

    private static final Logger logger = LoggerFactory.getLogger(ModifyUtentiRunnable.class);

    private UtenteDb utenteDb;

    public UtenteDb getUtenteDb() {
        return utenteDb;
    }

    public void setUtenteDb(UtenteDb utenteDb) {
        this.utenteDb = utenteDb;
    }

    @Override
    public void run() {

        transactionService.modifyUtenteTable(utenteDb);


    }
}
