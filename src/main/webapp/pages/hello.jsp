<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! private int numberOfVisitors=1; %>

<h2> Hello JSP. Le nombre de visiteurs est <%=numberOfVisitors %></h2>

<%numberOfVisitors++; %>
</body>
</html>