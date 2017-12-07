<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<script src="${pageContext.request.contextPath}/resources/js/component/test.js" type="text/javascript"></script>
<div class ="testing" data-idTest="${testView.id}">
    <div class="question">
        <c:forEach items="${testView.questionViewModelList}" var="question">
            <div class="well well-large">
                    ${question.name}
                <div class = "answer ">
                    <c:forEach items="${question.answerViewModelList}" var="answer">
                        <label class="radio">
                            <input type="radio" name="${question.name}" id="${answer.id}" value="${answer.id}" data->
                                ${answer.name}
                        </label>
                    </c:forEach>
                </div>
            </div>
        </c:forEach>
        <button class = "btn btn-large btn-primary saveAnswers">
            Save answers
        </button>
    </div>
</div>
