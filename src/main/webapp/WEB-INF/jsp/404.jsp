<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>404</title>
    <%--<script src="/js/jquery/jquery-3.3.1.min.js" type="text/javascript"></script>--%>
    <%--<script src="/js/bootstrap.js" type="text/javascript"></script>--%>
    <%--<link href="/css/bootstrap.css" rel="stylesheet">--%>
    <%--<link href="/css/kroha.css" rel="stylesheet">--%>
</head>
<body>
<br>
<jsp:include page="header.jsp"></jsp:include>
<%--<c:import url="${elefant.url}/header/"></c:import>--%>
<%--<jsp:include page="menu.jsp"></jsp:include>--%>
<div class="container">
    <div class="row">
        <center>
            <br>
            <div>
                <img src="/images/images/404.png">
            </div>
            <br>
            <div>
                <button class="btn btn-primary" onclick="back()">Повернутися</button>
            </div>
        </center>
    </div>

</div>
<script>
    function back() {
        window.history.back();
    }
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>


