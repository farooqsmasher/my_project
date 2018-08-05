package com.webteam.configuration;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import oracle.jdbc.pool.OracleDataSource;
 
@Configuration
@EnableJpaRepositories
@ConfigurationProperties("spring.datasource")
public class OracleConfiguration {
    @NotNull
    private String username;
 
    @NotNull
    private String password;
 
    @NotNull
    private String url;
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    @Bean
    DataSource dataSource() throws SQLException {
 
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
}
