<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<div class = "logged">
    You are logged in as ${role}
</div>

<a href="${pageContext.request.contextPath}/logout" class = "button">
    LogOut
</a>
