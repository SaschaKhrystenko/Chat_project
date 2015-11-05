<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: ua001022
  Date: 28.05.2015
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<% if(request.getAttribute("message") != null){
  ArrayList<String> allMessages = (ArrayList<String>) request.getAttribute("message");
  for (String msg: allMessages){
 %>
<h1>Message:<%=msg %></h1>
<%
    }}
%>
  </body>
</html>
