import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to table of Powers App");
		System.out.println("==============================");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		// prompt user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an interger");
			int n = sc.nextInt();
			// biz logic
			System.out.println();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t======");
			for (int i = 1; i <= n; i++) {
				// each loop will produce a line
				int squared = i * i;
				int cubed = i * i * i;
				System.out.println(i + "\t" + squared + "\t" + cubed);
			}

			// display output
			System.out.println();
			System.out.println("Continue? (y/n)");
			choice = sc.next();

			// bye
		}
		System.out.println("Goodbye");
		sc.close();
	}

}
