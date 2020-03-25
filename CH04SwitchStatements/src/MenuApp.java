import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc = new Scanner (System.in);
		
		//demo the use of a switch statement in a menu
		String choice = "";
		while (!choice.equalsIgnoreCase("x")) {
			// display the menu
			String menu =   "MENU\n" +
							"=============\n"+
							"L - list all users\n" +
							"C - create a user\n"+
							"U - update a user\n"+
							"D - delete a user\n"+
							"G = get a user\n"+
							"X = exit\n";
			System.out.println(menu);
									
			//get the users choice
			choice = sc.next();
			//do something based on that choice
			switch (choice) {
			case "L":
				System.out.println("Listing all users...");
				break;
			case "C":
				System.out.println("Creating all users...");
				break;
			case "U":
				System.out.println("Updating all users...");
				break;
			case "D":
				System.out.println("deleting all users...");
				break;
			case "G":
				System.out.println("Getting a user...");
				break;
			case "X":
				break;
			default:
				System.out.println("Invalid choice, try again.");
			}
		}
		
		
		
		
		
		System.out.println("Goodbye.");

	}

}
