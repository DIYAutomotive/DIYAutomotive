<%--
  Created by IntelliJ IDEA.
  User: jjensen
  Date: 5/15/14
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>DIY Automotive</title>
  </head>
  <body>
  	<h2>Welcome to DIY Automotive!!!</h2>
	<h5>Having a problem with your vehicle? Don't worry, it may just be a simple common problem. Select which problem your vehicle is having (if any):</h5>
	
	<form>
		<input type="checkbox" name="problem" value="Brakes">Vehicle shakes abnormally while braking<br>
		<input type="checkbox" name="problem" value="Idling">Vehicle is not idling at the normal RPM's or wants to die at idle<br>
		<input type="checkbox" name="problem" value="Starting">Vehicle won't start up or has trouble starting up<br>
		<input type="checkbox" name="problem" value="Power Steering"> Vehicle makes a loud high-pitched squealing noise on startup or while turning<br>
		<input type="checkbox" name="problem" value="Clutch">Vehicle has hard time moving in first or in between shifting (manual transmission)<br>
		
		<input type="submit" value="Submit"/>
	</form>
  	
  	<h2>Blah blah blah</h2>
  </body>
</html>
