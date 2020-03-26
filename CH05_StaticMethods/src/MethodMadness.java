import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodMadness {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		String name = "Marcus";
		printWelcomeMessage();
		printWelcomeMessage(name);

		// get 2 intergers on one line
		// System.out.println("Enter 2 intergets (ex. 1 5): ");
		// int a =sc.nextInt();
		// int b =sc.nextInt();

		// get int a
		int a = getValidInt("Enter number 1: ", sc);
		// get int b
		int b = getValidInt("Enter number 2: ", sc);
		
				
		System.out.println("Sum is " + sum(a, b));
		System.out.println("Difference is " + diff(a, b));
		System.out.println("Quotient is " + quotient(a, b));
		System.out.println("Product is " + product(a, b));

		System.out.println("goodbye");
	}

	private static int getValidInt(String prompt, Scanner sc) {
		int i = 0;
		while (true) {
            
			        // print message to user
					System.out.print(prompt);
					try {
						// get user input
						i = sc.nextInt();
						break;
			}
			catch (InputMismatchException ime ) {
				// check for exception
				// re-prompt if exception
				System.out.println("Entry must be a whole number, try again.");
				sc.nextLine(); //discard any input
			}

			// return valid input
		}
		return i;
	}

	private static void printWelcomeMessage() {
		System.out.println("Welcome to the madness");
	}

	private static void printWelcomeMessage(String name) {
		System.out.println("Welcome, " + name + ",to the madness!");
	}

	private static int sum(int n1, int n2) {
		return n1 + n2;
	}

	private static int diff(int a, int b) {
		return a - b;
	}

	private static int quotient(int a, int b) {
		return a / b;
	}

	private static int product(int a, int b) {
		return a * b;
	}
}
