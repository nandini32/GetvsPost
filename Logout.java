package com.phase2.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	//invalidate the session here
	request.getSession().invalidate();
	//redirect back to login page
	out.println("<h2> YOU ARE NOW LOGGED OUT NOW.....<h2><br>");
	out.println("<a href='Session.html'>Login Again</a>");
	
	
	}

}
