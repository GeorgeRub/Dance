<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div style="border-bottom:2px solid #e580ad;">
    Наші тренери
</div>

<c:forEach items="${coaches}" var="coach">
    <div>
        <img src="/images/${coach.photo}">
        <br>
            ${coach.name}
        <br>
            ${coach.position}
        <br>
        <a href="/school/${coach.url}" style="color: #e580ad">Докладніше</a>
    </div>
</c:forEach>

<div style="border-bottom:2px solid #e580ad;">
    Наш зал
</div>
<div>

</div>
</body>
</html>
