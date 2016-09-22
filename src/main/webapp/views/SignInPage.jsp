

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="content-type" content="text/html" charset="UTF-8">
<link href="${pageContext.request.contextPath}/views/styles/signin.css" rel="stylesheet" type="text/css" >
<head>
    <title>SignIn Page</title>
</head>
<body>
<h5><%= request.getAttribute("model")%></h5>
<form action="signIn" method="post">
    <input type="text" placeholder="Login" name="SignLogin" required class="signInput1"><br>
    <input type="password" placeholder="Password" name="SignPassword" required class="signInput2"><br>
    <input type="submit" value="Sign In" class="signInput3">
</form>

</body>
</html>
