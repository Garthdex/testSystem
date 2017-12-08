<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<script src="${pageContext.request.contextPath}/resources/js/component/main.js" type="text/javascript"></script>
<div class = "logged">
    <h2 class = "welcome" data-id="${id}">
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
                            <form class="goTest" action="${pageContext.request.contextPath}/main/test" method="post">
                                <input name="idTest" value="${test.id}" hidden>
                                <button type="submit" class = "test btn btn-large btn-primary" id="${test.id}">
                                    Enter test "${test.name}"
                                </button>
                                <div class="completedArea"></div>
                            </form>
                        </c:forEach>

                    </c:if>
                </div>
            </div>
        </c:otherwise>
    </c:choose>
</div>
