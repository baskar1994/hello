package com.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.accesspoints.TableOperations;
import com.connection.JDBC;
import com.entity.Customer;

public class CustomerDAO implements TableOperations{

	//@Override
	public boolean insert(Object row) {
		
		try {
			Connection connection=JDBC.getConnection();
			PreparedStatement statement;
			statement = connection.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			Customer customer=(Customer)row;
			statement.setInt(1,customer.getCif());
			statement.setString(2,customer.getTitle());
			statement.setString(3,customer.getFirstName());
			statement.setString(4,customer.getLastName());
			statement.setString(5,customer.getDateOfBirth());
			statement.setString(6,customer.getEmail());
			statement.setString(7,customer.getPhone());
			statement.setString(8,customer.getGender());
			statement.setString(9,customer.getAddress());
			statement.setString(10,customer.getCity());
			statement.setString(11, customer.getState());
			statement.setInt(12,customer.getZipcode());
			statement.setInt(13,customer.getBlacklist());
			statement.setInt(14,customer.getIdType());
			statement.setInt(15,customer.getAddressType());
			statement.setString(17,customer.getIdNo());
			statement.setString(16,customer.getAddressNo());
			
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	//@Override
	public boolean delete(Object row) {
		Connection connection=JDBC.getConnection();
		PreparedStatement statement ;
		try {
			statement = connection.prepareStatement("delete customer where cif=?");
			Customer customer=(Customer)row;
			statement.setInt(1,customer.getCif());
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	//@Override
	public boolean update(Object row) {
		Connection connection=JDBC.getConnection();
		PreparedStatement statement ;
		try {
			statement = connection.prepareStatement("update customer set title=?,fname=?,lname=?,dob=?,email=?,phone=?,gender=?,address=?,city=?,state=?,zipcode=?,idproof_type=?,address_type=?,address_no=?,idproofno=? where cif=?");
			Customer customer=(Customer)row;
			statement.setInt(16,customer.getCif());
			statement.setString(1,customer.getTitle());
			statement.setString(2,customer.getFirstName());
			statement.setString(3,customer.getLastName());
			statement.setString(4,customer.getDateOfBirth());
			statement.setString(5,customer.getEmail());
			statement.setString(6,customer.getPhone());
			statement.setString(7,customer.getGender());
			statement.setString(8,customer.getAddress());
			statement.setString(9,customer.getCity());
			statement.setString(10, customer.getState());
			statement.setInt(11,customer.getZipcode());
			//statement.setInt(13,customer.getBlacklist());
			statement.setInt(12,customer.getIdType());
			statement.setInt(13,customer.getAddressType());
			statement.setString(14,customer.getIdNo());
			statement.setString(15,customer.getAddressNo());
			System.out.println(statement.toString());
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	//
	public List<Customer> getRows() {
		Connection connection=JDBC.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet result=statement.executeQuery("select * from customer");
			List<Customer> l=new ArrayList<Customer>();
			while(result.next()){
				Customer customer=new Customer();
				customer.setCif(result.getInt(1));
				customer.setTitle(result.getString(2));
				customer.setFirstName(result.getString(3));
				customer.setLastName(result.getString(4));
				customer.setDateOfBirth(result.getString(5));
				customer.setEmail(result.getString(6));
				customer.setPhone(result.getString(7));
				customer.setGender(result.getString(8));
				customer.setAddress(result.getString(9));
				customer.setCity(result.getString(10));
				customer.setState(result.getString(11));
				customer.setZipcode(result.getInt(12));
				customer.setBlacklist(result.getInt(13));
				customer.setIdType(result.getInt(14));
				customer.setAddressType(result.getInt(15));
				customer.setAddressNo(result.getString(16));
				customer.setIdNo(result.getString(17));
				l.add(customer);
			}
			return l;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	//@Override
	public Object getRow(int id) {
		Connection connection=JDBC.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet result=statement.executeQuery("select * from customer where cif="+id);
			//List<Customer> l=new ArrayList<Customer>();
			if(result.next()){
				Customer customer=new Customer();
				customer.setCif(result.getInt(1));
				customer.setTitle(result.getString(2));
				customer.setFirstName(result.getString(3));
				customer.setLastName(result.getString(4));
				Date date=result.getDate(5);
				System.out.println(date.toString());
				//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				//Date today = dateFormat.parse(dateFormat.format(date));
				String today=new SimpleDateFormat("dd-MMM-yyyy").format(date);
				customer.setDateOfBirth(today);
				customer.setEmail(result.getString(6));
				customer.setPhone(result.getString(7));
				customer.setGender(result.getString(8));
				customer.setAddress(result.getString(9));
				customer.setCity(result.getString(10));
				customer.setState(result.getString(11));
				customer.setZipcode(result.getInt(12));
				customer.setBlacklist(result.getInt(13));
				customer.setIdType(result.getInt(14));
				customer.setAddressType(result.getInt(15));
				customer.setAddressNo(result.getString(16));
				customer.setIdNo(result.getString(17));
				return customer;
			}
		return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	//	return connection;
	}

}
