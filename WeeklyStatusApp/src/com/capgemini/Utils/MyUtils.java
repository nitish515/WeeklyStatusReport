package com.capgemini.Utils;

import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import com.capgemini.beans.Project;

public class MyUtils {
	
	public static void storeConnection(ServletContext context, Connection connection){
		context.setAttribute("connection", connection);
	}
	
	public static Connection getConnection(ServletContext context){
		Connection connection = (Connection) context.getAttribute("connection");
		return connection;
	}
	
	public static void storeListOfProjects(HttpSession session, List<Project> list){
		session.setAttribute("listOfProjects", list);
	}
	
	public static List<Project> getListOfProjects(HttpSession session){
		List<Project> list = (List<Project>) session.getAttribute("listOfProjects");
		return list;
	}
}