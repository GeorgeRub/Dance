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
<div class="container" style="background-color: white">
    <div class="row align-items-end" style="z-index: 1 ">
        <div class="col-lg-4 align-content-lg-center">
            <a href="/">
                <picture>
                    <source srcset="/images/logo_dance.jpg"
                            media="(max-width: 768px)" style="width: 100%;">
                    <img src="/images/logo_dance.jpg" style="height: 125px" class="mx-auto d-block">
                </picture>


            </a>
        </div>
        <div class="offset-lg-4 col-lg-4">
            <div class="row">
                <div class="col-12 align-content-end text-center" style="margin-bottom: 15px">
                    <span style="color: #e580ad; font-size: 20px">${phone}</span>
                    <br>
                    <span>${address}</span>
                    <br>
                    <img src="/images/in.png">
                    <img src="/images/vb.png">
                    <img src="/images/fb.png">
                </div>
            </div>
        </div>
        <div class="col-12 align-self-end text-center" style="padding-bottom: 15px; color: #e580ad;">
            ${page.title}
        </div>
    </div>

</div>

</body>
</html>
