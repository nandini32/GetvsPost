package com.phase2.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletinterface")
public class ServletInterfaceDemo extends HttpServlet {
	
	   ServletConfig config=null;
	    public void init(ServletConfig config){
	        this.config=config;
	        System.out.println("Initialization complete");
	     }

	     public void service(ServletRequest request,ServletResponse response)
	     throws IOException,ServletException{
	         response.setContentType("text/html");
	         PrintWriter out=response.getWriter();
	         out.print("<html>");
	         out.print("<body>");
	         out.print("In the service() method<br>");
	         out.print("</body>");
	         out.print("</html>");
	     }
	     public void destroy(){
	         System.out.println("In destroy() method");
	     }
	     public ServletConfig getServletConfig(){
	         return config;
	     }
	     public String getServletInfo(){
	         return "This is a sample servlet info";
	     }

}
