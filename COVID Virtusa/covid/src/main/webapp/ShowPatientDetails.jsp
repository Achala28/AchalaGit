<%@page import="com.virtusa.web.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="refresh" content="10">

<title>Insert title here</title>
</head>
<body bgcolor=cyan>
	<center>
		<% Patient p = (Patient)session.getAttribute("a1");%>
		<img src="heartbeat.gif" width="100px" height="100px">
		<br> - Heart Rate
		<%= p.getHeartrate()%>
		<br>
	
		<img src="bloodpressure.gif" width="100px" height="100px">
		<br>
		Blood Pressure
		<%= p.getBloodpressure() %>
		<br>
		<img src="temperature.gif" width="100px" height="100px">
		
		<br> Temperature
		<%= p.getTemperature() %>
	</center>

</body>
</html>