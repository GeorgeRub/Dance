<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div class="padding-top border-bottom-sides">
    Наші тренери
</div>

<c:forEach items="${coaches}" var="coach">
    <div class="padding-top">
        <img src="/images/${coach.photo}">
        <br>
        <p class="side-text-align side-text-bold side-text-margin side-text-size">
                ${coach.name}
        </p>
        <p class="side-text-align side-text-margin side-text-size">
                ${coach.position}
        </p>
        <a href="/school/${coach.url}" class="purpure-color right">Докладніше >></a>
        <br>
    </div>
</c:forEach>

<div class="padding-top border-bottom-sides">
    Наш зал
</div>
<c:forEach items="${ourHall}" var="coach">
    <div class="padding-top">
        <img src="/images/${coach.photo}">
        <br>
        <p class="side-text-align side-text-bold side-text-margin side-text-size">
                ${coach.pre}
        </p>
        <p class="side-text-align side-text-margin side-text-size">
                ${coach.title}
        </p>
        <a href="/school/${coach.url}" class="purpure-color right">Докладніше >></a>
        <br>
    </div>
</c:forEach>
</body>
</html>
