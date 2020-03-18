package com.contactlab.dati.dati.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "uconfig")
public class UtenteProperties {


    private String urlFile;
    private String urlWrite;
    private String url;
    private String header;
    private String col;
    private String desc;
    private String delayString;

    public String getDelayString() {
        return delayString;
    }

    public void setDelayString(String delayString) {
        this.delayString = delayString;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlWrite() {
        return urlWrite;
    }

    public void setUrlWrite(String urlWrite) {
        this.urlWrite = urlWrite;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }
}
