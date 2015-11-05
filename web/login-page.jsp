<%--
  Created by IntelliJ IDEA.
  User: ua001022
  Date: 08.06.2015
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="style/bootstrap.min.css">
  <link rel="stylesheet" href="style/Style.css">
    <title>Login</title>
</head>


<body>

<div class="navbar" id="title">
  <div class="navbar-inner">
    <a class="brand" href="index.jsp">My Twiter</a>
    <ul class="nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="login-page.jsp">Login</a></li>
      <li><a href="sign-page.jsp">Sign in</a></li>
    </ul>
  </div>
  <br>
  <form action="/login-page" method="post" class="form-horizontal">
    <div class="control-group">
      <label class="control-label" for="inputLogin">Login</label>
      <div class="controls">
        <input type="text" id="inputLogin" name="account-name" placeholder="Login">
      </div>
    </div>
    <div class="control-group">
      <label class="control-label" for="inputPassword">Password</label>
      <div class="controls">
        <input type="password" id="inputPassword" name="account-password" placeholder="Password">
      </div>
    </div>
    <div class="control-group">
      <div class="controls">

        <button type="submit" class="btn">Login</button>
      </div>
    </div>
  </form>

</div>

<%--<form class="form-inline">
  <input type="text" class="input-small" placeholder="Enter name">
  <input type="password" class="input-small" placeholder="Password">
  <label class="checkbox">
    <input type="checkbox"> Запомнить
  </label>
  <button type="submit" class="btn">Registration</button>
</form>--%>



</body>
</html>
