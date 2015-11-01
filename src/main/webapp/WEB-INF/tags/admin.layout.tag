<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:admin.base.layout>

    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="/admin">
                    <img id="logo" src="/images/sfi-logo.png" alt="SFI">
                </a>
            </div>

            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-left">
                    <li>
                        <a href="{{ path('sfi_home') }}" class="tab {% if app.request.attributes.get('_route') == 'sfi_home' %}activeTab{% endif %}">
                            Home
                        </a>
                    </li>
                    <li>
                        <a href="{{ path('sfi_admin_forms') }}" class="tab {% if app.request.attributes.get('_route') == 'sfi_admin_forms' %}activeTab{% endif %}">
                            Program Participant Survey
                        </a>
                    </li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown active">
                        <a href="index.html" class="dropdown-toggle" data-toggle="dropdown">
                            2014 Program Participant Survey
                        </a>
                    </li></ul>
                <div id="settings" data-placement="bottom" data-toggle="popover" data-container="body" type="button" data-original-title="" data-content="<a href=&quot;{{ url('sfi_profile') }}&quot; class=&quot;settings-popup icon1&quot;><div id='proImg'></div><span>Profile</span></a><a href=&quot;{{ url('fos_user_security_logout') }}&quot; class=&quot;settings-popup icon2&quot;><div id='logImg'></div><span>Logout</span></a>" data-trigger="click">
                    <span class="glyphicon glyphicon-cog pull-right" aria-hidden="true"></span>
                    <label>LOGGED IN AS</label>
                    <p>{{ app.user.name }}</p>
                </div>
            </div>
        </div>
    </div>

    <div id="wrapper">
        <jsp:doBody/>
    </div>

    <%--<script src="<c:url value='/assets/js/libs/angular.min.js' />"></script>--%>
    <%--<script src="<c:url value='/assets/js/libs/angular-ui-router.min.js' />"></script>--%>

</t:admin.base.layout>