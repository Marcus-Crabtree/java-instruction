import java.util.Scanner;

public class TestScoreApp {

	public static void main(String[] args) {
		// display operational messages
		System.out.println("Enter test scores that range from 0 to 100.");
		System.out.println("To end the program, enter 999.");
		System.out.println(); 

		// initialize variables and create a Scanner object
		int scoreTotal = 0;
		int scoreCount = 0;
		int testScore = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// get a series of test scores from the user
		while (testScore != 999) {
			System.out.print("Enter score: ");
			testScore = sc.nextInt();
			if (testScore <= 100) {
				scoreCount = scoreCount + 1;
				scoreTotal = scoreTotal + testScore;
			} else if (testScore != 999) {
				System.out.println("Invalid entry; not counted");
			}
		}

		double averageScore = 0.0;
		if (scoreCount > 0) {
			averageScore = (double) scoreTotal / scoreCount;
		}
		String message = "\n" + "Score count:   " + scoreCount + "\n" + "Score total:   " + scoreTotal + "\n"
				+ "Average score: " + averageScore + "\n";
		System.out.println(message);
	}
}