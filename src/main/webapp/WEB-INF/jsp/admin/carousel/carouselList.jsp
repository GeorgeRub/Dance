<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редагування каруселі</title>
</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-12">
            <form method="post" action="/admin/carousel/add" role="form" enctype="multipart/form-data">
                <label for="uploadFileMain">Виберіть фото</label>
                <input id="uploadFileMain" type="file" name="addPhoto"
                       class="form-control"/>
                <button type="submit">Зберегти</button>
            </form>
        </div>
        <div class="col-12">
            <table style="width: 100%;">
                <thead>
                <tr>
                    <th></th>
                    <th>Назва зображення</th>
                    <th>Активне</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${images}" var="image">
                    <tr <c:if test="image.isDeleted()">style="background-color: red;" </c:if>>
                        <td><img src="/images/carousel/${image.imageName}" style="width: 50px;"></td>
                        <td>${image.imageName}</td>
                        <td><c:choose>
                            <c:when test="${image.isDeleted()}">Активне</c:when>
                            <c:otherwise>Заблоковане</c:otherwise>
                        </c:choose>${image.deleted}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
</body>
</html>
