<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h1>New Thread</h1>
        <hr>
        <form method="post" action="">
            Title: <input type="text" name="title"/><br/>
            Description:<br/> <textarea cols="30" rows="7" name="description"></textarea><br/>
            Tags: <input type="text" name="tags"/><br/>
            Example:(brakes,roters,hub,wheel)<br/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>