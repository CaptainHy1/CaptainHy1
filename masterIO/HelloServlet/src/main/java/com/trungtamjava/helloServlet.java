package com.trungtamjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("bat dau hoc servlet");
	}
	@Override
	public void destroy() {
		System.out.println("ket thuc hoc servlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		
		System.out.println("phuong thuc cua request" + req.getMethod());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<h1> Xin chao servlet -  Trung tam java");
		writer.close();
			
	}
}
