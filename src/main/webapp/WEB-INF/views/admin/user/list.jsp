<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<t:admin.base.layout>

    <sec:authorize var="admin" access="hasAnyRole('ADMIN', 'SUPER_ADMIN')"/>

    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <t:header.layout> </t:header.layout>
    </div>

    <div id="wrapper">
        <div class="container">
            <div class="formContainer">
                <div class="breadcrumb">
                    <span class="text-muted">/</span>
                    User List
                </div>
                <div class="formContent">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="sidebarmenu">
                                <t:admin.left.menu> </t:admin.left.menu>
                            </div>
                        </div>
                        <div class="col-sm-9">
                            <section class="content-header">
                                <section class="content-header">
                                    <nav class="navbar navbar-default" role="navigation">
                                        <div class="container-fluid">
                                            <div class="navbar-left">
                                            </div>

                                            <ul class="nav navbar-nav navbar-right">
                                                <li class="dropdown sonata-actions">
                                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Actions <b class="caret"></b></a>
                                                    <ul class="dropdown-menu" role="menu">
                                                        <li>
                                                            <a class="sonata-action-element" style="color: #080808;" href="<c:url value='/admin/user/new' />">
                                                            <i class="fa fa-plus-circle"></i>
                                                            Add new</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </div>
                                    </nav>
                                </section>
                            </section>

                            <section class="content">
                                <div class="sonata-ba-content">

                                    <div class="row">
                                        <div class="col-md-10">
                                            <table class="table table-striped table-bordered table-hover">
                                                <thead>

                                                <tr>
                                                    <th>
                                                        Sl
                                                    </th>
                                                    <th>
                                                        Name
                                                    </th>
                                                    <th>
                                                        Email
                                                    </th>
                                                    <th>
                                                        Company
                                                    </th>
                                                    <th>
                                                        Admin User
                                                    </th>
                                                    <th>
                                                        Enabled
                                                    </th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${user}" var="user" varStatus="loopCounter" >
                                                    <tr>
                                                        <td>
                                                            <c:out value="${loopCounter.count}"/>
                                                        </td>
                                                        <td>
                                                            <c:out value="${user.username}" />
                                                        </td>
                                                        <td>
                                                            <c:out value="${user.email}" />
                                                        </td>
                                                        <td>
                                                            <c:out value="${user.company.name}" />
                                                        </td>
                                                        <td>
                                                            <c:choose>
                                                                <c:when test="${admin}">
                                                                    <span class="label label-success">yes</span>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="label label-danger">no</span>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </td>
                                                        <td>
                                                            <c:choose>
                                                                <c:when test="${user.enabled}">
                                                                    <span class="label label-success">yes</span>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <span class="label label-danger">no</span>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>

                                        <div class="col-md-2">
                                        </div>
                                    </div>
                                </div>

                            </section>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="<c:url value='/assets/js/libs/angular.min.js' />"></script>
    <script src="<c:url value='/assets/js/libs/angular-ui-router.min.js' />"></script>

</t:admin.base.layout>