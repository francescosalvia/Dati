package com.contactlab.dati.dati.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;


    static {
        config.setJdbcUrl( "jdbc:mysql://127.0.0.1:3306/iscrittinew?allowLoadLocalInfile=true" );
        config.setUsername( "root" );
        config.setPassword( "root" );
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        config.addDataSourceProperty( "useServerPrepStmts" , "true" );
        config.addDataSourceProperty( "useLocalSessionState" , "true" );
        config.addDataSourceProperty( "rewriteBatchedStatements" , "true" );
        config.addDataSourceProperty( "cacheResultSetMetadata" , "true" );
        config.addDataSourceProperty( "cacheServerConfiguration" , "true" );
        config.addDataSourceProperty( "elideSetAutoCommits" , "true" );
        config.addDataSourceProperty( "maintainTimeStats" , "false" );

        ds = new HikariDataSource( config );
    }


    private DataSource() {}

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }


}
