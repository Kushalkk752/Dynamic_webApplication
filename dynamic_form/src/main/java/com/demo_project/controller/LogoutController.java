package com.demo_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/logoutReg")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd;

	public LogoutController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		try {
			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

}
