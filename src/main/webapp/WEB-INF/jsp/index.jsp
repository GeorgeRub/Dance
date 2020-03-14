<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX</title>
    <%--    <meta name="description" content="${page.description}">--%>
    <%--    <meta name="keywords" content="${page.keyWords}">--%>
</head>
<body class="bg">
<c:import url="header.jsp"/>
<div class="container-fluid">
    <img src="/images/dance-grey-couple.jpg" class="main-index-image">
</div>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div class="row">
                <div class="col-6"><h1>ПРО НАС</h1></div>
                <div class="col-6"></div>
            </div>
        </div>
        <div class="col-12">
            <div class="row">
                <div class="col-6"><h1>НАПРЯМКИ</h1></div>
                <div class="col-6">
                </div>
            </div>
        </div>
        <div class="col-12">
            <c:forEach items="${ways}" var="way">
                <div class="col-3">
                    <div>
                        <img src="/images/page/${way.smallPhoto}">
                    </div>
                    <div>
                        <h2>${way.shortTitle}</h2>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="col-12">
            <div class="row">
                <div class="col-6"><h1>ТРЕНЕРИ</h1></div>
                <div class="col-6"></div>
                <c:forEach items="${coaches}" var="coach">
                    <div class="col-12 coach-index-background">
                        <div class="row align-items-end">
                            <div class="col-3">
                                <img src="/images/page/${coach.id}/200x200/${coach.smallPhoto}">
                            </div>
                            <div class="col-7">
                                <h3>${coach.shortTitle}</h3>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="col-12">
            <div class="row">
                <div class="col-6"><h1>ЗАЛ</h1></div>
                <div class="col-6">
                </div>
            </div>
        </div>
        <jsp:include page="pagesParts/carousel.jsp"></jsp:include>
        <div class="col-12">
            <div class="row">
                <div class="col-4"><h1>КОНТАКТИ</h1></div>
                <div class="col-4">
                    <span class="contacts">${phone}</span>
                </div>
                <div class="col-4">
                    <span class="contacts">${address}</span>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="pagesParts/mapPosition.jsp"></jsp:include>

</body>
</html>
