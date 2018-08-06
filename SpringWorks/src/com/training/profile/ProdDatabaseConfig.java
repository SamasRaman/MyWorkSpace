package com.training.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//DEV-MySql
@Configuration
@Profile("Production")
public class ProdDatabaseConfig implements DatabaseConfig{

	@Bean
	@Override
	public DataSource createDataSource() {
		System.out.println("Creating Production Database Instance");

		DriverManagerDataSource dataSource=new DriverManagerDataSource();

		return dataSource;
	}

}
