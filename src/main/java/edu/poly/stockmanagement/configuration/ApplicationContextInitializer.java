package edu.poly.stockmanagement.configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import edu.poly.stockmanagement.util.HibernateUtil;

public class ApplicationContextInitializer implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Init...");
		HibernateUtil.getSessionfactory();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		if (HibernateUtil.getSessionfactory() != null)
			HibernateUtil.getSessionfactory().close();
	}

}
