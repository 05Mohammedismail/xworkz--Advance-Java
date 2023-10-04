package com.xworkz.grocery.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repository.GroceryRepo;
import com.xworkz.grocery.repository.GroceryRepoImpl;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImpl;

@WebServlet(urlPatterns = {"/grocery", "/total", "/view"}, loadOnStartup = 1)
public class GroceryController extends HttpServlet {

	private GroceryRepo groceryRepo = new GroceryRepoImpl();

	private GroceryService groceryService = new GroceryServiceImpl(groceryRepo);

	public GroceryController() {
		System.out.println("Created Grocery Servlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init of Grocery Servlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service of Grocery Servlet");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		double price = Double.parseDouble(req.getParameter("price"));
		double quantity = Double.parseDouble(req.getParameter("quantity"));

		GroceryDTO dto = new GroceryDTO(name, type, price, quantity);

		groceryService.validateAndSave(dto);
		
		req.setAttribute("total", this.groceryService.total());
		RequestDispatcher dispatcher = req.getRequestDispatcher("Grocery.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet");
		String uri = req.getRequestURI();
		System.out.println("uri" + uri);

		if(uri.endsWith("/total")) {
			req.setAttribute("total", this.groceryService.total());
			req.getRequestDispatcher("Grocery.jsp").forward(req, resp);
		}
		else if(uri.endsWith("/view")) {
			req.setAttribute("view", this.groceryService.getAll());
			req.getRequestDispatcher("GroceryView.jsp").forward(req, resp);
		}
	
	}
}
