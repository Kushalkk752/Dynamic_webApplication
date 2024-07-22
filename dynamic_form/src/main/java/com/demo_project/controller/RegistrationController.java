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

@WebServlet("/addReg")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd;

	public RegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rd = request.getRequestDispatcher("WEB-INF/views/Registration.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String mobile = request.getParameter("Mobile");

		HttpSession session = request.getSession(false);
		DAOServiceImpl service = new DAOServiceImpl();
		if(session.getAttribute("res")!=null) {
			service.connectDB();
			service.addRegistration(name, email, mobile);
			request.setAttribute("msg", "record added succesfully");
			rd = request.getRequestDispatcher("WEB-INF/views/Registration.jsp");
			rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

}
