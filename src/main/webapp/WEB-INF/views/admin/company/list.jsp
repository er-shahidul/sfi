<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:base.layout>

		<c:if test="${!empty companies}">
            <!-- BEGIN SAMPLE TABLE PORTLET-->
            <div class="portlet box blue">
                <div class="portlet-title">
                    <div class="caption">

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
                                    Company Name
                                </th>
                                <th>
                                    Area Unit
                                </th>
                                <th>
                                    Update
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${companies}" var="company" varStatus="loopCounter" >
                                <tr>
                                    <td>
                                        <c:out value="${loopCounter.count}"/>
                                    </td>
                                    <td>
                                        <c:out value="${company.name}" />
                                    </td>
                                    <td>
                                        <c:out value="${company.areaUnit.shortCode}" />
                                    </td>
                                    <td>
                                        <a href="<c:url value='/admin/company/edit/${company.id}' />">Update</a>
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