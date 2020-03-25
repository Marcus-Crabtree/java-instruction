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
		String milesStr = sc.next();
		BigDecimal milesBD = new BigDecimal(milesStr);
		System.out.println("Please enter miles per hour: ");
		BigDecimal speed = new BigDecimal(sc.next());
		BigDecimal mphBD = sc.nextBigDecimal();
		//int speed = sc.nextInt();
		//int time = distance/speed;
		//System.out.println("ETA:"+time); undo remark to check code works
		//distance.divide(speed);
		//BigDecimal hours = time.divide(speed);
		//BigDecimal minutes = ;
		BigDecimal sixty = new BigDecimal(60);
		BigDecimal minutesTraveled = milesBD.divide(mphBD,2,RoundingMode.HALF_UP).multiply (sixty);
		int timeTraveledHours = (int)minutesTraveled.divide(sixty,2,RoundingMode.HALF_UP).doubleValue();
		int remainingMinutes = (int)minutesTraveled.remainder(sixty).doubleValue();
		System.out.println("Estimated travel time: ");
		System.out.println("-----------------------");
		System.out.println("Hours: "+timeTraveledHours );
		System.out.println("Minutes: "+remainingMinutes );
		
		 System.out.print("Calculate another ETA? (y/n): ");
         choice = sc.next();
         System.out.println();
         System.out.println("goodbye!");
		
		
		}
					
	
	}

}