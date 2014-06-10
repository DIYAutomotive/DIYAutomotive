<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h2>${Model.name}</h2>
        <hr>
        <a href="/threads/${Model.idThreads}/post/create">Create Post</a><br/>
        <c:forEach var="post" items="${Model.postsByIdThreads}">
            <a href="/threads/${Model.idThreads}/post/${post.idPost}">${post.title}</a><br/>
        </c:forEach>

    </jsp:body>
</t:genericpage>