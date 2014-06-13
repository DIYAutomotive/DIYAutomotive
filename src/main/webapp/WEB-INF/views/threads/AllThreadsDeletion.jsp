<%--
  Created by IntelliJ IDEA.
  User: Blepoidevin
  Date: 6/9/2014
  Time: 11:15 AM
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
        <style type="text/css">
            .tftable {font-size:1.1em;color:#333333;width:100%;border-width: 10px;border-color: #a9a9a9;border-collapse: collapse;}
            .tftable th {font-size:1.1em;background-color:#b8b8b8;border-width: 10px;padding: 8px;border-style: solid;border-color: #a9a9a9;text-align:left;}
            .tftable tr {background-color:#ffffff;}
            .tftable td {font-size:1.1em;border-width: 1px;padding: 8px;border-style: solid;border-color: #a9a9a9;}
            .tftable tr:hover {background-color:#ffff99;}
        </style>
        <!--Your content goes here-->
        <h2>Threads</h2>
        <hr>
        <table  class="tftable">
            <tr>
                <th>Title</th>
                <th>Description</th>
                <th>Thread ID</th>
            </tr>
            <c:forEach var="thread" items="${Model}">
                <tr>
                    <td>
                        <a href="/threads/${thread.idThreads}/edit">${thread.name}</a>
                    </td>
                    <td>
                            ${thread.description}
                    </td>
                    <td>
                            ${thread.idThreads}
                    </td>
                </tr>

            </c:forEach>

        </table>
        <h3>Input Thread ID to Delete</h3>
        <form method="post">
            Thread ID<input type="text" name="threadIDDeletion"/><br/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>