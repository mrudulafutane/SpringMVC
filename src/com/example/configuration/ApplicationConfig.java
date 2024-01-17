package com.example.configuration;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.example.entity.Customer;
import com.example.entity.FileData;



@Configuration
@ComponentScan(basePackages = "com.example")
@EnableWebMvc
public class ApplicationConfig {
	@Bean

	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		
		ivr.setSuffix(".jsp");
		
		return ivr;
	}

	@Bean

	public DriverManagerDataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springmvcJavaBasedB24");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public LocalSessionFactoryBean getsessioFactoryBean() {

		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();

		sf.setDataSource(dataSource());

		Properties properties = new Properties();

		properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.setProperty(Environment.HBM2DDL_AUTO, "update");
		properties.setProperty(Environment.SHOW_SQL, "true");

		sf.setHibernateProperties(properties);
		sf.setAnnotatedClasses(Customer.class, FileData.class);

		return sf;
	}

	@Bean
	
	public MultipartResolver multipartResolver() {
		return  new CommonsMultipartResolver();
	
	}
	

}
