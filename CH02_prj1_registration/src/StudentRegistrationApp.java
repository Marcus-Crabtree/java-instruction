import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Registration Form");
		Scanner sc = new Scanner(System.in);
		//get user input
		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter your birth year: ");
		int birthYear = sc.nextInt();
		
	// do binness logic
		String fullName = firstName + " "+lastName;
		String tempPwd = firstName+"*"+ birthYear;
		System.out.println();
		System.out.println("Welcome, "+fullName + "!");
		System.out.println("Registration is complete!");
		System.out.println("yourtemporary Password is "+tempPwd);
		
		
		
		
		System.out.println("Goodbye");
		sc.close();
	}

}
