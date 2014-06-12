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
        <style type="text/css">
            .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
            .tg td{font-family:Arial, sans-serif;font-size:38px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
            .tg th{font-family:Arial, sans-serif;font-size:38px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
            .tg .tg-i0og{color:#000000}
            .tg .tg-4eph{background-color:#f9f9f9}
        </style>
        <table align="center" class="tg">
            <tr>
                <th class="tg-i0og">Title</th>
                <th class="tg-031e">Description</th>
                <th class="tg-i0og">Number Of Posts</th>
            </tr>
            <c:forEach var="thread" items="${Model}" >
                <tr>
                    <td class="tg-031e">
                        <a href="/threads/${thread.idThreads}">${thread.name}</a>
                    </td>
                    <td class="tg-4eph">
                        ${thread.description}
                    </td>
                    <td class="tg-031e">
                        <!--//number of posts will go here -->
                    </td>
                </tr>

            </c:forEach>

        </table>

    </jsp:body>
</t:genericpage>