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
 * Servlet implementation class CustomerListEmitter
 */
@WebServlet("/CustomerListEmitter")
public class CustomerListEmitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerListEmitter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContextProvider.setServletContext(getServletContext());
		TableOperations operation=new CustomerDAO();
		List<Customer> customerList=operation.getRows();
		 JSONArray ja=new JSONArray();
		 for(Customer x:customerList){
			 JSONObject j=new JSONObject();
			 j.put("cid", x.getCif());
			 j.put("fname", x.getFirstName());
			 ja.add(j);
		 }
		 System.out.println(ja.toJSONString());
		 PrintWriter out=response.getWriter();
	      out.println(ja.toJSONString());
	}


}
