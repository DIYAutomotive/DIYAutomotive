<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style type="text/css">
    .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;margin:0px auto;}
    .tg td{font-family:Arial, sans-serif;font-size:36px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
    .tg th{font-family:Arial, sans-serif;font-size:36px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
    .tg .tg-a0td{font-size:100%}
</style>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/default_style.css" />
    <title>Item</title>
</head>
<body>

<div id="wrapper">
    <div id="header">

        <div id="logo"><span><a href="/"><img src="/images/EngineWhitev6.gif" style="width: 150px; height: 85px;"/></a></span><span>DIYAutomotive</span></div>
        <div id="headerend">
            <div id="loginInfo">
                <a href="/user">Signup</a>
            </div>
        </div>
    </div>
    <div id="navigation">
        <ul id="nav">
            <li><a href="/">Home</a></li>
            <li>
                <a href="">Threads</a>
                <ul>
                    <li><a href="/threads/create">Create Thread</a></li>
                    <li><a href="/threads/all">View All Threads</a></li>

                </ul>
            </li>

        </ul>
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