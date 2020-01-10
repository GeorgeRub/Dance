<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${page.title}</title>
    <meta name="description" content="${page.description}">
    <meta name="keywords" content="${page.keyWords}">
    <link rel="stylesheet" href="/css/carousel/carousel.css"/>
</head>
<body>
<c:import url="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-2 text-center shadow sides">
            <c:import url="leftSide.jsp"/>
        </div>
        <div class="col-7">
            <div>
                ${page.text}
            </div>
        </div>
        <div class="col-2 text-center shadow sides">
            <c:import url="rightSide.jsp"/>
        </div>
        <div class="col-1 ">
            <c:import url="social.jsp"/>
        </div>
    </div>
</div>
<br>
<div class="container">
    <div id="carouselExample" class="carouselPrograms carousel slide" data-ride="carousel" data-interval="false">
        <div class="carousel-inner row w-100 mx-auto" role="listbox">

            <c:forEach items="${video}" var="v">
                <div class="carousel-item col-md-4  active">
                    <div class="panel panel-default">
                        <div class="panel-thumbnail">
                            <a href="#" title="image 1" class="thumb">
                                <iframe width="300" height="200" src="${v.url}"
                                        frameborder="0"
                                        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
                                        allowfullscreen></iframe>
                            </a>
                        </div>
                    </div>
                </div>
            </c:forEach>



            <a class="carousel-control-prev" href="#carouselExample" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next text-faded" href="#carouselExample" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>

        </div>
    </div>
</div>
<br>
<script type="text/javascript" src="/js/carousel/carousel.js"></script>
</body>
</html>
