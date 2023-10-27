package com.questland.filter.servlet;

import com.questland.filter.game.Player;
import com.questland.filter.game.stages.Stage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "GameServlet", urlPatterns = "/game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Player player = (Player) session.getAttribute("player");
        Stage stage = player.getStage();
        boolean isEnd = stage.isEnd();
        String text = stage.getText();
        List<String> questions = stage.getQuestion();

        session.setAttribute("end", isEnd);
        session.setAttribute("text", text);
        session.setAttribute("questions", questions);

        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
}
