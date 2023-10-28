package com.questland.filter;

import com.questland.game.Localization;
import com.questland.game.Player;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

@WebFilter(urlPatterns = "/game")
public class GameFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String lang = request.getParameter("lang");
        if (StringUtils.isNotEmpty(lang)) {
            Localization localization = Localization.valueOf(lang.toUpperCase());
            Player player = new Player(localization);
            HttpSession session = request.getSession();
            session.setAttribute("player", player);
        }

        request.getRequestDispatcher("/game").forward(request, response);
    }
}
