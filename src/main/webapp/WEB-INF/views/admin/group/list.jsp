<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:base.layout>

    <c:if test="${!empty groups}">
        <!-- BEGIN SAMPLE TABLE PORTLET-->
        <div class="portlet box blue">
            <div class="portlet-title">
                <div class="caption">
                    <i class="fa fa-users"></i>
                </div>
                <div class="tools">

                </div>
            </div>
            <div class="portlet-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>
                                Sl
                            </th>
                            <th>
                                Username
                            </th>
                            <th>
                                First Name
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${groups}" var="group">
                            <tr>
                                <td>
                                    #
                                </td>
                                <td>
                                    <c:out value="${group.role}" />
                                </td>
                                <td>
                                    <a href="<c:url value='/group/delete?id=${group.id}' />">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!-- END SAMPLE TABLE PORTLET-->

    </c:if>

</t:base.layout>