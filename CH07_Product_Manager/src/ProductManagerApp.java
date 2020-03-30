
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to product mgr.");
		// create some instances of products and display their info
		//create 2 instances of Product
		Product p1 = new Product();
		p1.setCode("Java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.50);
		System.out.println(p1.toString());
		System.out.println("Price of p1 is: "+p1.getPriceFormatted());
		
		Product p2 = new Product("MySQL", "Murrach's MySQL", 54.50);
		System.out.println(p2);
		
		System.out.println(p1); // displaying numberOfObjects increase
		
		System.out.println("goodbye.");
	}

}
