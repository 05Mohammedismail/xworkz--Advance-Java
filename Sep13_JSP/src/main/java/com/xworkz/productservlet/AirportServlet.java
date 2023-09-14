package com.xworkz.productservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/airport", loadOnStartup = 1)
public class AirportServlet extends HttpServlet{
	
	public AirportServlet() {
		System.out.println("Created Airport Servlet");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init of Airport Servlet");
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service of Airport Servlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost of Airport Servlet");
		
		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String city = req.getParameter("city");
		String type = req.getParameter("type");
		String capacity = req.getParameter("capacity");
		String terminals = req.getParameter("terminals");
		String open = req.getParameter("open");
		String inauguratedBY = req.getParameter("inauguratedBY");
		
		System.out.println("Name : " + name);
		System.out.println("Country : " + country);
		System.out.println("City : " + city);
		System.out.println("Type : " + type);
		System.out.println("Capacity : " + capacity);
		System.out.println("Terminals : " + terminals);
		System.out.println("OpenDate : " + open);
		System.out.println("InauguratedBy : " + inauguratedBY);
		
		req.setAttribute("name", name);
		req.setAttribute("country", country);
		req.setAttribute("city", city);
		req.setAttribute("type", type);
		req.setAttribute("capacity", capacity);
		req.setAttribute("terminals", terminals);
		req.setAttribute("open", open);
		req.setAttribute("inauguratedBY", inauguratedBY);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("airportSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}
}
