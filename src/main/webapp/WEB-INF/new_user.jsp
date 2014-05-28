<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h1>New User</h1>
        <hr>
        <form method="post" action="test">
            Username: <input type="text" name="userName"/>
            Password: <input type="password" name="password"/>
            Confirm Password: <input type="password" name="confirmPassword"/>
            Avatar Url: <input type="text" name="avatarUrl"/>
            Email: <input type="text" name="email"/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>