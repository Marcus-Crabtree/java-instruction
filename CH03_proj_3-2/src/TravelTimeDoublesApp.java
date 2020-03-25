import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TravelTimeDoublesApp {

	public static void main(String[] args) {
		
				System.out.println("Welcome to the Travel Time Calculator App!");
				System.out.println();
				Scanner sc = new Scanner(System.in);
				String choice = "y";
			
		while(choice.equalsIgnoreCase("y")) {
				System.out.print("Please enter your miles: ");
				double miles = sc.nextDouble();
				System.out.println("Please enter miles per hour: ");
				double mph = sc.nextDouble();
				//hoursMin = distance/speed
				//double hoursMin = miles / mph;
				//int minutes = (int)hoursMin *60;
				//minutes =hoursMin * 60
				//int hoursInt = (int)minutes / 60;
				//hoursInt = (int)minutes / 60
				//minutes = (int)minutes % 60;
				//minutes = (int)minutes % 60
				double minutesTraveled = (miles/mph)*60;
				int timeTraveledHours = (int)(minutesTraveled/60);
				int remainingMinutes = (int)(minutesTraveled%60);
				
				System.out.println("Estimated travel time: ");
				System.out.println("-----------------------");
				System.out.println("Hours: "+timeTraveledHours );
				System.out.println("Minutes: "+remainingMinutes );
				
				 System.out.print("Calculate another ETA? (y/n): ");
		         choice = sc.next();
		         }
							
		System.out.println();
		System.out.println("goodbye!");
		
			
			}

		}

	


