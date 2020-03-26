import java.util.Scanner;

/*Specifications
    • The formula for finding the greatest common divisor of two positive integers x and y follows the Euclidean algorithm as follows:
    1. Subtract x from y repeatedly until y < x.
  
	2.	Swap the values of x and y.
	3.	Repeat steps 1 and 2 until x = 0.
	4.	y is the greatest common divisor of the two numbers.
    
        step  x  y
    1     12 8
    2     8  12  (swap)
    3     8  4
    4     4  8   (swap)
    5     4  0   (swap)
    6     0  4
         
    • You can use one loop for step 1 of the algorithm nested within a second loop for step 3.
    • Assume that the user will enter valid integers for both numbers.
    • The application should continue only if the user enters “y” or “Y” to continue. */

public class CommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Commin Divisor Calculator App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		// while loop begins before biz logic
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Please enter the first number (x): ");
			int x = sc.nextInt();
			System.out.println("Please enter your other number (y): ");
			int y = sc.nextInt();
			while (x > 0) {
				while (y >= x) {
					// subtract x from y
					y = y - x;
				}
				// swap values of x and y
				int hold = y;
				y = x;
				x = hold;
			}
			// y should be greatest common divisor
			System.out.println("Greatest Common Divisor is: " + y);
			System.out.println();
			// while loop ends before closing statement
			System.out.println("Would you like to continue?(y/n)");
			choice = sc.next();
		}
		System.out.println("Goodbye");
		sc.close();
	}

}
