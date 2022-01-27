package com.phase2.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginservelet")
public class LoginServelet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Get the user name from the request
		String un=request.getParameter("username");
		//get the reference to httpsession object
		HttpSession session = request.getSession();
	    //save the data in to the session
		session.setAttribute("username",un);
		//Navigate to a different servelet
		out.println("<a href='Dashboard'>Next</a>");
		
		
		
	}

}
