package com.webservelets.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myfrstservelet")
public class Myfrstservelet extends HttpServlet {
	public void init() {
		System.out.println("Servelet Initialized");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Servelet running now...!");
		//set the content type of response
		response.setContentType("text/html");
		//get a reference to print writer
		PrintWriter out = response.getWriter();
		
		//lets write something
		out.println("<html>");
		out.println("<body>");
		out.println("We are running servelets now on the webbrowser...!");
		out.println("<h3>Working with servelets....</h3>");
		out.println("</body>");
		out.println("</html>");
		
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

	

}
