package com.contactlab.dati.dati.connection;

import com.contactlab.dati.dati.metod.MetodiUtili;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.Selectors;
import org.apache.commons.vfs2.impl.StandardFileSystemManager;
import org.apache.commons.vfs2.provider.sftp.SftpFileSystemConfigBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class SftpConnection {
    private static final Logger logger = LoggerFactory.getLogger(SftpConnection.class);

  //  private final String[] args = new String[]{"sftp-clab.housing.tomato.it","sftp-barilla","3kE4bvVWCY","C:\\Users\\francesco.salvia\\Desktop\\fileProva.txt", "/incoming/clab_test/francescofileProva.txt","/incoming/clab_test/prova/francescofileProva.txt"};
    /*  descrizione stringa
     * args[0]: hostName
     * args[1]: username
     * args[2]: password
     * args[3]: localFilePath
     * args[4]: remoteFilePath
     * args[5]: remoteFilePathDestinazione
     */


    public static void upload(String hostName, String username,
                              String password, String localFilePath, String remoteFilePath) {

        File f = new File(localFilePath);
        if (!f.exists()) {
            logger.error("Errore file non trovato");
        }

        StandardFileSystemManager manager = new StandardFileSystemManager();

        try {
            manager.init();

            FileObject localFile = manager.resolveFile(f.getAbsolutePath());

            FileObject remoteFile = manager.resolveFile(
                    createConnectionString(hostName, username, password,
                            remoteFilePath), createDefaultOptions());

            remoteFile.copyFrom(localFile, Selectors.SELECT_SELF);

            logger.info("Upload completato con successo");

        } catch (Exception e) {
            logger.error("Exception in upload",e);
        } finally {
            manager.close();
        }
    }

    public static void download(String hostName, String username,
                                String password, String localFilePath, String remoteFilePath) {

        StandardFileSystemManager manager = new StandardFileSystemManager();

        try {
            manager.init();

        //    String downloadFilePath = localFilePath.substring(0,
            //           localFilePath.lastIndexOf("."))
            //          + "_downlaod_from_sftp"
            //         + localFilePath.substring(localFilePath.lastIndexOf("."),
            //         localFilePath.length());

            String downloadFilePath = localFilePath.substring(0);

            FileObject localFile = manager.resolveFile(downloadFilePath);


            FileObject remoteFile = manager.resolveFile(
                    createConnectionString(hostName, username, password,
                            remoteFilePath), createDefaultOptions());


            localFile.copyFrom(remoteFile, Selectors.SELECT_SELF);

            logger.info("Download completato con successo");
        } catch (Exception e) {
            logger.error("Exception in download",e);
        } finally {
            manager.close();
        }
    }

    public static void delete(String hostName, String username,
                              String password, String remoteFilePath) {
        StandardFileSystemManager manager = new StandardFileSystemManager();

        try {
            manager.init();

            FileObject remoteFile = manager.resolveFile(
                    createConnectionString(hostName, username, password,
                            remoteFilePath), createDefaultOptions());

            if (remoteFile.exists()) {
                remoteFile.delete();
                logger.info("Delete completato con successo");
            }
        } catch (Exception e) {
            logger.error("Exception in download",e);
        } finally {
            manager.close();
        }
    }

    public static boolean exist(String hostName, String username,
                                String password, String remoteFilePath) {
        StandardFileSystemManager manager = new StandardFileSystemManager();

        try {
            manager.init();

            // Create remote object
            FileObject remoteFile = manager.resolveFile(
                    createConnectionString(hostName, username, password,
                            remoteFilePath), createDefaultOptions());

            System.out.println("File exist: " + remoteFile.exists());

            return remoteFile.exists();
        } catch (Exception e) {
            logger.error("RuntimeException");
            throw new RuntimeException(e);
        } finally {
            manager.close();
        }
    }

    public static String createConnectionString(String hostName,
                                                String username, String password, String remoteFilePath) {

        // result: "sftp://user:123456@domainname.com/resume.pdf
        return "sftp://" + username + ":" + password + "@" + hostName + "/" + remoteFilePath;
    }

    public static FileSystemOptions createDefaultOptions() {

        FileSystemOptions opts = new FileSystemOptions();

try {
    SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(
            opts, "no");

    SftpFileSystemConfigBuilder.getInstance().setUserDirIsRoot(opts, true);
    SftpFileSystemConfigBuilder.getInstance().setTimeout(opts, 10000);

} catch (Exception e) {
    logger.error("Exception in FileSystemOptions ", e);
}
        return opts;
    }


    public static void move(String hostName, String username,
                            String password, String remoteFilePath,String remoteFilePathDestinazione) {

        StandardFileSystemManager manager = new StandardFileSystemManager();
        try {
            manager.init();

            FileObject remoteFile = manager.resolveFile(
                    createConnectionString(hostName, username, password,
                            remoteFilePath), createDefaultOptions());

            FileObject remoteFileDestinazione = manager.resolveFile(
                    createConnectionString(hostName, username, password,
                            remoteFilePathDestinazione), createDefaultOptions());

            if (remoteFile.exists()) {
                remoteFile.moveTo(remoteFileDestinazione);
                logger.info("Il file è stato spostato con successo");
            }
        } catch (Exception e) {
           logger.error("RuntimeException in move", e);
        } finally {
            manager.close();
        }
    }






}
