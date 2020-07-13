<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Page editor</title>

</head>
<body>

<c:import url="../pagesPart/adminHeader.jsp"/>

<div class="container">

    <form method="post" action="/admin/pages/save" role="form" enctype="multipart/form-data">

        <ul class="nav nav-tabs" id="myTab" role="tablist">
            <li class="nav-item" role="presentation">
                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home"
                   aria-selected="true">Налаштування сторінки</a>
            </li>
            <li class="nav-item" role="presentation">
                <a class="nav-link" id="photos-tab" data-toggle="tab" href="#photos" role="tab"
                   aria-controls="photos" aria-selected="false">Фотографії</a>
            </li>
            <li class="nav-item" role="presentation">
                <a class="nav-link" id="text-tab" data-toggle="tab" href="#text" role="tab"
                   aria-controls="text" aria-selected="false">Текст</a>
            </li>
            <li class="nav-item" role="presentation">
                <a class="nav-link" id="seo-tab" data-toggle="tab" href="#seo" role="tab" aria-controls="seo"
                   aria-selected="false">SEO</a>
            </li>
        </ul>

        <div class="tab-content" id="myTabContent">
            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                <div class="row">
                    <div class="col-6">URL</div>
                    <div class="col-6"><input type="text" name="url" maxlength="100" size="50" value="${page.url}">
                        <input name="id" value="${page.id}" type="hidden">
                        <input name="smallPhoto" value="${page.smallPhoto}" type="hidden">
                        <input name="mainPhoto" value="${page.mainPhoto}" type="hidden">
                    </div>
                    <div class="col-6">Заголовок</div>
                    <div class="col-6"><input type="text" name="shortTitle" maxlength="100" size="50"
                                              value="${page.shortTitle}"></div>
                    <div class="col-6">Текст</div>
                    <div class="col-6"><select name="pageCategory.id">
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
                    </select></div>
                    <div class="col-6">Показувати на головній сторінці</div>
                    <div class="col-6"><input id="showOnIndex" type="checkbox" name="showOnIndex"
                                              <c:if test="${page.showOnIndex}">checked</c:if>/></div>
                    <div class="col-6"><label for="enable">Видалити</label></div>
                    <div class="col-6">
                        <input id="enable" type="checkbox" name="deleted"
                               <c:if test="${page.deleted}">checked</c:if>/></div>
                </div>
            </div>
            <div class="tab-pane fade" id="photos" role="tabpanel" aria-labelledby="profile-tab">
                <div class="row">
                    <div class="col-12" style="height: 20px;"></div>
                    <div class="col-6">Головне фото статті</div>
                    <div class="col-6"><img src="/images/page/${page.id}/900x200/${page.mainPhoto}"
                                            style="width: 100%;"/>
                        <label for="uploadFileMain">Виберіть фото</label>
                        <input id="uploadFileMain" type="file" name="mainPhotoHtml"
                               class="form-control"/></div>
                    <div class="col-12" style="height: 20px;"></div>
                    <div class="col-6">Фото для головної сторінці</div>
                    <div class="col-6"><img src="/images/page/${page.id}/300x350/${page.smallPhoto}"/>
                        <label for="uploadFile">Виберіть фото</label>
                        <input id="uploadFile" type="file" name="indexPhotoHtml"
                               class="form-control"/></div>
                    <div class="col-12" style="height: 20px;"></div>
                    <div class="col-12">Фото для статті</div>
                    <div class="col-12">
                        <label for="uploadFileText">Виберіть фото</label>
                        <input id="uploadFileText" type="file" name="textPhotoHtml" multiple
                               class="form-control"/>

                        <div class="container">
                            <div class="row">
                                <div class="col-12" style="height: 20px;"></div>
                                <c:forEach items="${page.innerPagesPhotos}" var="inPhoto">
                                    <div class="col-6">
                                        <img src="/images/page/${page.id}/300x300/${inPhoto.photoName}"
                                             style="width: 150px;">
                                    </div>
                                    <div class="col-6">/images/page/${page.id}/300x300/${inPhoto.photoName}</div>
                                    <div class="col-12" style="height: 20px;"></div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="col-6"></div>
                    <div class="col-6"></div>
                </div>
            </div>
            <div class="tab-pane fade" id="text" role="tabpanel" aria-labelledby="profile-tab">
                <div class="row">
                    <div class="col-12">
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
                </div>
            </div>
            <div class="tab-pane fade" id="seo" role="tabpanel" aria-labelledby="seo-tab">
                <div class="row">
                    <div class="col-6">Заголовок SEO</div>
                    <div class="col-6"><input type="text" name="title" maxlength="100" size="50" value="${page.title}">
                    </div>
                    <div class="col-6">Опис SEO</div>
                    <div class="col-6"><input type="text" name="description" maxlength="100" size="50"
                                              value="${page.description}"></div>
                    <div class="col-6">Ключові слова SEO</div>
                    <div class="col-6"><input type="text" name="keyWords" maxlength="100" size="50"
                                              value="${page.keyWords}"></div>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-12">
                <p>
                    <input type="submit" value="Зберегти">
                    <input type="reset" value="Відміна" onclick="location.href='/admin/'">
                </p>

            </div>
        </div>
    </form>
</div>
</body>
</html>
