<%@ tag description="Login page" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<!-- BEGIN HEAD -->
<head>
    <title>${title}</title>

    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
    <link href="<c:url value='/assets/global/plugins/font-awesome/css/font-awesome.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/simple-line-icons/simple-line-icons.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/bootstrap/css/bootstrap.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/uniform/css/uniform.default.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css' />" rel="stylesheet">
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL STYLES -->
    <link href="<c:url value='/assets/global/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/global/plugins/fullcalendar/fullcalendar.min.css' />" rel="stylesheet">
    <!-- END PAGE LEVEL SCRIPTS -->
    <!-- BEGIN PAGE STYLES -->
    <link href="<c:url value='/assets/admin/pages/css/tasks.css' />" rel="stylesheet">
    <!-- END PAGE STYLES -->
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
<body class="page-header-fixed page-quick-sidebar-over-content page-sidebar-closed-hide-logo page-container-bg-solid">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
<!-- BEGIN HEADER INNER -->
<div class="page-header-inner">
<!-- BEGIN LOGO -->
<div class="page-logo">
    <a href="index.html">
        <%--<img src="../../assets/admin/layout/img/logo.png" alt="logo" class="logo-default"/>--%>
    </a>
    <div class="menu-toggler sidebar-toggler hide">
    </div>
</div>
<!-- END LOGO -->
<!-- BEGIN RESPONSIVE MENU TOGGLER -->
<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
</a>
<!-- END RESPONSIVE MENU TOGGLER -->
<!-- BEGIN TOP NAVIGATION MENU -->
<div class="top-menu">
<ul class="nav navbar-nav pull-right">
<!-- BEGIN USER LOGIN DROPDOWN -->
<li class="dropdown dropdown-user">
    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
        <%--<img alt="" class="img-circle" src="../../assets/admin/layout/img/avatar3_small.jpg"/>--%>
					<span class="username username-hide-on-mobile">
                        ${pageContext.request.userPrincipal.name}
                    </span>
        <i class="fa fa-angle-down"></i>
    </a>
    <ul class="dropdown-menu dropdown-menu-default">
        <li>
            <a href="<c:url value='/admin/user/profile/${pageContext.request.userPrincipal.name}'/>">
                <i class="icon-user"></i> My Profile </a>
        </li>
        <li>
            <a href="<c:url value='/logout'/>">
                <i class="icon-key"></i> Log Out </a>
        </li>
    </ul>
</li>
<!-- END USER LOGIN DROPDOWN -->
<!-- BEGIN QUICK SIDEBAR TOGGLER -->
<li class="dropdown dropdown-quick-sidebar-toggler">
    <a href="<c:url value='/logout'/>" class="dropdown-toggle">
        <i class="icon-logout"></i>
    </a>
</li>
<!-- END QUICK SIDEBAR TOGGLER -->
</ul>
</div>
<!-- END TOP NAVIGATION MENU -->
</div>
<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
<div class="page-sidebar navbar-collapse collapse">
<!-- BEGIN SIDEBAR MENU -->
<ul class="page-sidebar-menu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
<li class="sidebar-toggler-wrapper">
    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
    <div class="sidebar-toggler">
    </div>
    <!-- END SIDEBAR TOGGLER BUTTON -->
</li>
<li class="sidebar-search-wrapper">
    <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
    <form class="sidebar-search " action="extra_search.html" method="POST">
        <a href="javascript:;" class="remove">
            <i class="icon-close"></i>
        </a>
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                <a href="javascript:;" class="btn submit"><i class="icon-magnifier"></i></a>
                </span>
        </div>
    </form>
    <!-- END RESPONSIVE QUICK SEARCH FORM -->
</li>
<li class="start active open">
    <a href="javascript:;">
        <i class="fa fa-user"></i>
        <span class="title">Users</span>
        <span class="selected"></span>
        <span class="arrow open"></span>
    </a>
    <ul class="sub-menu">
        <li>
            <a href="<c:url value='/admin/user/list'/>"> <i class="fa fa-user"></i>User List</a>
        </li>
        <li>
            <a href="<c:url value='/admin/user/new'/>"> <i class="fa fa-user"></i>User Add</a>
        </li>
        <li>
            <a href="<c:url value='/admin/company/list'/>"> <i class="fa fa-share-alt-square"></i>Company List</a>
        </li>
        <li>
            <a href="<c:url value='/admin/company/new'/>"> <i class="fa fa-share-alt-square"></i>Company Add</a>
        </li>
        <li>
            <a href="<c:url value='/admin/area/unit/list'/>"> <i class="fa fa-share-alt-square"></i>Area List</a>
        </li>
        <li>
            <a href="<c:url value='/admin/area/unit/new'/>"> <i class="fa fa-share-alt-square"></i>Area Add</a>
        </li>
    </ul>
</li>
</ul>
<!-- END SIDEBAR MENU -->
</div>
</div>
<!-- END SIDEBAR -->
<!-- BEGIN CONTENT -->
<%--  --%>
<div class="page-content-wrapper">
    <div class="page-content">
        <jsp:doBody/>
    </div>
</div>
<%--  --%>
<!-- END CONTENT -->
</div>
<!-- END CONTAINER -->

<!-- BEGIN FOOTER -->
<div class="page-footer">
    <div class="page-footer-inner">
        2014 &copy; Metronic
    </div>
    <div class="scroll-to-top">
        <i class="icon-arrow-up"></i>
    </div>
</div>
<!-- END FOOTER -->

<!-- BEGIN CORE PLUGINS -->
<script src="<c:url value="/assets/global/plugins/jquery.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/jquery-migrate.min.js" />"></script>
<!-- END CORE PLUGINS -->

<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="<c:url value="/assets/global/plugins/jquery-ui/jquery-ui.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/bootstrap/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/jquery.blockui.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/jquery.cokie.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/uniform/jquery.uniform.min.js" />"></script>
<script src="<c:url value="/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" />"></script>
<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="<c:url value="/assets/global/scripts/metronic.js" />"></script>
<script src="<c:url value="/assets/admin/layout/scripts/layout.js" />"></script>
<script src="<c:url value="/assets/admin/pages/scripts/index.js" />"></script>
<!-- END PAGE LEVEL SCRIPTS -->

<script type="text/javascript">
    jQuery(document).ready(function() {
        Metronic.init(); // init metronic core componets
        Layout.init(); // init layout
        Index.init();
    });
</script>

</body>
</html>
