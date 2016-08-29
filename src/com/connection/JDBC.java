package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class JDBC {
	private static Connection connection;
	static{
		try{
			ServletContext servletContext=ServletContextProvider.getServletContext();
			Class.forName(servletContext.getInitParameter("class"));
			connection=DriverManager.getConnection(servletContext.getInitParameter("url"),"hr","hr");

		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return connection;
	}
	

}
