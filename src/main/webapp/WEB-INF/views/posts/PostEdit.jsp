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

        <form method="post">
            Title: ${Model.title}
            <br/>
            Edit: <input type="text" name="titleEdit"/><br/>
            Post Body: ${Model.description}
            :<br/> <textarea cols="30" rows="7" name="postBodyEdit"></textarea><br/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>

