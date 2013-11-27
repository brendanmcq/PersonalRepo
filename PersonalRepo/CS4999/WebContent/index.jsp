<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.fightfinder.entity.FightEvent" %>
<%ArrayList<FightEvent> events = (ArrayList<FightEvent>)request.getAttribute("events"); %>
<link rel="stylesheet" type="text/css" href="include/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Top Fight Finder</title>
</head>

<body>
<div class="content">
	<br>
<%for(FightEvent event : events){%>
	<div class="fightEvent"><%=event.getEventName()%><br><%=event.getEventDate()%></div>
	<br>
<%}%>
	
</div>
</body>
</html>