<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
</head>
<jsp:include page="header.jsp"/>
<body>
<section class="container">
    <div class="login">
        <h1>${message}</h1>
        <c:url value="/login" var="loginVar"/>
        <form id="loginForm" action="${loginVar}" method="POST">
            <p><input type="text" name="loginUserName" value="" placeholder="Username" required></p>
            <p><input type="password" name="loginPassword" value="" placeholder="Password" required></p>
            <c:if test="${param.error != null}">
                <p>Invalid user name and password.</p>
            </c:if>
            <c:if test="${param.logout != null}">
                    <p>You have successfully logged out.</p>
             </c:if>
            <sec:csrfInput/>
            <p class="submit"><input type="submit" name="Login" value="Login"/></p>
        </form>
    </div>
</body>
</html>
