<%@page import="com.capgemini.Utils.MyUtils"%>
<%@page import ="com.capgemini.beans.Project" %>
<%@page import ="java.util.List" %>
<%@page import ="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Project> list = (List<Project>) request.getAttribute("listingProjects"); %>
	<table>
		<tr><th>Project_ID</th><th>Project_Name</th><th>Country_Name</th></tr>
		<% for(Project project:list){ 
				request.setAttribute("project", project);%>
		<tr><td>${project.projectID } &nbsp; &nbsp;</td><td>${project.projectName}&nbsp; &nbsp;</td><td>${project.countryName}</td></tr>
		<%} %>
	</table>
</body>
</html>