package com.xworkz.productservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/vendor",  loadOnStartup = 1)
public class VendorServlet extends HttpServlet{
	
	public VendorServlet() {
		System.out.println("Created Vendor servlet");
	}
	
	@Override
	public void init() throws ServletException {
	System.out.println("Init of Vendor Servlet");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service of Vendor Servlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("doPost of Vendor Servlet");
	
	String name = req.getParameter("name");
	String gst = req.getParameter("gst");
	String owner = req.getParameter("owner");
	String location = req.getParameter("location");
	System.out.println("Name : " + name);
	System.out.println("GSTnumber : " + gst);
	System.out.println("Owner : " + owner);
	System.out.println("Location : " + location);
	
	req.setAttribute("name", name);
	req.setAttribute("gst", gst);
	req.setAttribute("owner", owner);
	req.setAttribute("location", location);
	
	RequestDispatcher dispatcher = req.getRequestDispatcher("vendorSuccess.jsp");
	dispatcher.forward(req, resp);
	}

}
