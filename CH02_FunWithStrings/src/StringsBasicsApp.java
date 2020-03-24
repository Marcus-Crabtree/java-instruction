import java.util.Scanner;

public class StringsBasicsApp {

	public static void main(String[] args) {
		String message = " Hello there.";
		String emptyString = "";
		String nullString = null;
				
		String firstName = "Marcus";
		String lastName = "Crabtree";
		String fullName = firstName+" "+lastName;
		
		String fullName2 = "";
		fullName2 += firstName;
		fullName2 += " ";
		fullName2 += lastName;
		System.out.println(fullName2);
		
		System.out.println("hello...\n George\t\tMcFly");
		
		
		// scanner stuff
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter something: ");
		String msg = sc.nextLine();
		System.out.println("you entered "+msg);
		sc.close();
		
		// more print options
		System.out.println("printLn adds a line break...");
		System.out.print("print does not");
		System.out.print("...case in point.");
		
		System.out.println("Enter a whole number #: ");
		int a = sc.nextInt();
		System.out.println("Enter a whole Decimal #: ");
		double d = sc.nextDouble();
		
		
		
		
	}

}
