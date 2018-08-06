package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//DEV-Oracle
@Configuration
@Profile("Development")
public class DevDatabaseConfig implements DatabaseConfig{

	@Override
	@Bean
	public DataSource createDataSource() {
		System.out.println("Creating Development Database Instance");
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		return dataSource;
	}

}
