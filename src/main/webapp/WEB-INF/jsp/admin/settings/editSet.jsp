<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 3/13/2020
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit set</title>
</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
<form method="post" action="/admin/settings/save" role="form" enctype="text/plain">
    <div class="container">
        <div class="row">

            <div class="col-4">
                <div class="row">
                    <div class="col-6">
                        Ім'я
                    </div>
                    <div class="col-6">
                        <input name="" value="${setting.name}">
                    </div>
                </div>
            </div>

            <div class="col-4">
                <div class="row">
                    <div class="col-6">
                        Ім'я
                    </div>
                    <div class="col-6">
                        <input name="" value="${setting.val}">
                    </div>
                </div>
            </div>

            <div class="col-12">

            </div>

            <c:if test="${setting.indexPhotoWrapper.size() > 0}">
                <c:forEach items="${setting.indexPhotoWrapper}" var="ipw">
                    <div class="col-4">
                        <div class="row">
                            <div class="col-6">
                                height
                            </div>
                            <div class="col-6">
                                <input name="" value="${ipw.height}">
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="row">
                            <div class="col-6">
                                width
                            </div>
                            <div class="col-6">
                                <input name="" value="${ipw.width}">
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="row">
                            <div class="col-6">
                                suffix
                            </div>
                            <div class="col-6">
                                <input name="" value="${ipw.suffix}">
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </c:if>


        </div>
    </div>
</form>
</body>
</html>
