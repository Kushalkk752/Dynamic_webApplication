package com.demo_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.demo_project.model.DAOServiceImpl;

@WebServlet("/retReg")
public class RetrieveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd;
       
    public RetrieveController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		ResultSet result = service.getAllRegistrations();
		request.setAttribute("res", result);
		rd = request.getRequestDispatcher("WEB-INF/views/Retrieve.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
