
public class DiceRollerApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Dice Roller! Time to try your luck!");

		// get user input - rolldie needs to be y or Y
		String choice = Console.getLine("Roll the dice? (y/n)");

		while (choice.equalsIgnoreCase("y")) {

			// biz logic - sum the dice
			Dice d = new Dice();
			d.roll();
			//

			// display results display total, special message
			d.printRoll();
			
			choice = Console.getLine("Roll again? (y/n)"); 

		}

		// good bye
		System.out.println("Goodbye");
	}

}// end of main
