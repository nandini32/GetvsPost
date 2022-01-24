package com.phase2.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getmethod")
public class GetMethodHandler extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set the content
		response.setContentType("text/html");
		//get a reference to print writer
		PrintWriter out = response.getWriter();
		out.println("INSIDE GETMETHOD");
		out.println("<br>");
		String name=request.getParameter("Username");
		String address=request.getParameter("Address");
		out.println("Entered Name is "+name+" from "+address);
		
		
		}

}
