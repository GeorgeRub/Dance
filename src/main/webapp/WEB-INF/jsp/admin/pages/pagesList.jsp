<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список сторінок</title>
</head>
<body>
<c:import url="../adminHeader.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div>
                <a href="/admin/pages/create">Додати нову сторінку</a>
            </div>
        </div>
        <div class="col-12">
            <table border="1">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>URL</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pagesList}" var="page">
                    <tr>
                        <td>${page.id}</td>
                        <td>${page.title}</td>
                        <td>${page.url}</td>
                        <td><a href="/admin/pages/edit/${page.id}">Редагувати</a> </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
