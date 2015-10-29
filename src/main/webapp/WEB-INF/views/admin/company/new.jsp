<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<t:base.layout>

		<form:form method="POST" action="new?${_csrf.parameterName}=${_csrf.token}" modelAttribute="company" class="form-horizontal" enctype="multipart/form-data">
			<table>
				<tr>
					<td>
						Company Name:
					</td>
					<td>
						<form:input type="text" path="name" id="name" itemLabel="name" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						Area Unit:
					</td>
					<td>
						<form:select path="areaUnit.id">
							<form:options items="${areaUnities}" itemValue="id" itemLabel="shortCode" />
						</form:select>
					</td>
				</tr>
				<tr>
					<td>
						Company Logo:
					</td>
					<td>
						<input type="file" name="file"/>
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