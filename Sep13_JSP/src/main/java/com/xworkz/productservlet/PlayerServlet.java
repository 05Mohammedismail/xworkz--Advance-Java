package com.xworkz.productservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player", loadOnStartup = 1)
public class PlayerServlet extends HttpServlet{
	
	public PlayerServlet() {
		System.out.println("Created Player Servlet");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init in Player Servlet");
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service in Player Servlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost of Player Servlet");
		
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String sport = req.getParameter("sport");
		String age = req.getParameter("age");
		String dob = req.getParameter("dob");
		String country = req.getParameter("country");
		String mother = req.getParameter("mother");
		String father = req.getParameter("father");
		String married = req.getParameter("married");
		String jersey = req.getParameter("jersey");
		String alive = req.getParameter("alive");
		
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Sport : " + sport);
		System.out.println("Age : " + age);
		System.out.println("DateOfBirth : " + dob);
		System.out.println("MotherName : " + mother);
		System.out.println("FatherName : " + father);
		System.out.println("Married : " + married);
		System.out.println("JerseyNo : " + jersey);
		System.out.println("AliveStatus : " + alive);
		
		
		req.setAttribute("name", name);
		req.setAttribute("gender", gender);
		req.setAttribute("sport", sport);
		req.setAttribute("age", age);
		req.setAttribute("dob", dob);
		req.setAttribute("mother", mother);
		req.setAttribute("father", father);
		req.setAttribute("married", married);
		req.setAttribute("jersey", jersey);
		req.setAttribute("alive", alive);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("playerSuccess.jsp");
		dispatcher.forward(req, resp);
		}

}
