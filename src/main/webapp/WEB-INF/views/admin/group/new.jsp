<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<t:base.layout>

    <div class="row">
        <div class="col-md-12">
            <!-- BEGIN VALIDATION STATES-->
            <div class="portlet box blue">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="fa fa-gift"></i>
                    </div>
                    <div class="tools">

                    </div>
                </div>
                <div class="portlet-body form">
                    <!-- BEGIN FORM-->
                    <form:form method="POST" modelAttribute="group" class="form-horizontal">
                    <form:input type="hidden" path="id" id="id"/>
                    <div class="form-body">
                        <div class="alert alert-danger display-hide">
                            <button class="close" data-close="alert"></button>
                            You have some form errors. Please check below.
                        </div>
                        <div class="alert alert-success display-hide">
                            <button class="close" data-close="alert"></button>
                            Your form validation is successful!
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3" for="role">Role<span class="required">
										* </span>
                            </label>
                            <div class="col-md-4">
                                <form:input type="text" path="role" id="role" itemLabel="role" class="form-control" />
                                <form:errors path="role" class="help-inline"/>
                            </div>
                        </div>

                    <div class="form-actions">
                        <div class="row">
                            <div class="col-md-offset-3 col-md-9">
                                <input type="submit" value="Save" class="btn green"/>
                            </div>
                        </div>
                    </div>
                </div>
                </form:form>
                <!-- END FORM-->
            </div>
        </div>
        <!-- END VALIDATION STATES-->
    </div>

</t:base.layout>
