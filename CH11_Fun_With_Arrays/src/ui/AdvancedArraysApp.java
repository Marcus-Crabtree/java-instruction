package ui;

import java.util.Arrays;

import business.Product;

public class AdvancedArraysApp {

	public static void main(String[] args) {
		int[] numbers = { 11, 67, 222, 4, 76 };

		// order/sort, modify / add, search copy
		// search
		int idx = Arrays.binarySearch(numbers, 222);
		System.out.println("idx of 222= " + idx);

		System.out.println("All elements of the array");
		for (int n : numbers) {
			System.out.println(n);
		}
		System.out.println("Sort em!!");
		Arrays.sort(numbers);
		for (int n : numbers) {
			System.out.println(n);
		}

		System.out.println("=======Lets sort some strings========================");
		String[] students = { "Marcus", "Jeff", "Tyler", "Sarah", "Sam", "Christian" };
		for (String s : students) {
			System.out.println(s);
		}
		System.out.println("Sort em!!!");
		Arrays.sort(students);
		for (String s : students) {
			System.out.println(s);
		}

		System.out.println("==================sort some products==============");
		Product p1 = new Product("java", "Murach Java", 57.50);
		Product p2 = new Product("android", "Murach android", 65.55);
		Product p3 = new Product("mysql", "Murach SQL", 39.99);
		Product p4 = new Product("html", "Murach HTML", 45.99);

		Product[] products = { p1, p2, p3, p4 };
		for (Product p : products) {
			System.out.println(p);
		}

		System.out.println("SortEM!!");
		Arrays.sort(products);
		for (Product p : products) {
			System.out.println(p);
		}

		System.out.println("===Rectangular array ===");
		int[][] table = new int[3][2]; // three rows 2 colums
		table[0][0] = 1;// row 0 column 0
		table[0][1] = 2;
		table[1][0] = 3;
		table[1][1] = 4;
		table[2][0] = 5;
		table[2][1] = 6;
// iterate through rows
		for (int i = 0; i < table.length; i++) {
			// iterate through columns
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println("\n");

		}

		
		
		
		
		
		
		
		
		
	}

}
