<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:login.layout>

    <div class="container">
        <div class="row">
            <div class="col-sm-4 col-sm-offset-2 welcomeblock">
                Welcome to the SFI Program Participant<br>
                Form<br>
                Please login to continue
            </div>
            <div class="col-sm-4 contentblock">
                <div class="tipcontent">
                    <c:url var="loginUrl" value="/login" />
                    <form action="${loginUrl}" method="post" class="login-form">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

                    <br>
                    <div class="form-group">
                        <label>Username (email address)</label>
                        <input type="text" id="username" name="username" required="required" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" id="password" name="password" required="required" class="form-control"/>
                    </div>

                    <div class="form-group">
                        <a href="#">Forgot password?</a>
                        <%--<a href="{{ path('fos_user_resetting_request') }}">Forgot password?</a>--%>
                        <button type="submit" class="btn btn-success">Login</button>
                    </div>

                    <%--{% if error %}--%>
                    <%--<p>{{ error.messageKey|trans(error.messageData, 'security') }}</p>--%>
                    <%--{% endif %}--%>

                    <%--{#<p>#}--%>
                    <%--{#A new password has been sent to the email address you provided. Once logged in you can change your password in your Profile.#}--%>
                    <%--{#</p>#}--%>

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

                    </form>
                </div>
            </div>
        </div>
    </div>

</t:login.layout>