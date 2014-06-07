<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/default_style.css" />
    <title>Item</title>
</head>
<body>

<div id="wrapper">
    <div id="header">

        <div id="logo"><span><img src="/images/EngineWhitev6.gif" style="width: 150px; height: 85px;"/></span><span>DIYAutomotive</span></div>
        <div id="headerend">
            <div id="loginInfo">
                <a href="/user">Signup</a>
            </div>
        </div>
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