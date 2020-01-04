<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div style="border-bottom:2px solid #e580ad;">
    Новини
</div>
<c:forEach items="${news}" var="coach">
    <div style="opacity: 100%">
        <img src="/images/${coach.photo}">
        <br>
            ${coach.pre}
        <br>
        <a href="/school/${coach.url}" style="color: #e580ad">Докладніше</a>
    </div>
</c:forEach>
<div style="border-bottom:2px solid #e580ad;">
    Натхнення
</div>
<c:forEach items="${inspirations}" var="coach">
    <div style="opacity: 100%">
        <img src="/images/${coach.photo}">
        <br>
            ${coach.pre}
        <br>
        <a href="/school/${coach.url}" style="color: #e580ad">Докладніше</a>
    </div>
</c:forEach>
<div style="border-bottom:2px solid #e580ad;">
    Вимоги до костюмів
</div>
<div>

</div>
</body>
</html>
