<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<t:base.layout>

	<h1>Dear <strong>${user}</strong>, You are not authorized to access this page.</h1>
	<br/>
	<a href="<c:url value="/home" />">Go to home</a>  
	<sec:authorize access="hasRole('USER') or hasRole('ADMIN') or hasRole('DBA')">
           OR  <a href="<c:url value="/logout" />">Logout</a>
    </sec:authorize>
	
</t:base.layout>