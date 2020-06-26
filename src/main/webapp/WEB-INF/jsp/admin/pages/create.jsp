<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Page editor</title>

</head>
<body>
<c:import url="../pagesPart/adminHeader.jsp"/>
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
                        <td>Заголовок SEO</td>
                        <td><input type="text" name="title" maxlength="100" size="50" value="${page.title}"></td>
                    </tr>
                    <tr>
                        <td>Опис SEO</td>
                        <td><input type="text" name="description" maxlength="100" size="50" value="${page.description}">
                        </td>
                    </tr>
                    <tr>
                        <td>Ключові слова SEO</td>
                        <td><input type="text" name="keyWords" maxlength="100" size="50" value="${page.keyWords}"></td>
                    </tr>
                    <tr>
                        <td>Заголовок</td>
                        <td><input type="text" name="shortTitle" maxlength="100" size="50" value="${page.shortTitle}">
                        </td>
                    </tr>
                    <tr>
                        <td><label for="showOnIndex">Показувати на головній сторінці</label></td>
                        <td><input id="showOnIndex" type="checkbox" name="showOnIndex"
                                   <c:if test="${page.showOnIndex}">checked</c:if>/></td>
                    </tr>
                    <tr>
                        <td>
                            Головне фото статті
                        </td>
                        <td>
                            <img src="/images/page/${page.id}/900x200/${page.mainPhoto}"/>
                            <label for="uploadFileMain">Виберіть фото</label>
                            <input id="uploadFileMain" type="file" name="mainPhotoHtml"
                                   class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Фото для головної сторінці
                        </td>
                        <td>
                            <img src="/images/page/${page.id}/300x350/${page.smallPhoto}"/>
                            <label for="uploadFile">Виберіть фото</label>
                            <input id="uploadFile" type="file" name="indexPhotoHtml"
                                   class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Фото для статті
                        </td>
                        <td>
                            <label for="uploadFileText">Виберіть фото</label>multiple
                            <input id="uploadFileText" type="file" name="textPhotoHtml" multiple
                                   class="form-control"/>

                            <div class="container">
                                <div class="row">
                                    <c:forEach items="${page.innerPagesPhotos}" var="inPhoto">
                                        <div class="col-6">
                                            <img src="/images/page/${page.id}/300x300/${inPhoto.photoName}">
                                        </div>
                                        <div class="col-6">/images/page/${page.id}/300x300/${inPhoto.photoName}</div>
                                    </c:forEach>
                                </div>
                            </div>

                        </td>
                    </tr>
                    <tr>
                        <td>Текст</td>
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
                    <label for="enable">Видалити</label>
                    <input id="enable" type="checkbox" name="deleted"
                           <c:if test="${page.deleted}">checked</c:if>/>
                </div>
                <p>
                    <input type="submit" value="Зберегти">
                </p>
            </form>
        </div>
    </div>
</div>
</body>
</html>
