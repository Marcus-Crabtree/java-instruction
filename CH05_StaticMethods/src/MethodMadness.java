
public class MethodMadness {

	public static void main(String[] args) {
		System.out.println("Hello");
		String name = "Marcus";
		printWelcomeMessage();
		printWelcomeMessage(name);
		System.out.println("goodbye");
		
		int a =77;
		int b = 11;
		System.out.println("Sum is "+sum(a,b));
		System.out.println("Difference is "+ diff(a, b));
		
	}
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the madness");
	}
	
	private static void printWelcomeMessage(String name) {
		System.out.println("Welcome, "+name+",to the madness!");
	}
	private static int sum(int n1, int n2) {
		return n1+n2;
	}
	private static int diff(int a, int b) {
		return a-b;
	}
	}



