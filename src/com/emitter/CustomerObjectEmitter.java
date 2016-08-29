package com.emitter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.accesspoints.TableOperations;
import com.connection.ServletContextProvider;
import com.entity.Customer;
import com.operations.CustomerDAO;

/**
 * Servlet implementation class CustomerObjectEmitter
 */
@WebServlet("/CustomerObjectEmitter")
public class CustomerObjectEmitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerObjectEmitter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations operation=new CustomerDAO();
		Customer x=(Customer)operation.getRow(Integer.parseInt(request.getParameter("cif")));
		 
		 
			 JSONObject j=new JSONObject();
			 j.put("cif", x.getCif());
			 j.put("title",x.getTitle());
			 j.put("fname", x.getFirstName());
			 j.put("lname",x.getLastName());
			 j.put("email", x.getEmail());
			 j.put("phone",x.getPhone());
			 j.put("gender",x.getGender());
			 j.put("dob",x.getDateOfBirth());
			 j.put("address",x.getAddress());
			 j.put("city", x.getState());
			 j.put("state",x.getState());
			 j.put("zipcode",x.getZipcode());
			 j.put("idtype", x.getIdType());
			 j.put("idno", x.getIdNo());
			 j.put("addressno", x.getAddressNo());
			 j.put("addresstype",x.getAddressType());
			 
		 
		System.out.println(j.toJSONString());
		 PrintWriter out=response.getWriter();
	      out.println(j.toJSONString());
	}

	

}
