<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap4/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/bootstrap4/bootstrap.bundle.min.js"></script>
    <script type="text/javascript" src="/js/cke/ckeditor.js"></script>
    <link rel="stylesheet" href="/css/bootstrap4/bootstrap.css"/>
</head>
<body>
<div class="container-fluid" style="border-bottom: solid 1px lightgrey; margin-bottom: 20px;">
    <nav class="navbar navbar-light navbar-expand-lg bg-white clean-navbar aos-init aos-animate" data-aos="fade">
        <div class="container"><a class="navbar-brand logo" href="/admin/">Brand</a><button data-toggle="collapse" class="navbar-toggler collapsed" data-target="#navcol-1" aria-expanded="false"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="navbar-collapse collapse" id="navcol-1" style="">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="${pageContext.request.contextPath}/admin/">Головна сторінка</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="${pageContext.request.contextPath}/admin/pages/list">Список всіх сторінок</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="${pageContext.request.contextPath}/admin/callback/list/new">Заявки на передзвін</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="${pageContext.request.contextPath}/admin/carousel/list">Карусель</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
</body>
</html>