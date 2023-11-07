package com.questland.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class WelcomePageFilterTest {

    @Test
    void testDoFilter() throws Exception {
        // Arrange
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);
        FilterConfig filterConfig = mock(FilterConfig.class);

        WelcomePageFilter welcomePageFilter = new WelcomePageFilter();
        welcomePageFilter.init(filterConfig);

        // Act
        welcomePageFilter.doFilter(request, response, filterChain);

        //Assert
        verify(response).sendRedirect("/welcome");
        verify(filterChain, never()).doFilter(Mockito.any(), Mockito.any());
    }

}