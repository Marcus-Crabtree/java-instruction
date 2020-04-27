import java.util.*;

public class PigDice {

	public static void main(String[] args) {

		final int WIN_SCORE = 100;
		int num_dice, num_players;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> players = new ArrayList();
		ArrayList<Integer> scores = new ArrayList();

		do {
			System.out.println("How many dice do you want to play with? (1 or 2): ");
			num_dice = scan.nextInt();
		} while (num_dice < 1 || num_dice > 2);

		do {
			System.out.println("How many players do you want to play with? (2 to 10): ");
			num_players = scan.nextInt();
		} while (num_players < 1 || num_players > 10);
		for (int i = 0; i < num_players; i++) {
			System.out.print("Please enter player" + (i + 1) + "'s name: ");
			players.add(scan.next());
			scores.add(0);
		}
		for (int j = 0; j < players.size(); j++) {
			String name = players.get(j);
			int score = scores.get(j);
			int die1 = 0, die2 = 0;
			Random random = new Random();
			char c;
			System.out.println(name + " it's your turn. Your current score is " + score);
			System.out.println();

			do {
				System.out.println(" Press 'R' to Roll the dice!");
				c = scan.next().charAt(0);

			} while (c != 'r' && c != 'R');

			for (int k = score; k < WIN_SCORE; k += (die1 + die2)) {

				die1 = random.nextInt(6) + 1;

				if (num_dice == 2) {

					die2 = random.nextInt(6) + 1;
					System.out.println("You rolled a " + die1 + " and a " + die2);

				} else {

					System.out.println("You rolled a " + die1);
				}

				if (die1 == 1 && die2 == 1) {

					scores.set(j, 0);
					System.out.println("============SNAKE EYES!! / TURN OVER============");
					break;

				} else if (die1 == 1 || die2 == 1) {

					System.out.println("============YOU ROLLED A ONE / TURN OVER============");
					break;
				} else if ((k + die1 + die2) >= WIN_SCORE) {

					scores.set(j, k + die1 + die2);
					break;
				}

				do {
					System.out.println(" Would you like to (R)oll or (h)old? ");
					c = scan.next().charAt(0);

				} while (c != 'r' && c != 'R' && c != 'h' && c != 'H');

				if (c == 'h' || c == 'H') {
					scores.set(j, k + die1 + die2);
					break;
				}
			}
			if (scores.get(j) >= WIN_SCORE) {
				System.out.println("CONGRATULATIONS " + name + " YOU WIN WITH " + scores.get(j) + " POINTS!!!");
				break;
			} else if (j == players.size() - 1) {
				j = -1;
			}
		}

	}

}
