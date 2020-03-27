import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the guess the number game!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equals("y")) {
			// loop 1 game
			// generate int rndNbr # initialize int count of tries
			int count = 0;
			int rndNbr = (int) (Math.random() * 100) + 1;
			// start game message
			int guess = 0;
			while (guess != rndNbr) {
				// loop -2 2 prompt and compare rand numb
				// prompt for user input int guess = ??
				guess = getIntWithinRange(sc, "Enter Number: ", 0, 101);
				// biz logic+display results -- in loop
				// compare int guess to int rndNbr - determine too high/low msg #
				int diff = guess - rndNbr;
				String msg = "";
				if (diff < -10) {
					msg = "Way too low, guess again!!";
				} else if (diff > 0) {
					msg = "Too low, guess again!";
				} else if (diff > 10) {
					msg = "Way too high, guess again!!";
				} else if (diff > 0) {
					msg = "Too High, guess again!";
				} else {
					// user guessed number
					break;
				}

			}
			String msg = "You got it in " + count + " tries!\n";
			if (count <= 3) {
				msg += " Great work, you're a mathematical genious!";
			} else if (count <= 7) {
				msg += " Not too bad, You've got some potential.";
			} else {
				msg += " What took you so long? Maybe you should take some lessons";
			}
			// loop 1 ends - user guess numb
			// display results -- final
			// String msg = determine message via criteria
			choice = tryAgainPrompt(sc, "Try again? (y/n):  ");

		}

		// bye
		System.out.println("C-YA later!");

	}

	// data validation rules:
	// validate user entries must be intWithinRange 1-100
	// continue prompt only accepts y or n (case sensitive
	private static String tryAgainPrompt(Scanner sc, String prompt) {
		String choice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			choice = sc.next();
			if (choice.equals("y") || choice.equals("n")) {
				isValid = true;
			} else {
				System.out.println("Invalid choice. Try again");
			}
		}
		return choice;

	}

	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(sc, prompt);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
}
