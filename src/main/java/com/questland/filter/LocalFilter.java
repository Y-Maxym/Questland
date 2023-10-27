package com.questland.filter;

import com.questland.filter.game.Player;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Objects;

@WebFilter(urlPatterns = "/game")
public class LocalFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String lang = request.getParameter("lang");
        if (StringUtils.isNotEmpty(lang)) {
            Player player = new Player(lang);
            HttpSession session = request.getSession();
            if ("eng".equals(lang)) {
                session.setAttribute("lang", "eng");
            } else {
                session.setAttribute("lang", "ukr");
            }
            session.setAttribute("player", player);
        }

        request.getRequestDispatcher("/game").forward(request, response);
    }
}
