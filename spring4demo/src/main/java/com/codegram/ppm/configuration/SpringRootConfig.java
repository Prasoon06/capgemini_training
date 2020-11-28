package com.codegram.ppm.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan(basePackages = {"com.codegram.ppm.daoimpl","com.codegram.ppm.serviceimpl"})
/**
 * This class will have the injection of Service, DAO, EmailSender related beans Configuration
 * @author panka
 *
 */
public class SpringRootConfig {
	
	/**
	 * This method will give the BasicDataSource object, this will be used to do all the necessary steps for JDBC connection along with
	 * connection pool. it will also set the setTestOnBorrow as true i.e. getting connection object. 
	 * setValidationQuery is used for DB validation purpose
	 * @return BasicDataSource object
	 */
	@Bean 
	public BasicDataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/testdb");		
		ds.setUsername("postgres");
		ds.setPassword("admin");
		ds.setMaxTotal(2);
		ds.setInitialSize(1);
		ds.setTestOnBorrow(true);
		ds.setValidationQuery("select 1");
		ds.setDefaultAutoCommit(true);
		return ds;
	}
	
	
}
