<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<div class = "logged">
    <h2 class = "welcome">
        Welcome ${login}! You are logged in as ${role}
    </h2>

    <a href="${pageContext.request.contextPath}/logout" class = "logOut btn btn-large btn-primary">
        LogOut
    </a>
</div>

<div class="contentBlock">
    <c:choose>
        <c:when test="${role=='admin'}">
            it's admin
        </c:when>
        <c:otherwise>
            <div class = "userBlock">
                <h2>
                    Available tests:
                </h2>
                <div class="buttonTests">
                    <c:if test="${!empty testList}">
                        <c:forEach items="${testList}" var="test">
                            <a href="${pageContext.request.contextPath}/test/${test.id}" class = "test btn btn-large btn-primary">
                                Enter test "${test.name}"
                            </a>
                        </c:forEach>

                    </c:if>
                </div>
            </div>
        </c:otherwise>
    </c:choose>
</div>
