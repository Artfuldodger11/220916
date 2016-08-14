<%--
  Created by IntelliJ IDEA.
  User: Dmitry
  Date: 08/08/2016
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="content-type" content="text/html" charset="UTF-8">
<link href="${pageContext.request.contextPath}/views/styles/signin.css" rel="stylesheet" type="text/css" >
<head>
    <title>SignIn Page</title>
</head>
<body>

<form action="SignInServlet">
    <input type="text" placeholder="Login" name="SignLogin" required class="signInput1"><br>
    <input type="password" placeholder="Password" name="SignPassword" required class="signInput2"><br>
    <input type="submit" value="Register" class="signInput3">
</form>

</body>
</html>
