package com.questland.servlet;

import com.questland.game.Player;
import com.questland.game.question.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "GameServlet", urlPatterns = "/game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Player player = (Player) session.getAttribute("player");
        String answer = request.getParameter("answer");

        if (StringUtils.isNotEmpty(answer)) {
            player.nextQuestion(answer);
        }

        Question question = player.getCurrentQuestion();
        List<Question> nextQuestions = player.getNextQuestions();

        session.setAttribute("player", player);
        session.setAttribute("question", question);
        session.setAttribute("nextQuestions", nextQuestions);

        request.getRequestDispatcher("game.jsp").forward(request, response);
    }
}