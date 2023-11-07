package com.questland.servlet;

import com.questland.game.Player;
import com.questland.game.question.Question;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class GameServletTest {

    @Test
    void testDoGet() throws Exception {

        // Arrange
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);
        ServletContext context = Mockito.mock(ServletContext.class);

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("game.jsp")).thenReturn(dispatcher);
        when(request.getServletContext()).thenReturn(context);

        Player player = new Player();
        Question question = new Question(1, null, null, null, null);
        List<Question> nextQuestions = List.of(new Question(2, null, null, null, null));

        when(session.getAttribute("player")).thenReturn(player);
        when(session.getAttribute("question")).thenReturn(question);
        when(session.getAttribute("nextQuestions")).thenReturn(nextQuestions);

        // Act
        new GameServlet().doGet(request, response);

        // Assert
        assertEquals(player, session.getAttribute("player"));
        assertEquals(question, session.getAttribute("question"));
        assertEquals(nextQuestions, session.getAttribute("nextQuestions"));

        verify(dispatcher).forward(request, response);
    }
}