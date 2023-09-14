package com.xworkz.registerationservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
	
	public RegisterServlet() {
		System.out.println("Created Register Servlet");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("Invoking Init method of Register Servlet");
		super.init(config);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost method of Register Servlet");
		
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String email = req.getParameter("email");
		String num = req.getParameter("num");
		String pass = req.getParameter("pass");
		String repass = req.getParameter("repass");
		System.out.println("First Name : " + fName);
		System.out.println("Last Name : " + lName);
		System.out.println("Email ID : " + email);
		System.out.println("Phone number : " + num);
		
		resp.setContentType("text/html");
		PrintWriter show = resp.getWriter();
		show.println("<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>Bootstrap demo</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">  "
				+ "<style>\r\n"
				+ ".navbar{\r\n"
				+ "background: rgb(63, 63, 109);\r\n"
				+ "margin-bottom: 1px;\r\n"
				+ "color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "</style>"
				+ "</head>\r\n"
				+ "  \r\n"
				+ "  <body>\r\n"
				+ "      <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n"
				+ "  <a class=\"navbar-brand\">Hello!</a>\r\n"
				+ "  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "    <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "  </button>\r\n"
				+ "  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "    <ul class=\"navbar-nav\">\r\n"
				+ "      <li class=\"nav-item\">\r\n"
				+ "        <a class=\"nav-link text-white\" href=\"Register.html\">Register</a>\r\n"
				+ "      </li>\r\n"
				+ "    </ul>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "<h1 style=\"color: blue\">Registration Successfull</h1>\r\n"
				+ "<img src=\"logo.jpg\" alt=\"logo\">"
				+ "<script>\r\n"
				+ "    alert(\"Details Saved\");\r\n"
				+ "</script>"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
	
}
