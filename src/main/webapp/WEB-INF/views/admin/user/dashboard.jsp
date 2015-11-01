<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authentication var="role" property="principal.authorities"/>

<t:admin.layout>
    ${user.company.name}
    ${role}
</t:admin.layout>