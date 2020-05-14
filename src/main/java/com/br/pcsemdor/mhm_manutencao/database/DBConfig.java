package com.br.pcsemdor.mhm_manutencao.database;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfig {

	//@Value("${spring.datasource.url}")

	@Bean
	public DataSource dataSource() {

		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://rpp.fmrp.usp.br:3310/teste_app");
		config.setUsername("teste_vitor");
		config.setPassword("1234");
		config.setDriverClassName("com.mysql.jdbc.Driver");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		// HikariConfig config = new HikariConfig();
		// config.setJdbcUrl("postgres://gqgeabvxgcczii:73d60c0a3adaaea939e6060cfa897ed9e7866b25a82653c2e81cc8a9fcd318b4@ec2-18-233-32-61.compute-1.amazonaws.com:5432/d2uhsficq9fb4r");
		return new HikariDataSource(config);
	}

}
