<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<c:if test="${news.size() > 0}">
    <div class="padding-top border-bottom-sides">
        Новини
    </div>
    <c:forEach items="${news}" var="coach">
        <div class="padding-top">
            <p class="side-text-align side-text-bold side-text-margin side-text-size">
                    ${coach.pre}
            </p>
            <img src="/images/${coach.smallPhoto}">
            <br>
            <a href="/school/${coach.url}" class="purpure-color right">Докладніше >></a>
            <br>
        </div>
    </c:forEach>
</c:if>
<c:if test="${inspirations.size() > 0}">
    <div class="padding-top border-bottom-sides">
        Натхнення
    </div>
    <c:forEach items="${inspirations}" var="coach">
        <div class="padding-top">
            <a href="/school/${coach.url}" class="purpure-color">
                <img src="/images/${coach.smallPhoto}">
            </a>
            <br>
        </div>
    </c:forEach>
</c:if>
<c:if test="${costReq.size() > 0}">
    <div class="padding-top border-bottom-sides">
        Вимоги до костюмів
    </div>
    <div>
        <c:forEach items="${costReq}" var="coach">
            <div class="padding-top">
                <a href="/school/${coach.url}" class="purpure-color">
                    <img src="/images/${coach.smallPhoto}">
                </a>
            </div>
        </c:forEach>
    </div>
</c:if>
</body>
</html>
