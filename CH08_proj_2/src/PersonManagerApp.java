import java.util.Scanner;

public class PersonManagerApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Person Manager ");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getString("Create customer or employee? (c/e): ", "c", "e");
			String firstName = Console.getString("First Name: ", true);
			String lastName = Console.getString("Last Name: ", true);
			Person p = null;

			if (type.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString("Customer Number: ", true);
				Customer c = new Customer(firstName, lastName, customerNumber);
				p = c;

			} else {
				String socSecNum = Console.getString("Social Security Number: ", true);
				Employee e = new Employee(firstName, lastName, socSecNum);

				p = e;
			}
			// move to ask fn.ln, socSecnum --employee

			System.out.println("You entered a new " + p.getClass().getName());
			System.out.println(p);
			choice = Console.getString("continue? (y/n): ", "y", "n");
			// get user input
			// sysout" create customer or employee (c/e)
			// data validation req

			// then grab first name, last name
			// if customer enter customer number
			// if employee grab ssn

			// display output - first name, lastname \n
			// customer number or ssn

			// finish loop - continue y/n?
			// data validation

			// goodbye

		}
		System.out.println("Goodbye");

	}
}
