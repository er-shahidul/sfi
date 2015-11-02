<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:base.layout>

		<c:if test="${!empty user}">
            <!-- BEGIN SAMPLE TABLE PORTLET-->
            <div class="portlet box blue">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="fa fa-user"></i>
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
                                <th>
                                    Last Name
                                </th>
                                <th>
                                    Email
                                </th>
                                <th>
                                    Delete
                                </th>
                                <th>
                                    Update
                                </th>
                                <th>
                                    Edit Password
                                </th>
                                <th>
                                    Inactive/Active
                                </th>
                                <th>
                                    Details
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
                                    <c:out value="${user.firstName}" />
                                </td>
                                <td>
                                    <c:out value="${user.lastName}" />
                                </td>
                                <td>
                                    <c:out value="${user.email}" />
                                </td>
                                <td>
                                    <a href="<c:url value='/admin/user/delete?id=${user.id}' />">Delete</a>
                                </td>
                                <td>
                                    <a href="<c:url value='/admin/user/edit/${user.id}' />">Update</a>
                                </td>
                                <td>
                                    <a href="<c:url value='/admin/user/edit/password/${user.id}' />">Update Password</a>
                                </td>
                                <td>
                                    <c:choose>
                                        <c:when test="${user.enabled}">
                                            <a href="<c:url value='/admin/user/inactive/${user.id}' />">Inactive</a>
                                        </c:when>
                                        <c:otherwise>
                                            <a href="<c:url value='/admin/user/active/${user.id}' />">Active</a>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td>
                                    <a href="<c:url value='/admin/user/details/${user.id}' />">Details</a>
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