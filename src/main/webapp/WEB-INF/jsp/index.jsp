<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="${page.description}">
    <meta name="keywords" content="${page.keyWords}">
    <script src="js/angular/angular.min.js" type="text/javascript"></script>
    <script src="js/angular/angular-mask.js" type="text/javascript"></script>
    <script src="js/angular/angular-sanitize.min.js" type="text/javascript"></script>
    <script src="js/controllers/index/freeLesson.js" type="text/javascript"></script>

</head>
<body class="bg">
<c:import url="header.jsp"/>
<div class="container-fluid">
    <img src="/images/dance-grey-couple.jpg" loading="lazy" class="main-index-image">
</div>
<div class="container">
    <div class="row">
        <div class="col-12" style="margin-bottom: 20px; margin-top: 20px;">
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
        <div class="col-12" style="margin-bottom: 20px;">
            <div class="row">
                <div class="col-xl-6 col-md-6 text-lg-left text-center"><h1>НАПРЯМКИ</h1></div>
                <div class="col-xl-6 col-md-6 text-lg-left text-center" style="background-color: #BE1C4D;">
                    <center>
                        <button type="button" class="btn btn-primary" data-toggle="modal"
                                data-target="#testLesson"
                                style="background-color: #BE1C4D; border: solid #BE1C4D 1px; width: 100%; height: 100%;">
                            <h1 class="align-self-center" style="color: white;">
                                ПРОБНЕ ЗАНЯТТЯ
                            </h1>
                        </button>
                    </center>
                </div>
            </div>
        </div>
        <div class="col-12" style="margin-bottom: 20px;">
            <div class="row">
                <c:forEach items="${directions}" var="direction">
                    <div class="col-lg-3 col-sm-6 col-md-6">
                        <div>
                            <center>
                                <a href="/page/${direction.url}">
                                    <source srcset="/images/page/${direction.id}/300x350/${direction.mainPhoto}"
                                            media="(max-width: 768px)" style="width: 100%;">
                                    <img src="/images/page/${direction.id}/150x200/${direction.smallPhoto}"
                                         style="height: 200px;" alt="${direction.shortTitle} " loading="lazy">
                                </a>
                            </center>
                        </div>
                        <div>
                            <center>
                                <a href="/page/${direction.url}">
                                    <h2 style="font-size: 16px;">${direction.shortTitle}</h2>
                                </a>
                            </center>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="col-12" style="margin-top: 20px;">
            <div class="row">
                <div class="col-xl-12 col-sm-12 text-center"><h1>ТРЕНЕРИ</h1></div>
                <div class="col-xl-12 col-sm-12 text-lg-left text-center"></div>
                <c:forEach items="${coaches}" var="coach">
                    <div class="offset-xl-2 col-xl-3 offset-sm-1 col-sm-10 coach-index-background">
                        <div>
                            <a href="/page/${coach.url}">
                                <center>
                                    <img srcset="/images/page/${coach.id}/300x350/${coach.smallPhoto}" alt=""
                                         style="width: 100%;">
                                </center>
                            </a>
                        </div>
                        <div class="text-center">
                            <a href="/page/${coach.url}">
                                <h3>${coach.shortTitle}</h3>
                            </a>
                        </div>
                            <%--                        <div class="row align-items-end">--%>
                            <%--                            <div class="col-md-3 col-sm-12">--%>
                            <%--                                <a href="/page/${coach.url}">--%>
                            <%--                                    <center>--%>
                            <%--                                        <picture>--%>
                            <%--                                            <source srcset="/images/page/${coach.id}/300x350/${coach.smallPhoto}"--%>
                            <%--                                                    media="(max-width: 768px)" style="width: 200px;">--%>
                            <%--                                            <img srcset="/images/page/${coach.id}/300x350/${coach.smallPhoto}" alt=""--%>
                            <%--                                                 style="width: 200px;">--%>
                            <%--                                        </picture>--%>
                            <%--                                    </center>--%>
                            <%--                                </a>--%>
                            <%--                            </div>--%>
                            <%--                            <div class="col-md-9 col-sm-12 text-center align-self-center">--%>
                            <%--                                <a href="/page/${coach.url}">--%>
                            <%--                                    <h3>${coach.shortTitle}</h3>--%>
                            <%--                                    <h4 class="text-left">--%>
                            <%--                                            ${coach.preTitle}--%>
                            <%--                                    </h4>--%>
                            <%--                                </a>--%>
                            <%--                            </div>--%>
                            <%--                        </div>--%>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="col-12">
            <div class="row">
                <div class="col-xl-12 col-sm-12 text-lg-left text-center"><h1>ЗАЛ</h1></div>
            </div>
        </div>
        <%--        <jsp:include page="pagesParts/carousel.jsp"></jsp:include>--%>
        <link href="css/slick/slick.css" rel="stylesheet"/>
        <link href="css/slick/slickTheme.css" rel="stylesheet"/>
        <div class="container">
            <div class="index-carousel">
                <c:forEach items="${carouselImages}" var="image">
                    <div><img src="/images/carousel/${image.imageName}" alt="" style="width: 100%;"></div>
                </c:forEach>
            </div>
        </div>

        <script src="js/slick/slick.js" type="text/javascript"></script>
        <script>
            $(document).ready(function () {
                $('.index-carousel').slick({
                    // lazyLoad: 'ondemand',
                    slidesToShow: 4,
                    slidesToScroll: 1,
                    autoplay: true,
                    autoplaySpeed: 2000,
                    responsive: [
                        {
                            breakpoint: 1000,
                            settings: {
                                slidesToShow: 4,
                                slidesToScroll: 1
                            }
                        },
                        {
                            breakpoint: 800,
                            settings: {
                                slidesToShow: 2,
                                slidesToScroll: 1
                            }
                        },
                        {
                            breakpoint: 500,
                            settings: {
                                slidesToShow: 1,
                                slidesToScroll: 1
                            }
                        }
                    ]
                });
            });
        </script>
    </div>
</div>
<c:import url="pagesParts/footer.jsp"/>
<jsp:include page="pagesParts/mapPosition.jsp"></jsp:include>

<div class="modal fade" id="testLesson" tabindex="-1" role="dialog" aria-labelledby="testLessonTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document" ng-app="freeLesson">
        <div class="modal-content" ng-controller="freeLessonController">
            <form name="freeLessonForm">
                <div class="modal-header">
                    <h5 class="modal-title" id="testLessonTitle">Запис на пробне заняття.</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div ng-disabled="errorMessage.length == 0">
                        <span ng-bind-html="errorMessage"></span>
                    </div>
                    <div ng-disabled="successMessage.length == 0">
                        <span ng-bind-html="successMessage"></span>
                    </div>
                    <div>
                        <br>
                        <label for="input-free-lesson-name">Ваше ім'я</label>
                        <input id="input-free-lesson-name" type="text" class="input-free-lesson" ng-model="ngName"
                               required>
                        <label for="input-free-lesson-phone">Номер мобільного телефону</label>
                        <input id="input-free-lesson-phone" type="text" class="input-free-lesson"
                               ng-model="ngPhoneNumber" mask="+99 (999) 999 99 99" required>

                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn " ng-click="sendQuery()"
                            style="background-color: #BE1C4D; color: white;" ng-disabled="freeLessonForm.$invalid">
                        Відправити заявку
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
