<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h1>New Post</h1>
        <hr>
        <form method="post" action="">
            Thread: <select name="thread"></select><br/>
            Title: <input type="text" name="title"/><br/>
            Post Body:<br/> <textarea cols="30" rows="7" name="postBody"></textarea><br/>
            Tags: <input type="text" name="tags"/><br/>
            Example:(brakes,roters,hub,wheel)<br/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>