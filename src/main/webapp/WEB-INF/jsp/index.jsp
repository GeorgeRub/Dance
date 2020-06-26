<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="${page.description}">
    <meta name="keywords" content="${page.keyWords}">
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
                <div class="col-xl-12 col-sm-12 text-lg-left text-center"><h1>ПРО НАС</h1></div>
                <div class="col-lg-10 offset-lg-2 offset-sm-0">
                    <h4>А теперь внимание: к “нашим” вайфай-устройства в СТО раз более внимательны, чем к “всем
                        остальным”. То есть, эфир считается занятым, если мы услышали какой-то 802.11-фрейм на уровне
                        всего на 4 дБ лучше уровня шума — мы ооооочень вежливы к другим устройствам Wi-Fi! А все
                        остальные (всякие там Bluetooth, к примеру) помешают что-то передать только тогда, когда уровень
                        сигнала от них будет выше шума на 24 дБ!</h4>
                </div>
            </div>
        </div>
        <div class="col-12">
            <div class="row">
                <div class="col-xl-6 col-md-6 text-lg-left text-center"><h1>НАПРЯМКИ</h1></div>
                <div class="col-xl-6 col-md-6 text-lg-left text-center">
                    <h1 class="align-self-center">text</h1>
                </div>
            </div>
        </div>
        <div class="col-12">
            <c:forEach items="${directions}" var="direction">
                <div class="col-lg-3 col-sm-6 col-md-6 col-12">
                    <div>
                        <center>
                            <img src="/images/page/${direction.id}/200x200/${direction.smallPhoto}" style="height: 200px;">
                        </center>
                    </div>
                    <div>
                        <center>
                            <h2 style="font-size: 16px;">${direction.shortTitle}</h2>
                        </center>
                    </div>
                </div>
            </c:forEach>
        </div>

<%--        <div class="col-12">--%>
<%--            <div class="row">--%>
<%--                <div class="col-lg-3 col-sm-6 col-md-6 col-12">--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <img src="/images/design/Site/images/Latina_dance.jpg" style="height: 200px;">--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <h2 style="font-size: 16px;">Спортивно-бальні<br>(ДІТИ)</h2>--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-sm-6 col-md-6 col-12">--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <img src="/images/design/Site/images/Latina_dance.jpg" style="height: 200px;">--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <h2 style="font-size: 16px;">Латино-американськи</h2>--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-sm-6 col-md-6 col-12">--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <img src="/images/design/Site/images/Belly_dance.jpg" style="height: 200px;">--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <h2 style="font-size: 16px;">Східні</h2>--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-sm-6 col-md-6 col-12">--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <img src="/images/design/Site/images/Stretching.jpg" style="height: 200px;">--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                    <div>--%>
<%--                        <center>--%>
<%--                            <h2 style="font-size: 16px;">Стретчінг</h2>--%>
<%--                        </center>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--        </div>--%>

        <div class="col-12" style="margin-top: 20px;">
            <div class="row">
                <div class="col-xl-12 col-sm-12 text-lg-left text-center"><h1>ТРЕНЕРИ</h1></div>
                <div class="col-xl-12 col-sm-12 text-lg-left text-center"></div>
                <c:forEach items="${coaches}" var="coach">
                    <div class="col-12 coach-index-background">
                        <div class="row align-items-end">
                            <div class="col-md-3 col-sm-12">
                                <a href="/page/${coach.url}">
                                    <center>
                                        <picture>
                                            <source srcset="/images/page/${coach.id}/200x200/${coach.smallPhoto}"
                                                    media="(max-width: 768px)" style="width: 200px;">
                                            <img srcset="/images/page/${coach.id}/300x350/${coach.smallPhoto}" alt=""
                                                 style="width: 200px;">
                                        </picture>
                                    </center>
                                </a>
                            </div>
                            <div class="col-md-9 col-sm-12">
                                <a href="/page/${coach.url}">
                                        ${coach.shortTitle}
                                </a>

                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="col-12">
            <div class="row">
                <div class="col-xl-12 col-sm-12 text-lg-left text-center"><h1>ЗАЛ</h1></div>
            </div>
        </div>
        <jsp:include page="pagesParts/carousel.jsp"></jsp:include>
    </div>
</div>
<c:import url="pagesParts/footer.jsp"/>
<jsp:include page="pagesParts/mapPosition.jsp"></jsp:include>

</body>
</html>
