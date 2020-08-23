<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 3/9/2020
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script type="text/javascript" src="/js/carousel/carousel.js"></script>--%>
<%--<link rel="stylesheet" href="/css/carousel/carousel.css"/>--%>

<link href="css/slick/slick.css" rel="stylesheet"/>
<link href="css/slick/slickTheme.css" rel="stylesheet"/>
<div class="container">
    <div class="index-carousel">
        <div><img src="/images/carousel/1.jpg" alt="" style="width: 100%;"></div>
        <div><img src="/images/carousel/2.1.jpg" alt="" style="width: 100%;"></div>
        <div><img src="/images/carousel/2.JPG" alt="" style="width: 100%;"></div>
        <div><img src="/images/carousel/3.jpg" alt="" style="width: 100%;"></div>
        <div><img src="/images/carousel/4.1.jpg" alt="" style="width: 100%;"></div>
        <div><img src="/images/carousel/4.jpg" alt="" style="width: 100%;"></div>
    </div>
</div>

<script src="js/slick/slick.js" type="text/javascript"></script>
<script>
    $(document).ready(function (){
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