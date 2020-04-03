package ui;

import java.text.NumberFormat;

public class BattingStatisticsCalculatorApp {

	public static void main(String[] args) {
		// welcome msg
		System.out.println("Welcome to the batting Stats App");
		String choice = "y";
		// - start loop
		while (choice.equalsIgnoreCase("y")) {
			// get user input
			// enter int atBat
			// int[] results
			int atBat = Console.getInt("Enter number of times at bat: ", 0, 31);
			System.out.println();
			int[] results = new int[atBat];
			for (int i = 0; i < results.length; i++) {
				int result = Console.getInt("Result for at-bat " + (i + 1) + ":", -1, 5);
				results[i] = result;
			}
			System.out.println();
			// double battingAvg = (results[] >0 ) / int atBat
			// double sluggingPct = basesEarned / int atBat
			int atBatsGreaterThanOne = 0;
			int basesEarned = 0;
			for (int result : results) {
				basesEarned += result;
				if (result > 0)
					atBatsGreaterThanOne++;
			}
			double battingAvg = atBatsGreaterThanOne / (double) atBat;
			double sluggingPct = basesEarned / (double) atBat;

			// display battingAVG and sluggingPct
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMinimumFractionDigits(3);
			nf.setMaximumFractionDigits(3);
			System.out.println("Batting average: " + nf.format(battingAvg));
			System.out.println("Slugging Percentage: " + nf.format(sluggingPct));
			System.out.println();
			// -end loop
			choice = Console.getString("Calculate another player? (y/n): ", true);
			System.out.println();
		}

		// goodbye
		System.out.println("Bye");

	}

}
