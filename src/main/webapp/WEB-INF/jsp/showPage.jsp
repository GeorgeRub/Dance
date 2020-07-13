<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${page.title}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="${page.description}">
    <meta name="keywords" content="${page.keyWords}">
    <style>
        .back-button {
            position: fixed; /* Абсолютное позиционирование */
            bottom: 5%; /* Положение от нижнего края */
            right: 5%;
            height: 80px;
            width: 80px;
            background-color: rgba(247, 247, 247, 0.5);
            line-height: 1px;
        }
    </style>
</head>
<body class="bg">
<c:import url="header.jsp"/>
<c:if test="${page.mainPhoto ne null and page.mainPhoto.length() > 2}">
    <div class="container">
        <picture>
            <source srcset="/images/page/${page.id}/300x350/${page.mainPhoto}"
                    media="(max-width: 768px)" style="width: 100%;">
            <img src="/images/page/${page.id}/900x200/${page.mainPhoto}" style="width: 100%;"
                 alt="${direction.shortTitle}">
        </picture>
    </div>
</c:if>

<div class="container" style="font-family: Roboto">
    ${page.text}
</div>

<div class="back-button" style="color: white; border-radius: 50%;">
    <a href="/">
        <img src="/images/arrow-left-50-1.png" style="width: 100%; padding: 10px">
    </a>
</div>

</body>
</html>
