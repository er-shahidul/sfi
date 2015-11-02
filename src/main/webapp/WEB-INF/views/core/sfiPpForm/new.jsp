<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<t:base.layout>

		<form:form method="POST" action="new?${_csrf.parameterName}=${_csrf.token}" modelAttribute="sfiPpForm" class="form-horizontal">
			<table>
				<tr>
					<td>
						company:
					</td>
					<td>
						<form:select path="company.id">
							<form:options items="${companies}" itemValue="id" itemLabel="name" />
						</form:select>
					</td>
				</tr>
				<%--<tr>--%>
					<%--<td>--%>
						<%--status:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:input type="text" path="status" id="status" itemLabel="status" class="form-control"/>--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr>--%>
					<%--<td>--%>
						<%--isSaved:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:input type="text" path="isSaved" id="isSaved" itemLabel="isSaved" class="form-control"/>--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr>--%>
					<%--<td>--%>
						<%--isComplete:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:input type="text" path="isComplete" id="isComplete" itemLabel="isComplete" class="form-control"/>--%>
					<%--</td>--%>
				<%--</tr>--%>
				<tr>
					<td>
						cs1CompanyWebsite:
					</td>
					<td>
						<form:input type="text" path="cs1CompanyWebsite" id="cs1CompanyWebsite" itemLabel="cs1CompanyWebsite" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1NumberEmployeesUSA:
					</td>
					<td>
						<form:input type="text" path="cs1NumberEmployeesUSA" id="cs1NumberEmployeesUSA" itemLabel="cs1NumberEmployeesUSA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1NumberEmployeesCA:
					</td>
					<td>
						<form:input type="text" path="cs1NumberEmployeesCA" id="cs1NumberEmployeesCA" itemLabel="cs1NumberEmployeesCA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1NumberEmployeesOther:
					</td>
					<td>
						<form:input type="text" path="cs1NumberEmployeesOther" id="cs1NumberEmployeesOther" itemLabel="cs1NumberEmployeesOther" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1CompanyDesc:
					</td>
					<td>
						<form:input type="text" path="cs1CompanyDesc" id="cs1CompanyDesc" itemLabel="cs1CompanyDesc" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1OwnsMngLandsInUSA:
					</td>
					<td>
						<form:input type="text" path="cs1OwnsMngLandsInUSA" id="cs1OwnsMngLandsInUSA" itemLabel="cs1OwnsMngLandsInUSA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1OwnsMngLandsInCA:
					</td>
					<td>
						<form:input type="text" path="cs1OwnsMngLandsInCA" id="cs1OwnsMngLandsInCA" itemLabel="cs1OwnsMngLandsInCA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1OwnsMngLandsInOther:
					</td>
					<td>
						<form:input type="text" path="cs1OwnsMngLandsInOther" id="cs1OwnsMngLandsInOther" itemLabel="cs1OwnsMngLandsInOther" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasPrimaryOperMillsYards:
					</td>
					<td>
						<form:input type="text" path="cs1HasPrimaryOperMillsYards" id="cs1HasPrimaryOperMillsYards" itemLabel="cs1HasPrimaryOperMillsYards" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasPrimaryOperMillsYardsInUSA:
					</td>
					<td>
						<form:input type="text" path="cs1HasPrimaryOperMillsYardsInUSA" id="cs1HasPrimaryOperMillsYardsInUSA" itemLabel="cs1HasPrimaryOperMillsYardsInUSA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasPrimaryOperMillsYardsInCA:
					</td>
					<td>
						<form:input type="text" path="cs1HasPrimaryOperMillsYardsInCA" id="cs1HasPrimaryOperMillsYardsInCA" itemLabel="cs1HasPrimaryOperMillsYardsInCA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasPrimaryOperMillsYardsInOther:
					</td>
					<td>
						<form:input type="text" path="cs1HasPrimaryOperMillsYardsInOther" id="cs1HasPrimaryOperMillsYardsInOther" itemLabel="cs1HasPrimaryOperMillsYardsInOther" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasSecondaryOperMillsYards:
					</td>
					<td>
						<form:input type="text" path="cs1HasSecondaryOperMillsYards" id="cs1HasSecondaryOperMillsYards" itemLabel="cs1HasSecondaryOperMillsYards" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasSecondaryOperMillsYardsInUSA:
					</td>
					<td>
						<form:input type="text" path="cs1HasSecondaryOperMillsYardsInUSA" id="cs1HasSecondaryOperMillsYardsInUSA" itemLabel="cs1HasSecondaryOperMillsYardsInUSA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasSecondaryOperMillsYardsInCA:
					</td>
					<td>
						<form:input type="text" path="cs1HasSecondaryOperMillsYardsInCA" id="cs1HasSecondaryOperMillsYardsInCA" itemLabel="cs1HasSecondaryOperMillsYardsInCA" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasSecondaryOperMillsYardsInOther:
					</td>
					<td>
						<form:input type="text" path="cs1HasSecondaryOperMillsYardsInOther" id="cs1HasSecondaryOperMillsYardsInOther" itemLabel="cs1HasSecondaryOperMillsYardsInOther" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1HasOperationsYards:
					</td>
					<td>
						<form:input type="text" path="cs1HasOperationsYards" id="cs1HasOperationsYards" itemLabel="cs1HasOperationsYards" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1OperatesInUsa:
					</td>
					<td>
						<form:input type="text" path="cs1OperatesInUsa" id="cs1OperatesInUsa" itemLabel="cs1OperatesInUsa" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1OperatesInCanada:
					</td>
					<td>
						<form:input type="text" path="cs1OperatesInCanada" id="cs1OperatesInCanada" itemLabel="cs1OperatesInCanada" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						cs1OperatesInOthers:
					</td>
					<td>
						<form:input type="text" path="cs1OperatesInOthers" id="cs1OperatesInOthers" itemLabel="cs1OperatesInOthers" class="form-control"/>
					</td>
				</tr>
				<%--<tr>--%>
					<%--<td>--%>
						<%--sfiPpFormCs1OwnsMngLandsOtherCountries:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:select path="sfiPpFormCs1OwnsMngLandsOtherCountries.id">--%>
							<%--<form:options items="${sfiPpFormCs1OwnsMngLandsOtherCountries1}" itemValue="id" itemLabel="country" />--%>
						<%--</form:select>--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr>--%>
					<%--<td>--%>
						<%--sfiPpFormCs1PrimaryOperMillsYardsOtherCountries:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:select path="sfiPpFormCs1PrimaryOperMillsYardsOtherCountries.id">--%>
							<%--<form:options items="${sfiPpFormCs1PrimaryOperMillsYardsOtherCountries1}" itemValue="id" itemLabel="country" />--%>
						<%--</form:select>--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr>--%>
					<%--<td>--%>
						<%--sfiPpFormCs1SecondaryOperMillsYardsOtherCountries:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:select path="sfiPpFormCs1SecondaryOperMillsYardsOtherCountries.id">--%>
							<%--<form:options items="${sfiPpFormCs1SecondaryOperMillsYardsOtherCountries1}" itemValue="id" itemLabel="country" />--%>
						<%--</form:select>--%>
					<%--</td>--%>
				<%--</tr>--%>
				<%--<tr>--%>
					<%--<td>--%>
						<%--sfiPpFormCs1SellsOtherCountries:--%>
					<%--</td>--%>
					<%--<td>--%>
						<%--<form:select path="sfiPpFormCs1SellsOtherCountries.id">--%>
							<%--<form:options items="${sfiPpFormCs1SellsOtherCountries1}" itemValue="id" itemLabel="country" />--%>
						<%--</form:select>--%>
					<%--</td>--%>
				<%--</tr>--%>
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