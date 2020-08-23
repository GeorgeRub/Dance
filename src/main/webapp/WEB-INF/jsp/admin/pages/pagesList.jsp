<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список сторінок</title>
</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div>
                <a href="/admin/pages/create">Додати нову сторінку</a>
            </div>
        </div>
        <div class="col-12">
            <table border="1" style="width: 100%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Category</th>
                    <th>Title</th>
                    <th>URL</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pagesList}" var="page">
                    <tr>
                        <td>${page.id}</td>
                        <td>${page.pageCategory.ukrName}</td>
                        <td>${page.title}</td>
                        <td>${page.url}</td>
                        <td><a href="/admin/pages/edit/${page.id}" class="btn btn-light" style="width: 100%">Редагувати</a> </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
