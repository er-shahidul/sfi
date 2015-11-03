<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<t:admin.base.layout>

    <div class="navbar navbar-default navbar-static-top" role="navigation">
        <t:header.layout> </t:header.layout>
    </div>

    <div id="wrapper">
        <div class="container">

            <div class="formContainer">
                <div class="formContent">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="sidebarmenu">
                                <t:admin.left.menu> </t:admin.left.menu>
                            </div>
                        </div>
                        <div class="col-sm-9">
                            <section class="content-header">

                            </section>

                            <section class="content">
                                <div class="sonata-ba-content">

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="cms-block cms-block-element">

                                                <div class="box">
                                                    <div class="box-header">
                                                        <h3 class="box-title" style="font-size: 24px;font-weight: normal;">Entities</h3>
                                                    </div>
                                                    <div class="box-body">
                                                        <table class="table table-hover">
                                                            <tbody>
                                                            <tr>
                                                                <td class="sonata-ba-list-label alignright" style="font-weight: bold;" width="40%">
                                                                    User
                                                                </td>
                                                                <td>
                                                                    <div class="btn-group">
                                                                        <a class="btn-link btn-flat" href="<c:url value='/admin/user/new'/>">
                                                                            <i class="fa fa-plus-circle"></i>
                                                                            Add new
                                                                        </a>
                                                                        <a class="btn-link btn-flat" href="<c:url value='/admin/user/list'/>">
                                                                            <i class="glyphicon glyphicon-list"></i>
                                                                            List
                                                                        </a>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td class="sonata-ba-list-label alignright" style="font-weight: bold;" width="40%">
                                                                    Company
                                                                </td>
                                                                <td>
                                                                    <div class="btn-group">
                                                                        <a class="btn-link btn-flat" href="<c:url value='/admin/company/new'/>">
                                                                            <i class="fa fa-plus-circle"></i>
                                                                            Add new
                                                                        </a>
                                                                        <a class="btn-link btn-flat" href="<c:url value='/admin/company/list'/>">
                                                                            <i class="glyphicon glyphicon-list"></i>
                                                                            List</a>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>

                                                <div class="box">
                                                    <div class="box-header">
                                                        <h3 class="box-title" style="font-size: 24px;font-weight: normal;">Vocabulary</h3>
                                                    </div>
                                                    <div class="box-body">
                                                        <table class="table table-hover">
                                                            <tbody>
                                                            <tr>
                                                                <td class="sonata-ba-list-label alignright" style="font-weight: bold;" width="40%">
                                                                    Area Unit
                                                                </td>
                                                                <td>
                                                                    <div class="btn-group">
                                                                        <a class="btn-link btn-flat" href="<c:url value='/admin/area/unit/new'/>">
                                                                            <i class="fa fa-plus-circle"></i>
                                                                            Add new
                                                                        </a>
                                                                        <a class="btn-link btn-flat" href="<c:url value='/admin/area/unit/list'/>">
                                                                            <i class="glyphicon glyphicon-list"></i>
                                                                            List
                                                                        </a>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
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