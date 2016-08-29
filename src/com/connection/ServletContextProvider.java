package com.connection;

import javax.servlet.ServletContext;

public class ServletContextProvider {
	public static ServletContext  servletContext;

	public static ServletContext getServletContext() {
		return servletContext;
	}

	public static void setServletContext(ServletContext servletContext) {
		ServletContextProvider.servletContext = servletContext;
	}
	

}
