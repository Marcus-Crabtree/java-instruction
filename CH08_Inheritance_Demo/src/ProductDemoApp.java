
public class ProductDemoApp {

	public static void main(String[] args) {
		Product p1 = new Product("Java","Murachs Java",57.50);
		
		System.out.println(p1.toString());
		
		String choice = "y";
		
		if (choice.equals("y")) {
			System.out.println("yep, choice is y");
		}

	}

}
