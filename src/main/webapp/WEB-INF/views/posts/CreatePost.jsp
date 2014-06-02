<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h1>New Post</h1>
        <hr>
        <form method="post">
            Thread:
            <select name="thread">
                <c:forEach var="thread" items="${Model}">
                    <option value="${thread.threadID}">${thread.name}</option>
                </c:forEach>
            </select><br/>
            Post Creator: <input type="text" name="user"/><br/>
            Title: <input type="text" name="title"/><br/>
            Post Body:<br/> <textarea cols="30" rows="7" name="postBody"></textarea><br/>
            Tags: <input type="text" name="tags"/><br/>
            Example:(brakes,rotors,hub,wheel)<br/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>