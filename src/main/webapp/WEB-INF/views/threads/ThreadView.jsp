<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h2>Threads</h2>
        <hr>
        <c:forEach var="thread" items="${Model}">
            <a href="/threads/${thread.id}">${thread.name}</a>
        </c:forEach>

    </jsp:body>
</t:genericpage>