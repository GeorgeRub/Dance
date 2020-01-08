<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<c:if test="${coaches.size() > 0}">
    <div class="padding-top border-bottom-sides">
        Наші тренери
    </div>


    <c:forEach items="${coaches}" var="coach">
        <div class="padding-top">
            <img src="/images/${coach.smallPhoto}">
            <br>
            <p class="side-text-align side-text-margin side-text-size">
                    ${coach.pre}
            </p>
            <a href="/school/${coach.url}" class="purpure-color right">Докладніше >></a>
            <br>
        </div>
    </c:forEach>
</c:if>

<c:if test="${ourHall.size() >  0}">
    <div class="padding-top border-bottom-sides">
        Наш зал
    </div>
    <c:forEach items="${ourHall}" var="coach">
        <div class="padding-top">
            <img src="/images/${coach.smallPhoto}">
            <br>
            <p class="side-text-align side-text-margin side-text-size">
                    ${coach.pre}
            </p>
            <a href="/school/${coach.url}" class="purpure-color right">Докладніше >></a>
            <br>
        </div>
    </c:forEach>
</c:if>
</body>
</html>
