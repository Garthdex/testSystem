<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<script src="${pageContext.request.contextPath}/resources/js/component/login.js" type="text/javascript"></script>

<div class="content">

    <form class="form-horizontal loginDiv" action="/login/in" method="post">
        <div class="control-group">
            <label class="control-label" for="inputLogin">Login:</label>
            <div class="controls">
                <input type="text" name="login" id="inputLogin" placeholder="Login">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword">Password:</label>
            <div class="controls">
                <input type="password" name="password" id="inputPassword" placeholder="Password">
            </div>
        </div>
        <div class="control-group">
            <div class="switch">
                Haven't account yet? Please, <a class="registerLink" href="#"> register </a>
                <button type="submit" class="btn signIn">Sign in</button>
            </div>
        </div>
    </form>

    <form class="form-horizontal registerDiv" action="/register" method="post" disabled hidden>
        <div class="control-group">
            <label class="control-label" for="inputRegisterLogin">Login:</label>
            <div class="controls">
                <input type="text" id="inputRegisterLogin" placeholder="Login">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputRegisterPassword">Password:</label>
            <div class="controls">
                <input type="password" id="inputRegisterPassword" placeholder="Password">
            </div>
            <label class="control-label" for="inputRegisterPasswordAgain">Confirm your password:</label>
            <div class="controls">
                <input type="password" id="inputRegisterPasswordAgain" placeholder="Enter password again">
            </div>
            <label class="control-label">As who?</label>
            <select class="asWho">
                <option>user</option>
                <option>admin</option>
            </select>
        </div>
        <div class="control-group">
            <div class="switch">
                Have account already? Please, <a class="loginLink" href="#"> login </a>
                <button type="submit" class="btn signUp">Sign up</button>
            </div>
        </div>
    </form>

    <%--<h1>userList</h1>--%>

    <%--<c:if test="${!empty userList}">--%>
        <%--<table class="table table-striped table-hover">--%>
            <%--<tr>--%>
                <%--<th width="80">ID</th>--%>
                <%--<th width="120">Name</th>--%>
                <%--<th width="120">Last Name</th>--%>
                <%--<th width="60">Role</th>--%>
            <%--</tr>--%>
            <%--<c:forEach items="${userList}" var="user">--%>
                <%--<tr>--%>
                    <%--<td>${user.id}</td>--%>
                    <%--<td>${user.name}</td>--%>
                    <%--<td>${user.lastName}</td>--%>
                    <%--<td>${user.role}</td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>
        <%--</table>--%>
    <%--</c:if>--%>
</div>
