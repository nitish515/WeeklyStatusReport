<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="${pageContext.request.contextPath}/stream">
		<table>
		<tr>
		<td>Stream : </td>
		<td><select name="streamName">
			<option value="AUTOMATION">AUTOMATION</option>
			<OPTION value="SCRUM">SCRUM</OPTION>
			<OPTION value="GSP-TECHNICAL">GSP-TECHNICAL</OPTION>
			<option value="MOBILE-TESTING">MOBILE-TESTING</option>
			<option value="MORTGAGE">MORTGAGE</option>
			<option value="EVERGREENING">EVERGREENING</option>
			<option value="OTHERS">OTHERS</option></select></td>
		</tr>
		<tr>
		<td><input type="submit" value="Take The Stream"></input></td>
		</tr>
		</table>
	</form>
</body>
</html>