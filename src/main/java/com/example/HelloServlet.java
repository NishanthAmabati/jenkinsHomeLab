package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
	response.getWriter().println("<p>Let's Learn DevOps!</p>");
	response.getWriter().println("<p>But first what is DevOps></p>");
	response.getWriter().println("<p>Change 1</p>");
	response.getWriter().println("<p>Change 2</p>");
	response.getWriter().println("<p>Change 3</p>");
	response.getWriter().println("<p>Hi, Dud!</p>");
    }
}

