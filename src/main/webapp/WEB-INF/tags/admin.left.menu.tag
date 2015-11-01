<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<ul>
    <li <c:if test="${'profile' == selected}"> class="selected" </c:if> >
        <a href="#">My Profile</a>
    </li>

    <sec:authorize var="admin" access="hasAnyRole('ADMIN', 'SUPER_ADMIN')">

        <c:choose>
            <c:when test="${admin}">
                <li <c:if test="${'admin_sfi_core_user_list' == selected}"> class="selected" </c:if> >
                    <a href="#">Manage Users</a>
                </li>
                <li <c:if test="${'admin_sfi_core_company_list' == selected}"> class="selected" </c:if> >
                    <a href="#">Manage Companies</a>
                </li>
                <li <c:if test="${'admin_sfi_core_areaunit_list' == selected}"> class="selected" </c:if> >
                    <a href="#">Manage Area Units</a>
                </li>
                <li <c:if test="${'forms' == selected}"> class="selected" </c:if> >
                    <a href="#">Forms</a>
                </li>
            </c:when>
            <c:otherwise>
                <li <c:if test="${'company' == selected}"> class="selected" </c:if> >
                    <a href="#">Company Settings</a>
                </li>
            </c:otherwise>
        </c:choose>

    </sec:authorize>

    <li <c:if test="${'privacy' == selected}"> class="selected" </c:if> >
        <a href="#">Privacy Policy</a>
    </li>
</ul>