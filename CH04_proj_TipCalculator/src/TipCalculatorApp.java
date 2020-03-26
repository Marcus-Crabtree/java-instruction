import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// 1. welcome
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tip calculator!");
		System.out.println("what was the cost of your meal?: ");
		//2. user input - cost of meal scanner, int doubles
		double mealCost = sc.nextDouble();
		double rate = 0.0;
		double tipAmount = mealCost * rate;
		double mealCostFinal = mealCost + tipAmount;
		for  (rate = .15; rate <.30; rate +=.05) {
				 tipAmount = mealCost * rate;
				 mealCostFinal = mealCost + tipAmount;
				
		}
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println( rate + tipAmount +mealCostFinal);
		
		//3.Logic  mealCost * percentTip(to double) = tipAmount 
		//     tipAmount + mealCost = mealCostFinal
		// need mealCostFinal for for tipAmount @ 15%, 20% and 25%
			
		
		//4.output 
			// sysout 15% tipAMount and mealCostFinal currencyFormat
			
			// sysout 20% tipAmount and mealCostFinal currencyFormat
			
			// sysout 30% tipAmount and mealCostFinal currencyFormat
		
		//5. goodbye.
		System.out.println("Goodbye.");
	}

}
