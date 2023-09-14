package com.xworkz.messagebox.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/message")
public class MessageServlet extends HttpServlet{
	
	public MessageServlet() {
		System.out.println("Message servlet invoked");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking do Get in message servlet");
		
		String name = req.getParameter("name");
		System.out.println("Name is :" + name);
		
		String message = req.getParameter("msg");
		System.out.println("Message is :" + message);
		
		resp.setContentType("text/html");
		
		PrintWriter show = resp.getWriter();
		show.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">    \r\n"
				+ "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<style>\r\n"
				+ "body{\r\n"
				+ "background-image:url(\"background.jpg\");\r\n"
				+ "background-attachment: fixed;\r\n"
				+ "}\r\n"
				+ "</style>"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar navbar-expand-lg navbar-light bg-primary\">\r\n"
				+ "  <a class=\"navbar-brand\">Message Box</a>\r\n"
				+ "  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "    <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "  </button>\r\n"
				+ "  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "    <ul class=\"navbar-nav\">\r\n"
				+ "    <li class=\"nav-item\">\r\n"
				+ "        <a class=\"nav-link\" href=\"index.html\">Home</a>\r\n"
				+ "      </li>\r\n"
				+ "      <li class=\"nav-item active\">\r\n"
				+ "        <a class=\"nav-link\" href=\"#\">Message <span class=\"sr-only\">(current)</span></a>\r\n"
				+ "      </li>\r\n"
				+ "    </ul>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "<h1>Displaying HTTP response</h1>\r\n"
				+ "Name : " + name
				+ "<br>"
				+ "Message : " + message
				+ "<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>"
				+ "</body>\r\n"
				+ "</html>");
		
		
	}

}
