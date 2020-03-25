import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;



public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator App!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
	while(choice.equalsIgnoreCase("y")) {
		System.out.println("Please enter your miles: ");
		//int distance = sc.nextInt();
		BigDecimal distance = new BigDecimal(sc.next());
		System.out.println("Please enter miles per hour: ");
		BigDecimal speed = new BigDecimal(sc.next());
		BigDecimal time = distance.divide(speed,2, RoundingMode.HALF_UP);
		//int speed = sc.nextInt();
		//int time = distance/speed;
		//System.out.println("ETA:"+time); undo remark to check code works
		//distance.divide(speed);
		BigDecimal hours = time.divide(speed);
		BigDecimal minutes = ;
		
		
		System.out.println("Estimated travel time: ");
		System.out.println("-----------------------");
		System.out.println("Hours: "+hours );
		System.out.println("Minutes: "+minutes );
		
		 System.out.print("Calculate another ETA? (y/n): ");
         choice = sc.next();
         System.out.println();
         System.out.println("goodbye!");
		
		
		}
					
	
	}

}
