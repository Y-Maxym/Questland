<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lost at Sea</title>
    <link rel="icon" href="image/quest.png" type="image/png">
    <link rel="stylesheet" href="style/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body class="game-body">
<div class="question-box">
    <p>
    </p>
    <form method="GET">
        <label>
            <input type="radio" name="answer" value="1" checked>
        </label>
        <br>
        <br>
        <label>
            <input type="radio" name="answer" value="2">
        </label>
        <br>
        <br>
        <br>
        <br>
        <label>
            <button type="submit" class="submit-button" onclick="nextQuestion()">
                <c:if test="${lang == \"eng\"}">
                        Next
                </c:if>
                <c:if test="${lang == \"ukr\"}">
                    Далі
                </c:if>
            </button>
        </label>
    </form>

</div>
</body>
</html>
