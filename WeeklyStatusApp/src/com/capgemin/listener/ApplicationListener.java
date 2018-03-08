package com.capgemin.listener;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.h2.tools.RunScript;

import com.capgemini.Utils.MyUtils;


/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ApplicationListener() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		ServletContext context = servletContextEvent.getServletContext();
		
		String dbURL = context.getInitParameter("dbURL");
		String userName = context.getInitParameter("userName");
		String password = context.getInitParameter("password");
		
		try{
			Class.forName("org.h2.Driver");
    		Connection connection = DriverManager.getConnection(dbURL, userName, password);
    		InputStream in = new ApplicationListener().getClass().getResourceAsStream("data.sql");
    		RunScript.execute(connection, new InputStreamReader(in));
    		MyUtils.storeConnection(context, connection);
    		System.out.println("asdfgasdg");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
