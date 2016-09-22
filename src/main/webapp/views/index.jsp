
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title> Java 2 WEB TESTING</title>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <link href="${pageContext.request.contextPath}/views/styles/main.css" rel="stylesheet" type="text/css" >

</head>

<body>
<%@ include file="/views/Header.jsp" %>
<form method="get">
        <div>
            <input class="button" type="submit" name="RedirectToRegisterPage" value="Registration">
        </div>
        <br>
        <div>
            <input class="button1" type="submit" name = "RedirectToSignInPage" value="Sign In" >
        </div>
</form>
</body>
</html>
