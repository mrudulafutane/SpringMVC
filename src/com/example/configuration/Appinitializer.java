package com.example.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Appinitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletcontext) throws ServletException {
		// TODO Auto-generated method stub
		
		AnnotationConfigWebApplicationContext apc = new AnnotationConfigWebApplicationContext();
		
		apc.register(ApplicationConfig.class);
		
		apc.setServletContext(servletcontext);
		
		ServletRegistration.Dynamic dynamic = servletcontext.addServlet("dispatcher", new DispatcherServlet(apc));

		dynamic.addMapping("/");
	}

}
