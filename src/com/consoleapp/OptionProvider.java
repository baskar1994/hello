package com.consoleapp;

import java.util.Scanner;

public class OptionProvider {
	public static int showOptions()
	{
		System.out.println("What operation do you want to perform");
		System.out.println("____________________________");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.PrintTable");
		
		Scanner scanner= new Scanner(System.in);
		return Integer.parseInt(scanner.next());
	}

}
