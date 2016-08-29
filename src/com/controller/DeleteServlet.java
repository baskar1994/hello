package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accesspoints.TableOperations;
import com.connection.ServletContextProvider;
import com.entity.Customer;
import com.operations.CustomerDAO;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cif=Integer.parseInt(request.getParameter("cif"));
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations operation=new CustomerDAO();
		Customer customer=new Customer();
		customer.setCif(cif);
		operation.delete(customer);
		List<Customer> list=operation.getRows();
		request.setAttribute("customerlist", list);
		request.getRequestDispatcher("customer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
