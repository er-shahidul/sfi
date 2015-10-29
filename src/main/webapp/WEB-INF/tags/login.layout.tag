<%@ tag description="Login page" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <title>${title}</title>

<!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
    <link href="<c:url value='/assets/global/plugins/font-awesome/css/font-awesome.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/simple-line-icons/simple-line-icons.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/bootstrap/css/bootstrap.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/uniform/css/uniform.default.css' />" rel="stylesheet">
    <!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
    <link href="<c:url value='/assets/global/plugins/select2/select2.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/admin/pages/css/login3.css' />" rel="stylesheet">
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
    <link href="<c:url value='/assets/global/css/components.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/css/plugins.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/admin/layout/css/layout.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/admin/layout/css/themes/darkblue.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/admin/layout/css/custom.css' />" rel="stylesheet">
<!-- END THEME STYLES -->
<%--<link rel="shortcut icon" href="<c:url value='favicon.ico' />"/>--%>

</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
<div class="menu-toggler sidebar-toggler">
</div>
<!-- END SIDEBAR TOGGLER BUTTON -->
<div class="logo">
    <a href="#">
        <img src="<c:url value='/assets/admin/layout/img/logo-big.png' />" alt=""/>
    </a>
</div>
<%--  --%>

    <jsp:doBody/>

<%--  --%>
<div class="copyright">
    2014 &copy; Metronic.
</div>

<!-- BEGIN CORE PLUGINS -->
<script src="<c:url value='/assets/global/plugins/jquery.min.js' />"></script>
<script src="<c:url value='/assets/global/plugins/jquery-migrate.min.js' />"></script>
<script src="<c:url value='/assets/global/plugins/bootstrap/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/assets/global/plugins/jquery.blockui.min.js' />"></script>
<script src="<c:url value='/assets/global/plugins/jquery.cokie.min.js' />"></script>
<script src="<c:url value='/assets/global/plugins/uniform/jquery.uniform.min.js' />"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="<c:url value='/assets/global/plugins/jquery-validation/js/jquery.validate.min.js' />"></script>
<script src="<c:url value='/assets/global/plugins/select2/select2.min.js' />"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="<c:url value='/assets/global/scripts/metronic.js' />"></script>
<script src="<c:url value='/assets/admin/layout/scripts/layout.js' />"></script>
<script src="<c:url value='/assets/admin/pages/scripts/login.js' />"></script>
<!-- END PAGE LEVEL SCRIPTS -->

<script type="text/javascript">
    jQuery(document).ready(function() {
        Metronic.init();
        Layout.init();
        Login.init();
    });
</script>

</body>
</html>
