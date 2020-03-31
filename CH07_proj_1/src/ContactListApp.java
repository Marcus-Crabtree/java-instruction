
public class ContactListApp {

	public static void main(String[] args) {
		//welcome
		
		System.out.println("Welcome to Contact List application.");
		
		//get user input firstname, last name, email, phone
		String fn = Console.getString("Enter first name:  ");
		String ln = Console.getString("Enter last name:  ");
		String em = Console.getString("Enter Email:  ");
		String ph = Console.getString("Enter phone number:  ");
		
		//do bix logic
		Contact c = new Contact(fn,ln,em,ph);
		System.out.println(c.displayContact());
		
		
		//display results Current contact display
		
		//need to set a loop
		System.out.println("Goodbye");
	}

}
