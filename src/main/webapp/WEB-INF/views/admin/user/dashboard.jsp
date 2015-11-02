<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sec:authentication var="role" property="principal.authorities"/>

<t:admin.layout>
    <%--${user.company.name}--%>
    <%--${role}--%>
    ${sfiPpForm}

    <%--status.name = ${sfiPpForm.status.name} <br/>--%>
    <%--company.name= ${sfiPpForm.company.name} <br/>--%>
    <%--complete= ${sfiPpForm.complete} <br/>--%>
    <%--createdBy.username= ${sfiPpForm.createdBy.username} <br/>--%>
    <%--&lt;%&ndash;isSaved= ${sfiPpForm.isSaved}  <br/> &ndash;%&gt;--%>
    <%--&lt;%&ndash;isComplete= ${sfiPpForm.isComplete} <br/> &ndash;%&gt;--%>

    <%--cs1CompanyWebsite= ${sfiPpForm.cs1CompanyWebsite} <br/>--%>
    <%--cs1NumberEmployeesUSA= ${sfiPpForm.cs1NumberEmployeesUSA} <br/>--%>
    <%--cs1NumberEmployeesCA= ${sfiPpForm.cs1NumberEmployeesCA} <br/>--%>
    <%--cs1NumberEmployeesOther= ${sfiPpForm.cs1NumberEmployeesOther} <br/>--%>
    <%--cs1CompanyDesc= ${sfiPpForm.cs1CompanyDesc} <br/>--%>
    <%--cs1OwnsMngLandsInUSA= ${sfiPpForm.cs1OwnsMngLandsInUSA} <br/>--%>
    <%--cs1OwnsMngLandsInCA= ${sfiPpForm.cs1OwnsMngLandsInCA} <br/>--%>
    <%--cs1OwnsMngLandsInOther= ${sfiPpForm.cs1OwnsMngLandsInOther} <br/>--%>

    <%--cs1HasPrimaryOperMillsYards= ${sfiPpForm.cs1HasPrimaryOperMillsYards} <br/>--%>
    <%--cs1HasPrimaryOperMillsYardsInUSA= ${sfiPpForm.cs1HasPrimaryOperMillsYardsInUSA} <br/>--%>
    <%--cs1HasPrimaryOperMillsYardsInCA= ${sfiPpForm.cs1HasPrimaryOperMillsYardsInCA} <br/>--%>
    <%--cs1HasPrimaryOperMillsYardsInOther= ${sfiPpForm.cs1HasPrimaryOperMillsYardsInOther} <br/>--%>

    <%--cs1HasSecondaryOperMillsYards= ${sfiPpForm.cs1HasSecondaryOperMillsYards} <br/>--%>
    <%--cs1HasSecondaryOperMillsYardsInUSA= ${sfiPpForm.cs1HasSecondaryOperMillsYardsInUSA} <br/>--%>
    <%--cs1HasSecondaryOperMillsYardsInCA= ${sfiPpForm.cs1HasSecondaryOperMillsYardsInCA} <br/>--%>
    <%--cs1HasSecondaryOperMillsYardsInOther= ${sfiPpForm.cs1HasSecondaryOperMillsYardsInOther} <br/>--%>

    <%--cs1HasOperationsYards= ${sfiPpForm.cs1HasOperationsYards} <br/>--%>
    <%--cs1OperatesInUsa= ${sfiPpForm.cs1OperatesInUsa} <br/>--%>
    <%--cs1OperatesInCanada= ${sfiPpForm.cs1OperatesInCanada} <br/>--%>
    <%--cs1OperatesInOthers= ${sfiPpForm.cs1OperatesInOthers} <br/>--%>

    <%--sfiPpFormCs1OwnsMngLandsOtherCountries= ${sfiPpForm.sfiPpFormCs1OwnsMngLandsOtherCountries} <br/>--%>
    <%--sfiPpFormCs1PrimaryOperMillsYardsOtherCountries= ${sfiPpForm.sfiPpFormCs1PrimaryOperMillsYardsOtherCountries} <br/> --%>
    <%--sfiPpFormCs1SecondaryOperMillsYardsOtherCountries= ${sfiPpForm.sfiPpFormCs1SecondaryOperMillsYardsOtherCountries} <br/> --%>
    <%--sfiPpFormCs1SellsOtherCountries= ${sfiPpForm.sfiPpFormCs1SellsOtherCountries} <br/> --%>
</t:admin.layout>