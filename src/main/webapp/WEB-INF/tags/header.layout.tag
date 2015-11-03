<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="container">
    <div class="navbar-header">
        <a class="navbar-brand" href="/admin">
            <img id="logo" src="/images/sfi-logo.png" alt="SFI">
        </a>
    </div>

    <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-left">
            <li>
                <a href="#" class="tab {% if app.request.attributes.get('_route') == 'sfi_home' %}activeTab{% endif %}">
                    Home
                </a>
            </li>
            <li>
                <a href="#" class="tab {% if app.request.attributes.get('_route') == 'sfi_admin_forms' %}activeTab{% endif %}">
                    Program Participant Survey
                </a>
            </li>
        </ul>

        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown active">
                <a href="index.html" class="dropdown-toggle" data-toggle="dropdown">
                    2014 Program Participant Survey
                </a>
            </li>
        </ul>

        <div id="settings"
             data-placement="bottom" data-toggle="popover" data-container="body" type="button" data-original-title="" data-trigger="click"

        <sec:authorize var="admin" access="hasAnyRole('ADMIN', 'SUPER_ADMIN')"/>
            <c:choose>
                <c:when test="${admin}">
                     data-content="<a href=&quot;/sfi/admin/user/profile/${pageContext.request.userPrincipal.name}&quot; class=&quot;settings-popup icon1&quot;><div id='proImg'></div><span>Profile</span></a><a href=&quot;/sfi/logout&quot; class=&quot;settings-popup icon2&quot;><div id='logImg'></div><span>Logout</span></a>" data-trigger="click">
                    <span class="glyphicon glyphicon-cog pull-right" aria-hidden="true"></span>
                    <label>LOGGED IN AS</label>
                    <p>${pageContext.request.userPrincipal.name}</p>
                </c:when>
                <c:otherwise>
                    data-content="<a href=&quot;login&quot; class=&quot;settings-popup icon3&quot;><div id='logIn'><span class='glyphicon glyphicon-log-in'></span></div><span>Login</span></a>" style="width:22px;" >
                    <span class="glyphicon glyphicon-cog pull-right" aria-hidden="true"></span>
                </c:otherwise>
            </c:choose>

        </div>

    </div>
</div>