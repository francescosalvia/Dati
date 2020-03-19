package com.contactlab.dati.dati.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "datasc")
public class DataSourceProperties {


    private String jdbcUrl;
    private String username;
    private String password;
    private String cachePrepStmts;
    private String prepStmtCacheSize;
    private String prepStmtCacheSqlLimit;
    private String useServerPrepStmts;
    private String useLocalSessionState;
    private String rewriteBatchedStatements;
    private String cacheResultSetMetadata;
    private String cacheServerConfiguration;
    private String elideSetAutoCommits;
    private String maintainTimeStats;


    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
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

    public String getCachePrepStmts() {
        return cachePrepStmts;
    }

    public void setCachePrepStmts(String cachePrepStmts) {
        this.cachePrepStmts = cachePrepStmts;
    }

    public String getPrepStmtCacheSize() {
        return prepStmtCacheSize;
    }

    public void setPrepStmtCacheSize(String prepStmtCacheSize) {
        this.prepStmtCacheSize = prepStmtCacheSize;
    }

    public String getPrepStmtCacheSqlLimit() {
        return prepStmtCacheSqlLimit;
    }

    public void setPrepStmtCacheSqlLimit(String prepStmtCacheSqlLimit) {
        this.prepStmtCacheSqlLimit = prepStmtCacheSqlLimit;
    }

    public String getUseServerPrepStmts() {
        return useServerPrepStmts;
    }

    public void setUseServerPrepStmts(String useServerPrepStmts) {
        this.useServerPrepStmts = useServerPrepStmts;
    }

    public String getUseLocalSessionState() {
        return useLocalSessionState;
    }

    public void setUseLocalSessionState(String useLocalSessionState) {
        this.useLocalSessionState = useLocalSessionState;
    }

    public String getRewriteBatchedStatements() {
        return rewriteBatchedStatements;
    }

    public void setRewriteBatchedStatements(String rewriteBatchedStatements) {
        this.rewriteBatchedStatements = rewriteBatchedStatements;
    }

    public String getCacheResultSetMetadata() {
        return cacheResultSetMetadata;
    }

    public void setCacheResultSetMetadata(String cacheResultSetMetadata) {
        this.cacheResultSetMetadata = cacheResultSetMetadata;
    }

    public String getCacheServerConfiguration() {
        return cacheServerConfiguration;
    }

    public void setCacheServerConfiguration(String cacheServerConfiguration) {
        this.cacheServerConfiguration = cacheServerConfiguration;
    }

    public String getElideSetAutoCommits() {
        return elideSetAutoCommits;
    }

    public void setElideSetAutoCommits(String elideSetAutoCommits) {
        this.elideSetAutoCommits = elideSetAutoCommits;
    }

    public String getMaintainTimeStats() {
        return maintainTimeStats;
    }

    public void setMaintainTimeStats(String maintainTimeStats) {
        this.maintainTimeStats = maintainTimeStats;
    }
}
