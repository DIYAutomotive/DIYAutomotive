<%--
  Created by IntelliJ IDEA.
  User: jjensen
  Date: 5/15/14
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<t:genericpage>
    <jsp:body>
        <h2>Welcome to DIY Automotive!!!</h2>
        <h5>Having a problem with your vehicle? Don't worry, it may just be a simple common problem. Select which problem your vehicle is having (if any):</h5>

        <form method="post" action="test">
            <input type="checkbox" name="problem1" value="Brakes">Vehicle shakes abnormally while braking<br>
            <input type="checkbox" name="problem2" value="Idling">Vehicle is not idling at the normal RPM's or wants to die at idle<br>
            <input type="checkbox" name="problem3" value="Starting">Vehicle won't start up or has trouble starting up<br>
            <input type="checkbox" name="problem4" value="Power Steering">Vehicle makes a loud high-pitched squealing noise on startup or while turning<br>
            <input type="checkbox" name="problem5" value="Clutch">Vehicle has hard time moving in first or in between shifting (manual transmission)<br>
            <br>
            <input type="submit" value="Submit"/>
        </form>
    </jsp:body>
</t:genericpage>
