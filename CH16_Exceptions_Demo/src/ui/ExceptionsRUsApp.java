package ui;

import java.util.InputMismatchException;

import util.ConsoleUtil;

public class ExceptionsRUsApp {

	public static void main(String[] args) {
		System.out.println("hi");
		
		try {
		double d = ConsoleUtil.getDouble("Enter Yearly interest rate: ");
	} catch (InputMismatchException ime) {
		System.out.println("");
	}
		
		
		
		
		
		
		System.out.println("bye");
	}

}
