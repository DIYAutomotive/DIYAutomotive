
<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/default_style.css" />
    <title>Item</title>
</head>
<body>

<div id="wrapper">
    <div id="header">

        <div id="logo"><h1>DIYAutomotive</h1></div>
        <div id="headerend"></div>
    </div>

    <div id="contentWrapper">
        <div id="content">
                <jsp:doBody/>

        </div>

    </div>
    <div id="footer"><center>Created by: Team Cobra</center></div>
</div>

</body>
</html>