<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${page.title}</title>
</head>
<body>
<c:import url="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-2 text-center shadow" style="opacity: 75%; background-color: white">
            <c:import url="leftSide.jsp"/>
        </div>
        <div class="col-7">
            <div>
                ${page.text}
            </div>
        </div>
        <div class="col-2 text-center shadow" style="opacity: 75%; background-color: white">
            <c:import url="rightSide.jsp"/>
        </div>
        <div class="col-1" style="opacity: 75%"><c:import url="social.jsp"/></div>
    </div>
</div>
</body>
</html>
