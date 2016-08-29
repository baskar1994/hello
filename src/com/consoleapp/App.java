package com.consoleapp;

import java.util.List;
import java.util.Scanner;

import com.accesspoints.TableOperations;
import com.entity.Customer;
import com.operations.CustomerDAO;



public class App {

	public static void main(String[] args) {/*
		char choice='y';
		TableOperations tableOperations=new CustomerDAO();
		Scanner scan=new Scanner(System.in);
		do{
			int userOption=OptionProvider.showOptions();
			Customer customer;
			boolean bool;
			switch(userOption){
			case 1:
				customer=CustomerInfoReader.read();
				bool=tableOperations.insert(customer);
				if(bool)
					System.out.println("row inserted");
				else
					System.err.println("error in insertion");
				break;
			case 2:
				customer=CustomerInfoReader.read();
				bool=tableOperations.update(customer);
				if(bool)
					System.out.println("row updated");
				else
					System.err.println("error in updation");
				break;
			case 3:
				customer=CustomerInfoReader.read();
				bool=tableOperations.delete(customer);
				if(bool)
					System.out.println("row deleted");
				else
					System.err.println("error in deletion");
				break;
			case 4:
				List list=tableOperations.getRows();
				TableGenerator.show(list);
				choice=scan.next().charAt(0);
			}
		}while(choice!='n');
	*/
		}

}
