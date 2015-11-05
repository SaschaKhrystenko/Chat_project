<%--
  Created by IntelliJ IDEA.
  User: ua001022
  Date: 08.06.2015
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="style/bootstrap.min.css">
  <link rel="stylesheet" href="style/Style.css">
    <title>Twitter UserPage</title>
</head>
<body>

  <div class="navbar" id="title">
  <div class="navbar-inner">
    <a class="brand" href="index.jsp">My Twiter</a>
    <ul class="nav nav-pills">
      <li><a href="login-page.jsp">Login out</a></li>
    </ul>
  </div>

    <br>
    <% if(request.getSession().getAttribute("authorized")!=null){%>


    <form action="/send-message" method="post">
      <textarea name="send-message" placeholder="Enter you message here.." rows="3"></textarea>
      <p> <button class="btn" type="submit">Send</button>
        <button class="btn" type="reset">Clear</button></p>
    </form>


    <%
      }
    %>

</div>



</body>
</html>
