<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 3/13/2020
  Time: 8:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings administration</title>
</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
<div class="container">
    <div class="row">
        <c:choose>
            <c:when test="${settings.size() > 0}">
                <table>
                    <thead>
                    <tr>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${settings}" var="set">
                        <tr>
                            <td>${set.id}</td>
                            <td>${set.name}</td>
                            <td>${set.val}</td>
                            <td><a href="/admin/settings/edit/${set.id}">Редагувати</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                <h2>No data</h2>
            </c:otherwise>
        </c:choose>
    </div>
</div>
</body>
</html>
