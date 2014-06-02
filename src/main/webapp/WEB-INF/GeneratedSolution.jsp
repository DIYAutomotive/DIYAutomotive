<%@ page import="java.util.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<t:genericpage>
    <jsp:body>
        <h1>Our $0.02</h1>
        
        
        <c:forEach items="${list}" var="current">
          <c:out value="${current.solution}" /><br>
	    </c:forEach>

    </jsp:body>
</t:genericpage>
