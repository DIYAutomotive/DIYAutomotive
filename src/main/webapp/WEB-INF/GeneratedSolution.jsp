<%@ page import="java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Possible Solutions</title>
</head>
<body>
	<h1>Our $0.02</h1>
	<c:choose>
		<c:when test="${list.get(0) != null}">
			<h3>Brakes</h3>
			<p>Common brake problems are often caused by not replacing brake
				pads when needed or having warped rotors. Brake pads are roughly a
				$30 fix and will keep from warping your rotors.</p>
			<p>Warped rotors can be either shaved down so that they are
				smooth again or replaced for roughly $80.</p>
		</c:when>
		<c:otherwise>
		</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${list.get(1) != null}">
			<h3>Idling</h3>
			<p>Abnormal idling can mean several things. If your RPM's are
				constantly raising then falling, 1) You may have a vacuum leak. 2)
				You may have a malfunctioning o2 sensor. 3) bad fuel input (fuel
				pump is going out).</p>
		</c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${list.get(2) != null}">
			<h3>Startup</h3>
			<p>Bad startup normally means a bad battery. If the car makes
				rapid ticking noises while trying to start then a bad battery is the
				problem. If the car starts then immediately dies, then your
				alternator is most likely the cause.</p>
			<p>If the car makes a loud screeching noise or another other
				abnormal noise while starting up, then your starter motor might be
				the issue.</p>
		</c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${list.get(3) != null}">
			<h3>Power Steering</h3>
			<p>If you're hearing a loud screech following startup or while
				turning, then your power steering pump or serpentine belt is on its
				way out the door.</p>
		</c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${list.get(4) != null}">
			<h3>Clutch</h3>
			<p>If you're having a hard time getting the car into gear or when
				putting it in gear, the car makes a loud, high-pitched grinding
				noise, then your transmission syncro's are going bad. If you're
				having trouble getting the car to go in first gear or in between
				shifting,</p>
			<br>
			<p>then your clutch is burnt out. If you have an automatic
				transmission and the clutch is slipping, then replace the
				transmission fluid. Magically, this solves the problem 95% of the
				time.</p>
		</c:when>
		<c:otherwise></c:otherwise>
	</c:choose>

</body>
</html>