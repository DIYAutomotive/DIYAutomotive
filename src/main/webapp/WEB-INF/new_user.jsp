<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h1>New User</h1>
        <hr>
        <form method="post" action="">
            Username: <input type="text" name="userName"/><br/>
            Password: <input type="password" name="password"/><br/>
            Confirm Password: <input type="password" name="confirmPassword"/><br/>
            Avatar Url: <input type="text" name="avatarUrl"/><br/>
            Email: <input type="text" name="email"/><br/>
            <input type="submit">
        </form>
    </jsp:body>
</t:genericpage>