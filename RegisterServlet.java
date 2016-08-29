package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.accesspoints.TableOperations;
import com.connection.ServletContextProvider;
import com.entity.Customer;
import com.operations.CustomerDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
		// TODO Auto-generated method stub
		int cif=Integer.parseInt(request.getParameter("cif"));
		String title= request.getParameter("title");
		String firstName= request.getParameter("fname");
		String lastName= request.getParameter("lname");
		String birthDate= request.getParameter("date");
		String email= request.getParameter("email");
		String phone= request.getParameter("phone");
		String gender= request.getParameter("gender");
		String address= request.getParameter("add1");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		int zipcode=Integer.parseInt(request.getParameter("zipcode"));
		int idType=Integer.parseInt(request.getParameter("idType"));
		int addressType=Integer.parseInt(request.getParameter("addType"));
		String idNo= request.getParameter("idNo");
		String addressNo= request.getParameter("addNo");
		Customer customer=new Customer(cif,title,firstName,lastName,birthDate,email,phone,gender,address,city,state,zipcode,0,idType,addressType,
				idNo,addressNo);
		request.setAttribute("customer", customer);
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations operation= new CustomerDAO();
		boolean result=operation.insert(customer);
		RequestDispatcher rd=request.getRequestDispatcher("report.jsp");
		if(result==true){
			HttpSession session=request.getSession();
			Integer i=(Integer)session.getAttribute("record");
			if(i==null)
				i=0;
			i++;
			session.setAttribute("record",i);
			ServletContext context=getServletContext();
			Integer j=(Integer)context.getAttribute("total");
			if(j==null)
				j=0;
			j++;
			context.setAttribute("total",j);
			rd.forward(request, response);
			}
		else
			response.sendRedirect("Redirector.html");
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations operation=new CustomerDAO();
		List<Customer> list=operation.getRows();
		request.setAttribute("customerlist", list);
		request.getRequestDispatcher("customer.jsp").forward(request, response); 
		
	}

}
