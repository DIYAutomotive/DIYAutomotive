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
        <form method="post">
            Edit: <input type="text" name="title" value="${Model.name}"/><br/>
            Description:
            Edit: <br/> <textarea cols="30" rows="7" name="description">${Model.description}</textarea><br/>
            <input type="submit">
        </form>

    </jsp:body>
</t:genericpage>