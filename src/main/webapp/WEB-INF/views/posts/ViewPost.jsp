<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h1>${Model.title}</h1>
        <hr>
        <span><p>${Model.description}</p></span>
        <c:forEach var="comment" items="${Model.commentsByIdPost}">
            <span>
                <p>
                  ${comment.comment}<br/>
                  <%--User: ${comment.user.username}--%>
                </p>
            </span>
        </c:forEach>
        <form method="post">
            Add Comment: <input name="comment"/>
            <input type="submit"/>
        </form>

    </jsp:body>
</t:genericpage>