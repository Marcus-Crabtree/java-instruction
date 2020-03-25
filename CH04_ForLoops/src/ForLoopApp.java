
public class ForLoopApp {

	public static void main(String[] args) {
		System.out.println("Hello for loops");
		//once a month pay rent
		System.out.println("pay rent once per month");		
		for(int i=1; i <= 12;i++) {
			// do this once per month
			System.out.println("rent paid for month: "+i);
		}
		// can change to 3 pointers i=3
		System.out.println("Score some hoops! 2 pointers");
		for (int i=0; i<=2; i+=2) {
			System.out.println("points: "+i);
			System.out.println("Hoop scored!");
		}
		// count down
		System.out.println("Its monday, count down to friday!");
		for (int i=4; i>=1;i--) {
			System.out.println(i +"days left, dangit");
		}
		System.out.println("Happy Fri-YAY!");
		
		System.out.println("goodbye");

		//variables can go in for loop
		int orders = 30;
		System.out.println("Lets process some orders ... 30 orders");
		for (int i=0; i< orders;i++) {
			System.out.println("Order processed; ID is:"+i);
					}
		System.out.println("All orders processed!");
	}

}
