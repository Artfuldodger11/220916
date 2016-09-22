<%@ page import="lv.javaguru.java2.domain.User" %>
<%@ page import="lv.javaguru.java2.domain.builders.UserBuilder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<meta http-equiv="content-type" content="text/html" charset="UTF-8">
<link href="${pageContext.request.contextPath}/views/styles/register.css" rel="stylesheet" type="text/css" >
<head>
    <title>RegisterPage</title>
</head>
<body>
<h5><%= request.getAttribute("model")%></h5>
<form method="post" action="registration" name = "registration">
    <input type="text" placeholder="First Name" name="RegFirstName" required class="regInput1" > <br>
    <input type="text" placeholder="LastName" name="RegLastName" required class="regInput2" ><br>
    <input type="email" placeholder="Email"  name="RegEmail" required  class="regInput3" ><br>
    <input type="text" placeholder="Login" name="RegLogin" required class="regInput4"  ><br>
    <input type="password" placeholder="Password" name="RegPassword" required  class="regInput5" ><br>
    <input type="submit" value="Register" class="regInput7">
</form>

</body>
</html>
