<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 7/24/2020
  Time: 6:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Перегляд заявки на передзвін ${query.name} - ${query.phone}</title>
    <script src="${pageContext.request.contextPath}/js/angular/angular.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/controllers/admin/callBack/editController.js"
            type="text/javascript"></script>
</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
<div class="container" ng-app="editcallBack">
    <div class="row" ng-controller="editController">
        <div class="col-12">
            <h2>${query.name} - ${query.phone} - ${query.createdDate()} - ${query.createdTime()}</h2>
        </div>
        <div ng-disabled="callBackMessage.length == 0">
            <h2 ng-bind-html="callBackMessage" style="color: lawngreen"></h2>
        </div>
        <div class="col-12">
            <input type="hidden" value="${query.talking}" id="talking">
            <input type="hidden" value="${query.id}" id="callBackId">
            <textarea ng-model="answer">

            </textarea>
            <br>
            <span >${query.user.name}</span>
            <br>
            <button ng-click="saveAnswer()">Зберегти</button>
        </div>
    </div>
</div>
</body>
</html>
