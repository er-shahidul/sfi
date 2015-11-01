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
                    </li></ul>
                <div id="settings" data-placement="bottom" data-toggle="popover" data-container="body" type="button" data-original-title="" data-content="<a href=&quot;{{ url('sfi_profile') }}&quot; class=&quot;settings-popup icon1&quot;><div id='proImg'></div><span>Profile</span></a><a href=&quot;{{ url('fos_user_security_logout') }}&quot; class=&quot;settings-popup icon2&quot;><div id='logImg'></div><span>Logout</span></a>" data-trigger="click">
                    <span class="glyphicon glyphicon-cog pull-right" aria-hidden="true"></span>
                    <label>LOGGED IN AS</label>
                    <p>${pageContext.request.userPrincipal.name}</p>
                </div>
            </div>
        </div>
    </div>

    <div id="wrapper">
        <div class="container">

            <%--{% block sonata_breadcrumb %}--%>
            <%--{% if _breadcrumb is not empty or action is defined %}--%>
            <%--<div class="breadcrumb">--%>
                <%--{% if _breadcrumb is empty %}--%>
                <%--{% if action is defined %}--%>
                <%--{% for menu in admin.breadcrumbs(action) %}--%>
                <%--{% if not loop.last  %}--%>
                <%--{# Skipping first item to skip dashboard link #}--%>
                <%--{% if not loop.first  %} <span class="text-muted">/</span>--%>
                <%--{% if menu.uri is not empty %}--%>
                <%--<a href="{{ menu.uri }}">{{ menu.label|raw }}</a>--%>
                <%--{% else %}--%>
                <%--{{ menu.label }}--%>
                <%--{% endif %}--%>
                <%--{% endif %}--%>

                <%--{% else %}--%>
                <%--<span class="text-muted">/</span>--%>
                <%--{% if '\\Entity\\' in menu.name %} New--%>
                <%--{% else %} {{ menu.label }}--%>
                <%--{% endif %}--%>
                <%--{% endif %}--%>
                <%--{% endfor %}--%>
                <%--{% endif %}--%>
                <%--{% else %}--%>
                <%--{{ _breadcrumb|raw }}--%>
                <%--{% endif %}--%>
            <%--</div>--%>
            <%--{% endif %}--%>
            <%--{% endblock sonata_breadcrumb %}--%>

            <div class="formContainer">
                <div class="formContent">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="sidebarmenu">
                                <ul>
                                    <li {% if 'profile' == selected %}class="selected"{% endif %}>
                                    <a href="{{ url('sfi_profile') }}">My Profile</a>
                                    </li>
                                    {% if('ROLE_ADMIN' in app.user.roles) %}

                                    <li {% if 'admin_sfi_core_user_list' == selected
                                    or 'admin_sfi_core_user_create' ==selected %}class="selected"{% endif %}>
                                    <a href="{{ url('admin_sfi_core_user_list') }}">Manage Users</a>
                                    </li>
                                    <li {% if 'admin_sfi_core_company_list' == selected %}class="selected"{% endif %}>
                                    <a href="{{ url('admin_sfi_core_company_list') }}">Manage Companies</a>
                                    </li>
                                    <li {% if 'admin_sfi_core_areaunit_list' == selected %}class="selected"{% endif %}>
                                    <a href="{{ url('admin_sfi_core_areaunit_list') }}">Manage Area Units</a>
                                    </li>
                                    <li {% if 'forms' == selected %}class="selected"{% endif %}>
                                    <a href="{{ url('sfi_admin_forms') }}">Forms</a>
                                    </li>

                                    {% else %}
                                    <li {% if 'company' == selected %}class="selected"{% endif %}>
                                    <a href="{{ url('sfi_company') }}">Company Settings</a>
                                    </li>
                                    {% endif %}
                                    <li {% if 'privacy' == selected %}class="selected"{% endif %}><a href="{{ url('sfi_privacy') }}">Privacy Policy</a></li>
                                </ul>
                            </div>
                        </div>
                        <%--<div class="col-sm-9">--%>
                            <%--{% block sonata_page_content %}--%>
                            <%--<section class="content-header">--%>
                                <%--{% block sonata_page_content_header %}--%>
                                <%--{% block sonata_page_content_nav %}--%>
                                <%--{% if _tab_menu is not empty or _actions is not empty %}--%>
                                <%--<nav class="navbar navbar-default" role="navigation">--%>
                                    <%--{% block tab_menu_navbar_header %}--%>
                                    <%--{% if _navbar_title is not empty %}--%>
                                    <%--<div class="navbar-header">--%>
                                        <%--<span class="navbar-brand">{{ _navbar_title|raw }}</span>--%>
                                    <%--</div>--%>
                                    <%--{% endif %}--%>
                                    <%--{% endblock %}--%>
                                    <%--<div class="container-fluid">--%>
                                        <%--<div class="navbar-left">--%>
                                            <%--{% if _tab_menu is not empty %}--%>
                                            <%--{{ _tab_menu|raw }}--%>
                                            <%--{% endif %}--%>
                                        <%--</div>--%>

                                        <%--{% if _actions|replace({ '<li>': '', '</li>': '' })|trim is not empty %}--%>
                                        <%--<ul class="nav navbar-nav navbar-right">--%>
                                            <%--<li class="dropdown sonata-actions">--%>
                                                <%--<a href="#" class="dropdown-toggle" data-toggle="dropdown">{{ 'link_actions'|trans({}, 'SonataAdminBundle') }} <b class="caret"></b></a>--%>
                                                <%--<ul class="dropdown-menu" role="menu">--%>
                                                    <%--{{ _actions|raw }}--%>
                                                <%--</ul>--%>
                                            <%--</li>--%>
                                        <%--</ul>--%>
                                        <%--{% endif %}--%>
                                    <%--</div>--%>
                                <%--</nav>--%>
                                <%--{% endif %}--%>
                                <%--{% endblock sonata_page_content_nav %}--%>

                                <%--{% endblock sonata_page_content_header %}--%>
                            <%--</section>--%>

                            <%--<section class="content">--%>
                                <%--{% block sonata_admin_content %}--%>

                                <%--{% block notice %}--%>
                                <%--{% include 'SonataCoreBundle:FlashMessage:render.html.twig' %}--%>
                                <%--{% endblock notice %}--%>

                                <%--{% if _preview is not empty %}--%>
                                <%--<div class="sonata-ba-preview">{{ _preview|raw }}</div>--%>
                                <%--{% endif %}--%>

                                <%--{% if _content is not empty %}--%>
                                <%--<div class="sonata-ba-content">{{ _content|raw }}</div>--%>
                                <%--{% endif %}--%>

                                <%--{% if _show is not empty %}--%>
                                <%--<div class="sonata-ba-show">{{ _show|raw }}</div>--%>
                                <%--{% endif %}--%>

                                <%--{% if _form is not empty %}--%>
                                <%--<div class="sonata-ba-form">{{ _form|raw }}</div>--%>
                                <%--{% endif %}--%>

                                <%--{% if _list_table is not empty or _list_filters is not empty %}--%>
                                <%--<div class="row">--%>
                                    <%--<div class="sonata-ba-list {% if _list_filters|trim %}col-md-10{% else %}col-md-12{% endif %}">--%>
                                        <%--{{ _list_table|raw }}--%>
                                    <%--</div>--%>

                                    <%--{% if _list_filters|trim %}--%>
                                    <%--<div class="sonata-ba-filter col-md-2">--%>
                                        <%--{{ _list_filters|raw }}--%>
                                    <%--</div>--%>
                                    <%--{% endif %}--%>
                                <%--</div>--%>
                                <%--{% endif %}--%>
                                <%--{% endblock sonata_admin_content %}--%>
                            <%--</section>--%>
                            <%--{% endblock sonata_page_content %}--%>
                        <%--</div>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="wrapper">
        <jsp:doBody/>
    </div>

    <script src="<c:url value='/assets/js/libs/angular.min.js' />"></script>
    <script src="<c:url value='/assets/js/libs/angular-ui-router.min.js' />"></script>

</t:admin.base.layout>