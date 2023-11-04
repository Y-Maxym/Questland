<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lost at Sea</title>
    <link rel="icon" href="image/quest.png" type="image/png">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="lang" value='<%=session.getAttribute("lang")%>'/>
    <c:set var="question" value='<%=session.getAttribute("question")%>'/>
    <c:set var="nextQuestions" value='<%=session.getAttribute("nextQuestions")%>'/>
</head>
<body class="game-body">
<div class="question-box">
    <p>
        <c:if test='${lang == "eng"}'>
            ${question.getTitleEng()}
        </c:if>
        <c:if test='${lang == "ukr"}'>
            ${question.getTitleUkr()}
        </c:if>
    </p>
    <c:if test='${!nextQuestions.isEmpty()}'>
        <form method="GET">
            <label>
                <input type="radio" name="answer" value='${nextQuestions.get(0).getValue()}' checked>
                <c:if test='${lang == "eng"}'>
                    ${nextQuestions.get(0).getTextEng()}
                </c:if>
                <c:if test='${lang == "ukr"}'>
                    ${nextQuestions.get(0).getTextUkr()}
                </c:if>
            </label>
            <br>
            <br>
            <label>
                <input type="radio" name="answer" value='${nextQuestions.get(1).getValue()}'>
                <c:if test='${lang == "eng"}'>
                    ${nextQuestions.get(1).getTextEng()}
                </c:if>
                <c:if test='${lang == "ukr"}'>
                    ${nextQuestions.get(1).getTextUkr()}
                </c:if>
            </label>
            <br>
            <br>
            <br>
            <br>
            <label>
                <button type="submit" class="submit-button">
                    <c:if test='${lang == "eng"}'>
                        Next
                    </c:if>
                    <c:if test='${lang == "ukr"}'>
                        Далі
                    </c:if>
                </button>
            </label>
        </form>
    </c:if>
</div>
</body>
</html>
