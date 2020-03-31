
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Contact List application.");
		
		//need to set a loop
		Contact c1 = new Contact();
		c1.setFirstName("Marcus");
		c1.setLastName("Crabtree");
		c1.setEmail("kmarcuscrabtree@gmail.com");
		c1.setPhone("562-296-7129");
		//System.out.println(c1.displayContact);
		
		
		Contact c2 = new Contact("Tom","Smith","tsmith@yahoo.com","513-234-5433");
		Contact c3 = new Contact("bill","Williams","bwill@gmail.com","513-456-2231");
		Contact c4 = new Contact("sherry","Temple","Stemp@hotmail.com","209-456-4333");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
