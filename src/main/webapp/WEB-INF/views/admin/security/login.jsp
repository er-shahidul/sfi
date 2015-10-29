<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:login.layout>

<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <c:url var="loginUrl" value="/login" />
    <form action="${loginUrl}" method="post" class="login-form">

        <h3 class="form-title">Login to your account</h3>

        <c:if test="${param.error != null}">
            <div class="alert alert-danger">
                <p>Invalid username and password.</p>
            </div>
        </c:if>
        <c:if test="${param.logout != null}">
            <div class="alert alert-success">
                <p>You have been logged out successfully.</p>
            </div>
        </c:if>

        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9" for="username">Username</label>
            <div class="input-icon">
                <i class="fa fa-user"></i>
                <input class="form-control form-control-solid placeholder-no-fix" type="text" id="username" autocomplete="off" placeholder="Username" name="username" required/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9" for="password">Password</label>
            <div class="input-icon">
                <i class="fa fa-lock"></i>
                <input class="form-control form-control-solid placeholder-no-fix" id="password" type="password" autocomplete="off" placeholder="Password" name="password" required/>
            </div>
        </div>

        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}" />

        <div class="form-actions">
            <label class="checkbox">
                <input type="checkbox" name="remember" value="1"/> Remember me </label>
                <input type="submit" class="btn green-haze pull-right" value="Login">
        </div>

    </form>
    <!-- END LOGIN FORM -->
</div>

</t:login.layout>