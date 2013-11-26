<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.fightfinder.entity.FightEvent" %>
<%ArrayList<FightEvent> events = (ArrayList<FightEvent>)request.getAttribute("events"); %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Top Fight Finder</title>
</head>

<body>
	<table>
	<tr><th>Event</th><th>Date</th></tr>
<%for(FightEvent event : events){%>
	<tr><td><%=event.getEventName()%></td><td><%=event.getEventDate()%></td></tr>
<%}%>
	</table>
</body>
</html>