<%--
  Created by IntelliJ IDEA.
  User: jjensen
  Date: 5/15/14
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:genericpage>
    <jsp:body>
        <!--Your content goes here-->
        <h2>Welcome to DIY Automotive!!!</h2>
        <h5>Having a problem with your vehicle? Don't worry, it may just be a simple common problem. Select which problem your vehicle is having (if any):</h5>

        <form method="post" action="test">
            <input name="input" type="text"/>
            <br>
            <input type="submit" value="Submit"/>
        </form>

    </jsp:body>
</t:genericpage>
