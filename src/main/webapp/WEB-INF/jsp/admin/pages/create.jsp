<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Page editor</title>

</head>
<body>
<c:import url="../adminHeader.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-12">
            <form method="post" action="/admin/pages/save" role="form" enctype="multipart/form-data">
                <table>

                    <tr>
                        <td>URL</td>
                        <td><input type="text" name="url" maxlength="100" size="50" value="${page.url}">
                        <input name="id" value="${page.id}" type="hidden">
                        <input name="smallPhoto" value="${page.smallPhoto}" type="hidden">
                        </td>
                    </tr>
                    <tr>
                        <td>Title</td>
                        <td><input type="text" name="title" maxlength="100" size="50" value="${page.title}"></td>
                    </tr>
                    <tr>
                        <td>Description</td>
                        <td><input type="text" name="description" maxlength="100" size="50" value="${page.description}"></td>
                    </tr>
                    <tr>
                        <td>Key words</td>
                        <td><input type="text" name="keyWords" maxlength="100" size="50" value="${page.keyWords}"></td>
                    </tr>
                    <tr>
                        <td>Text</td>
                        <td>
                            <select name="pageCategory.id">
                                <option value="0">----SELECT ROLE----</option>
                                <c:forEach var="cat" items="${categories}">
                                    <option value="${cat.id}"
                                            <c:if test="${page.pageCategory != null}">
                                                <c:if test="${cat.id == page.pageCategory.id}">
                                                    selected
                                                </c:if>
                                            </c:if>
                                    >${cat.ukrName}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
                <div>
                    <p>
                                <textarea name="text" id="textBody">
                    <c:if test="${page.text != null}">
                        ${page.text}
                    </c:if>
                        </textarea>
                        <script>
                            CKEDITOR.replace('textBody');
                        </script>
                    </p>
                </div>
                <div>
                    <label for="enable">Delite</label>
                    <input id="enable" type="checkbox" name="deleted"
                           <c:if test="${page.deleted}">checked</c:if>
                </div>
                <p>
                    <input type="submit" value="Create">
                </p>
            </form>
        </div>
    </div>
</div>
</body>
</html>
