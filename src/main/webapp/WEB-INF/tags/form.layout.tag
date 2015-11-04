<%@ tag description="Home page" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8" />
    <title>${title}</title>
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
    <link href="<c:url value='/assets/skins/all.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/css/libs/bootstrap.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/css/libs/bootflat.min.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/css/libs/bootstrap-table.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/css/style.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/css/libs/prism.css' />" rel="stylesheet">
    <link href="<c:url value='/assets/css/admin.css' />" rel="stylesheet">
    <!-- END THEME STYLES -->

</head>
<body class="sonata-bc skin-black fixed">

<div class="navbar navbar-default navbar-static-top" role="navigation">
    <t:header.layout> </t:header.layout>
</div>


<!-- BEGIN CORE PLUGINS -->
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

<script src="<c:url value='/assets/js/libs/jquery-1.11.1.min.js' />"></script>
<script src="<c:url value='/assets/js/libs/underscore-min.js' />"></script>
<script src="<c:url value='/assets/js/libs/moment.js' />"></script>
<script src="<c:url value='/assets/js/libs/bootstrap.min.js' />"></script>
<script src="<c:url value='/assets/js/libs/bootstrap-datetimepicker.min.js' />"></script>
<script src="<c:url value='/assets/js/libs/icheck.js' />"></script>
<script src="<c:url value='/assets/js/libs/jquery.fs.selecter.min.js' />"></script>
<script src="<c:url value='/assets/js/libs/jquery.fs.stepper.min.js' />"></script>
<script src="<c:url value='/assets/js/libs/prism.js' />"></script>
<script src="<c:url value='/assets/js/libs/bootstrap-table.js' />"></script>
<script src="<c:url value='/assets/js/scripts.js' />"></script>
<!-- END PAGE LEVEL SCRIPTS -->

<jsp:doBody/>

</body>
</html>

