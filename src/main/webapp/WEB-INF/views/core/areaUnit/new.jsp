<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<t:base.layout>

		<form:form method="POST" action="new?${_csrf.parameterName}=${_csrf.token}" modelAttribute="areaUnit" class="form-horizontal" enctype="multipart/form-data">
			<table>
				<tr>
					<td>
						ShortCode:
					</td>
					<td>
						<form:input type="text" path="shortCode" id="shortCode" itemLabel="shortCode" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						Description:
					</td>
					<td>
						<form:input type="text" path="unitDescription" id="unitDescription" itemLabel="unitDescription" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>

					</td>
					<td>
						<input type="submit" id="submit" value="Save" />
					</td>
				</tr>
			</table>
		</form:form>

</t:base.layout>