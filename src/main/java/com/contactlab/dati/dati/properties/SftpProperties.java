package com.contactlab.dati.dati.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sftpconfig")
public class SftpProperties {

    private String hostName;
    private String username;
    private String password;
    private String localFilePath;
    private String remoteFilePath;
    private String remoteFilePathDestinazione;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocalFilePath() {
        return localFilePath;
    }

    public void setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
    }

    public String getRemoteFilePath() {
        return remoteFilePath;
    }

    public void setRemoteFilePath(String remoteFilePath) {
        this.remoteFilePath = remoteFilePath;
    }

    public String getRemoteFilePathDestinazione() {
        return remoteFilePathDestinazione;
    }

    public void setRemoteFilePathDestinazione(String remoteFilePathDestinazione) {
        this.remoteFilePathDestinazione = remoteFilePathDestinazione;
    }
}
