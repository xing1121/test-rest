package com.sf.rest.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAppListener implements ServletContextListener{

	private Logger logger = LoggerFactory.getLogger(MyAppListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("MyAppListener...init....");
		ServletContext servletContext = sce.getServletContext();
		String ctp = servletContext.getContextPath();
		servletContext.setAttribute("ctp", ctp);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		sce.getServletContext().removeAttribute("ctp");
		logger.info("MyAppListener...destory....");
	}

}
