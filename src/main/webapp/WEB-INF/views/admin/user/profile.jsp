<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<t:base.layout>

		<c:if test="${!empty user}">

                        <!-- BEGIN PAGE CONTENT-->
                        <div class="row margin-top-20">
                            <div class="col-md-12">
                                <!-- BEGIN PROFILE SIDEBAR -->
                                <div class="profile-sidebar">
                                    <!-- PORTLET MAIN -->
                                    <div class="portlet light">
                                        <div>
                                            <h4 class="profile-desc-title">About ${user.firstName} ${user.lastName}</h4>
                                            <div class="margin-top-20 profile-desc-link">
                                                <span class="profile-desc-text"> ${user.username}</span>
                                            </div>
                                            <div class="margin-top-20 profile-desc-link">
                                                <span class="profile-desc-text"> ${user.email}</span>
                                            </div>
                                            <div class="margin-top-20 profile-desc-link">
                                                <span class="profile-desc-text"> ${user.company.name}</span>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- END PORTLET MAIN -->
                                </div>
                                <!-- END BEGIN PROFILE SIDEBAR -->
                            </div>
                        </div>
                        <!-- END PAGE CONTENT-->

		</c:if>

</t:base.layout>