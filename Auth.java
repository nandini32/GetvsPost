package com.phase2.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String un = request.getParameter("username");
	     //Get a referece to the session
		HttpSession session = request.getSession();
//	    get a reference to the context
		ServletContext context = request.getServletContext();
//	     check whether parameter exists in the request
		if(un!=null) {
			//save the username(Coming from req) in to the session
			session.setAttribute("un", un);
//			save the username(Coming from req) in to the context
			context.setAttribute("un", un);
		}
		
//		print username from req
		out.println("<h3>From request,username: "+un+"</h3><br>");
		out.println("<h3>From session, username : "+session.getAttribute("un")+"</h3><br>");
		out.println("<h3>From context, username : "+context.getAttribute("un")+"</h3><br>");
		
			
			
			
		
	
	}

}
