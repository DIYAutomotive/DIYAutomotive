<%--
  Created by IntelliJ IDEA.
  User: jjensen
  Date: 5/31/14
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h2>Threads</h2>
        <hr>
        <c:forEach var="thread" items="${Model}">
            <a href="/threads/${thread.threadID}">${thread.name}</a>
        </c:forEach>

    </jsp:body>
</t:genericpage>