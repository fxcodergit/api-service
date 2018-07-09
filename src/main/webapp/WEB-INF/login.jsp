<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title> 主窗口 </title>
</head>
<body>
<form action="show.jsp" method="post">
    信息一：<input type="text" name="info1"/> out.print("<br>")；
    信息二：<input type="text" name="info2"/>
    <input type="submit" value="在另一个页面显示结果"/>
</form>
</body>
</html>