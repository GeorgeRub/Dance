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
    <img src="/images/dance-grey-couple.jpg" style="width: 100%; padding: 0px">
</div>
<div class="container">
    <div class="row">
        <div class="col-12" >
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
            </div>
        </div>
    </div>
</div>

</body>
</html>
