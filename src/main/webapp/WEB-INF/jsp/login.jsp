<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Dance | Log in</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="css/bootstrap4/bootstrap.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Google Font -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition login-page">
<c:import url="header.jsp"/>
<div class="login-box">

    <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>

        <form action="${contextPath}/login" method="post">
            <div class="form-group ${error != null ? 'has-error' : ''}">
                <span>${message}</span>
                <div class="form-group has-feedback">
                    <input name="username" type="email" class="form-control" placeholder="Username"
                           autofocus="true"/>
                    <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input name="password" type="password" class="form-control" placeholder="Password"/>
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>

                <span>${error}</span>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
            </div>
        </form>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 3 -->
<%--<script src="../../bower_components/jquery/dist/jquery.min.js"></script>--%>
<!-- Bootstrap 3.3.7 -->
<%--<script src="../../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>--%>
<script src="js/bootstrap4/bootstrap.min.js"></script>
<!-- iCheck -->
<%--<script src="../../plugins/iCheck/icheck.min.js"></script>--%>
<%--<script>--%>
<%--    $(function () {--%>
<%--        $('input').iCheck({--%>
<%--            checkboxClass: 'icheckbox_square-blue',--%>
<%--            radioClass: 'iradio_square-blue',--%>
<%--            increaseArea: '20%' /* optional */--%>
<%--        });--%>
<%--    });--%>
<%--</script>--%>
</body>
</html>
