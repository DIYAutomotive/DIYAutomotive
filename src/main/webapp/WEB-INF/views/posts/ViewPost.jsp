<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:genericpage>
    <jsp:body>
        <style type="text/css">
            .tftable {font-size:1.1em;color:#333333;width:100%;border-width: 10px;border-collapse: collapse;}
            .tftable th {font-size:1.1em;background-color:#b8b8b8;border-width: 10px;padding: 8px;border-style: solid;text-align:left;}
            .tftable td {font-size:1.1em;border-width: 1px;padding: 8px;border-style: solid;border-color: #a9a9a9;}
            .tftable tr:hover {background-color:#ffff99;}
        </style>
        <!--Your content goes here-->
        <h1>${Model.title}</h1>
        <hr>
        <span><h3>${Model.description}</h3></span>
        <hr>
        <h4>Comments</h4>
        <table class="tftable">
        <c:forEach var="comment" items="${Model.commentsByIdPost}">
            <span>
                <p>
                  <tr><th>
                  ${comment.comment}<br/>
                  <%--User: ${comment.user.username}--%>
                  </tr></th>
                </p>
            </span>
        </c:forEach>
        </table>
        <form method="post">
            Add Comment: <input name="comment"/>
            <input type="submit"/>
        </form>

    </jsp:body>
</t:genericpage>