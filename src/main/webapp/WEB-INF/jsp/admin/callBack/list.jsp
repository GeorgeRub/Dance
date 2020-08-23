<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 7/24/2020
  Time: 5:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Call Back List</title>
</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-12">
            <h2 style="display: inline-block">${title}</h2>
            <c:choose>
                <c:when test="${isNew.equals('true')}">
                    <a  style="display: inline-block" href="${pageContext.request.contextPath}/admin/callback/list">Переглянути всі заявки</a>
                </c:when>
                <c:otherwise>
                    <a  style="display: inline-block" href="${pageContext.request.contextPath}/admin/callback/list/new">Тількі нові</a>
                </c:otherwise>
            </c:choose>
        </div>
        <div class="col-12">
            <table style="width: 100%;" border="1"  class="table table-striped">
                <thead>
                <tr>
                    <th>Ім'я</th>
                    <th>телефон</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="query">
                    <tr>
                        <td>${query.name}</td>
                        <td>${query.phone}</td>
                        <td><a href="${pageContext.request.contextPath}/admin/callback/edit/${query.id}" class="btn btn-light" style="width: 100%">Переглянути</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>
