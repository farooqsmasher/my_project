package com.webteam;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import oracle.jdbc.pool.OracleDataSource;

@SpringBootApplication(scanBasePackages={
		"com.webteam.controller,com.webteam.service,com.webteam.repository,com.webteam.model,com.webteam.configurationwebteam.Demoapplication"})
@EnableJpaAuditing

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	

}
