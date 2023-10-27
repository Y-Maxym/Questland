<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lost at Sea</title>
    <link rel="icon" href="image/quest.png" type="image/png">
    <link rel="stylesheet" href="style/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
</head>
<body>
<h1 class="header">Game</h1>
<%
    boolean isEnd = (boolean) session.getAttribute("end");
    String text = (String) session.getAttribute("text");
    if (!isEnd) {
        List<String> questions = (List<String>) session.getAttribute("questions");
    }
%>
<h2><%= text%></h2>
</body>
</html>
