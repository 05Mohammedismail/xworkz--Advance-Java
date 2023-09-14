package com.xworkz.foodservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/food", loadOnStartup = 1)
public class FoodServlet extends HttpServlet{
	
	public FoodServlet() {
		System.out.println("Created Food servlet");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init of Food Servlet");
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service of Food Servlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost of Food Servlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String hName = req.getParameter("hName");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
		
		//converting String to primitive
		double newPrice = Double.parseDouble(price); 
		double newQuantity = Double.parseDouble(quantity);
		
		double totalAmount = newPrice*newQuantity;
		//converting primitive to String because html only understands String
		String total = String.valueOf(totalAmount);
		
		
		
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		System.out.println("Hotel Name : " + hName);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("TotalAmout : " + total);  
		
		
		
		req.setAttribute("name", name);
		req.setAttribute("type", type);
		req.setAttribute("hName", hName);
		req.setAttribute("price", price);
		req.setAttribute("quantity", quantity);
		req.setAttribute("total", total);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("foodSuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
