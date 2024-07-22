package com.demo_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.demo_project.model.DAOServiceImpl;

@WebServlet("/loginServlet")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd;

	public LoginController() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("UserName");
		String password = request.getParameter("Password");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("res", email);
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		boolean status = service.verifyLogin(email, password);
		if(status) {
			request.setAttribute("msg", "login successful");
			rd = request.getRequestDispatcher("WEB-INF/views/Registration.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("msg", "Invalid Username/Password");
			rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}

}
