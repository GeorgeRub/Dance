<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap4/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap4/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="/css/bootstrap4/bootstrap.css"/>
    <link rel="stylesheet" href="/css/main.css"/>
</head>
<body>
<img src="/images/dance_flag.png" class="d-none d-sm-block height-4 fixed-left">
<img src="/images/dance_flag.png" class="d-none d-md-block height-3 fixed-left">
<img src="/images/dance_flag.png" class="d-none d-lg-block height-2 fixed-left">
<img src="/images/dance_flag.png" class="d-none d-xl-block height-1 fixed-left">
<img src="/images/dance_flag_up.png" class="d-none d-sm-block height-4 fixed-right">
<img src="/images/dance_flag_up.png" class="d-none d-md-block height-3 fixed-right">
<img src="/images/dance_flag_up.png" class="d-none d-lg-block height-2 fixed-right">
<img src="/images/dance_flag_up.png" class="d-none d-xl-block height-1 fixed-right">
<div class="container" style="height: 20%">
    <div class="row align-items-end" style="border-bottom:2px solid #e580ad; z-index: 1 ">
        <div class="col-4">
            <a href="/">
                <img src="/images/logo_dance.png" style="height: 125px">
            </a>
        </div>
        <div class="col-4 align-self-end text-center" style="padding-bottom: 15px; color: #e580ad;">
            ${page.title}
        </div>
        <div class="col-4">
            <div class="row">
                <div class="col-12 align-content-end text-right" style="margin-bottom: 15px">
                    <span style="color: #e580ad; font-size: 20px">${phone}</span>
                    <br>
                    <span>${address}</span>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-12 text-center">
            <a href="/school/sport-dance" class="button" style="padding-right: 20px">Спортивно-бальні танці</a>
            <a href="/school/stretching" class="button" style="padding-right: 20px">Стретчінг</a>
            <a href="/school/eastern-dance" class="button">Східні танці</a>
        </div>
    </div>
</div>

</body>
</html>
