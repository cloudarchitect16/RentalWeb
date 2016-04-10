<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Cars Maintenance</title>
    <link href="<c:url value="/resources/css/generic-table.css" />" rel="stylesheet">
</head>
<jsp:include page="header.jsp"/>
<body>
<div>
    <h2>${message}</h2>
    <div>
        <table class="table-style">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Make</th>
                    <th>Model</th>
                    <th>Trim</th>
                    <th>Year</th>
                    <th>VIN</th>
                    <th>Color</th>
                    <th>Title Number</th>
                    <th>Title Validity</th>
                    <th>Purchase Date</th>
                    <th>Status</th>
                    <th>Location</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${cars}" var="car">
                    <tr>
                        <td>${car.ID}</td>
                        <td>${car.make}</td>
                        <td>${car.model}</td>
                        <td>${car.trim}</td>
                        <td>${car.year}</td>
                        <td>${car.vin}</td>
                        <td>${car.color}</td>
                        <td>${car.licenseTitle}</td>
                        <td>${car.stickerValidity}</td>
                        <td>${car.purchaseDate}</td>
                        <td>${car.status}</td>
                        <td>${car.location}</td>
                   </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
