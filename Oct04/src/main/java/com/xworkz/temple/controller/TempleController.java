package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repo.TempleRepo;
import com.xworkz.temple.repo.TempleRepoImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;

@WebServlet(urlPatterns = { "/save", "/total", "/view" }, loadOnStartup = 1)
public class TempleController extends HttpServlet {

	private TempleRepo repo = new TempleRepoImpl();
	private TempleService service = new TempleServiceImpl(repo);

	public TempleController() {
		System.out.println("Created Temple Controller");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init of Temple Controller");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service of Temple Controller");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost of Temple Controller");
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String god = req.getParameter("god");
		int constructedYear = Integer.parseInt(req.getParameter("constructedIn"));
		
		TempleDTO dto = new TempleDTO(name, place, god, constructedYear);
		service.validateAndSave(dto);
		
		req.setAttribute("total", this.service.total());
		req.getRequestDispatcher("Temple.jsp").forward(req, resp);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet of Temple controller");
		
		String uri = req.getRequestURI();
		System.out.println("URI" + uri);
		
		if(uri.endsWith("/total")) {
			req.setAttribute("total", this.service.total());
			req.getRequestDispatcher("Temple.jsp").forward(req, resp);
		}
		else if(uri.endsWith("/view")) {
			req.setAttribute("view", this.service.getAll());
			req.getRequestDispatcher("TempleView.jsp").forward(req, resp);
		}
	}
	
	
}
