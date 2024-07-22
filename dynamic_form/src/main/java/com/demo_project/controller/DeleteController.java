package com.demo_project.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo_project.model.DAOServiceImpl;

@WebServlet("/delReg")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd;
       
    public DeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rd = request.getRequestDispatcher("WEB-INF/views/delete.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Name");
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		service.deleteRegistration(name);
		request.setAttribute("msg", "record deleted successfully");
		rd = request.getRequestDispatcher("WEB-INF/views/delete.jsp");
		rd.forward(request, response);
	}

}
