package com.questland.servlet;

import com.questland.game.Player;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

@WebServlet(name = "GameServlet", urlPatterns = "/game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Player player = (Player) session.getAttribute("player");
        String answer = request.getParameter("answer");
        if (StringUtils.isNotEmpty(answer)) {
            player.nextStage(answer);
        }

        session.setAttribute("player", player);

        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
}
