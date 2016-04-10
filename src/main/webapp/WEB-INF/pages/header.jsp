<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/common.css" />" rel="stylesheet">
<script type="text/javascript" src="../resources/js/jquery-2.2.0.js"></script>
<script type="text/javascript" src="../resources/js/common.js"></script>
<sec:authorize access="authenticated" var="authenticated"/>
<div class="header">
    <p><strong>Rental Cars System</strong>
     <c:if test="${authenticated}">
        <span style="float:right">Welcome <sec:authentication property="principal.firstName"/> <sec:authentication property="principal.lastName"/>&nbsp;&nbsp;</span>
     </c:if>
     </p>
</div>
<div>
    <nav>
        <ul>
            <li><a href="<spring:url value="/"/>">Home</a></li>
            <li><a href="<spring:url value="/cars"/>">Cars</a></li>
            <c:choose>
                <c:when test="${authenticated}">
                    <li class="active" style="float:right"><a id="logout" href="#">Logout</a></li>
                    <form name="logout-form" id="logout-form" method="POST" action="/logout"/>
                        <sec:csrfInput/>
                    </form>
                </c:when>
                <c:otherwise>
                    <li class="active" style="float:right"><a href="<spring:url value="/login"/>">Sign In</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </nav>
</div>