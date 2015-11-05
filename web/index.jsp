<%@ page import="java.util.ArrayList" %>
<%@ page import="myTwiterProject.entities.Message" %>
<%--
  Created by IntelliJ IDEA.
  User: ua001022
  Date: 26.05.2015
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <link rel="stylesheet" href="style/bootstrap.min.css">
    <link rel="stylesheet" href="style/Style.css">
    <title>Chat</title>
  </head>

  <body>
  <div class="navbar" id="title">
    <div class="navbar-inner">
      <a class="brand" href="index.jsp">My Twiter</a>
      <ul class="nav">
        <li><a href="index.jsp">Home</a></li>
        <li><a href="login-page.jsp">Login</a></li>
        <li class="divider-vertical"></li>
        <li><a href="sign-page.jsp">Sign in</a></li>
      </ul>
    </div>


    <br>
    <div>
      <form action="/message" method="post">
        <button class="btn" type="submit" name="allMessage"><i class=" icon-list">
        </i>  Show All Message
        </button>
      </form>
    </div>


    <% if (request.getAttribute("msg")!=null){
    %>
    <h3><%=request.getAttribute("msg")%></h3>
    <%
      }
    %>

    <% if(request.getAttribute("message") != null){
      ArrayList<Message> allMessages = (ArrayList<Message>) request.getAttribute("message");%>

      <table id="message-table" class="dataTable table  table-hover table-bordered">
      <%
      for (Message msg: allMessages){
      %>

      <tr>

        <td><%= msg.getDate() %></td>
        <td> <%= msg.getLogin() %></td>
        <td><%= msg.getMessage() %></td>

      </tr>
        <%
            }
        %>

    </table>
    <%
      }
    %>



  </div>


  </body>
</html>

