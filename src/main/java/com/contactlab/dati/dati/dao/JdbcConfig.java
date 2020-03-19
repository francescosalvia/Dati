package com.contactlab.dati.dati.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;


@Configuration
@ConfigurationProperties(prefix = "params.datasource")
public class JdbcConfig extends HikariConfig {





}
