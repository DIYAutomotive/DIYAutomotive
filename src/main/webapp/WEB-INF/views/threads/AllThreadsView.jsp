<%--
  Created by IntelliJ IDEA.
  User: jjensen
  Date: 5/31/14
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h2>Threads</h2>
        <hr>
        <table>
            <tr>
                <th>Title</th>
                <th>Description</th>
                <th>Number Of Posts</th>
            </tr>
            <c:forEach var="thread" items="${Model}" >
                <tr>
                    <td>
                        <a href="/threads/${thread.idThreads}">${thread.name}</a>
                    </td>
                    <td>
                        ${thread.description}
                    </td>
                    <td>
                        <!--//number of posts will go here -->
                    </td>
                </tr>

            </c:forEach>

        </table>

    </jsp:body>
</t:genericpage>