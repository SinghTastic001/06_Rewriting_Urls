package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("fullName");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2> Name "+name+"</h2>");
		out.println("<a href='servlet2?username="+name+"'>servlet2</a>");
	}
	

}
