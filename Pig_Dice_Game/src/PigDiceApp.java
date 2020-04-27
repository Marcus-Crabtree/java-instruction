//import java.util.*;
//
//
//
//public class PigDiceApp {
//
//	public static void main(String[] args) {
//		Random rand = new Random();
//		Scanner scan = new Scanner(System.in);
//		String choice = "";
//		System.out.println("Lets play a game of Pig Dice!");
//		System.out.println("Both you and computer(Java) start off with zero points");
//		System.out.println("First player to 100+ points wins!");
//		System.out.print("Ready to play?:  (y/n)");
//		choice = scan.next();
//		while (choice.equalsIgnoreCase("y")) {
//			System.out.print("How many times do you want to play?");
//			int numOfRounds = scan.nextInt();
//
//			int round = 1;
//			int compScore = 0;
//			int playerScore = 0;
//			int compToss = 0;
//			int playerToss = 0;
//			int pRound = 0;
//			int cRound = 0;
//
//			while (round <= numOfRounds) {
//				compScore = 0;
//				playerScore = 0;
//				compToss = 0;
//				playerToss = 0;
//
//				while (!(compScore >= 100 || playerScore >= 100)) {
//					System.out.println("Javas time to shine!");
//
//					int roll1 = rand.nextInt(6) + 1;
//					int roll2 = rand.nextInt(6) + 1;
//					int roll3 = rand.nextInt(6) + 1;
//					compToss = roll1 + roll2 + roll3;
//					compScore = compScore + compToss;
//
//					System.out.println("Java rolled a " + roll1 + ", " + roll2 + ", and " + roll3);
//					System.out.println("Javas score is now: " + compScore);
//					System.out.println();
//					System.out.println("-----------------------------------------");
//					System.out.println("Your turn!");
//					System.out.print("Press 'x' button to roll: ");
//					String x = scan.next();
//
//					if (x.equals("x")) {
//						playerToss = rand.nextInt(6) + 1;
//					}
//					System.out.println("You rolled a " + playerToss);
//
//					while (playerToss != 1) {
//						playerScore = playerScore + playerToss;
//						System.out.println("Your score is now: " + playerScore);
//						System.out.println("----------------------");
//						System.out.println();
//						System.out.print("Press 'x' button to roll or type 'end' to end your turn turn: ");
//						x = scan.next();
//						if (x.equals("end")) {
//							break;
//						} else {
//							playerToss = rand.nextInt(6) + 1;
//						}
//						System.out.println("You rolled a " + playerToss);
//						System.out.println();
//					}
//
//					if (playerToss == 1) {
//						playerScore = 0;
//						System.out.println("You got greedy and rolled a 1!!! Score reset to 0");
//						System.out.println();
//					}
//
//					System.out.println("Your turn is over. Now it's Javas turn to roll");
//				}
//
//				if (compScore > playerScore) {
//					System.out.println("java is the winner! I guess its back to 'Hello World' for you...");
//					System.out.println();
//					cRound++;
//				} else {
//					System.out.println("You are the winner! Take that, Java!");
//					System.out.println();
//					pRound++;
//				}
//				round++;
//			}
//			System.out.println("---- Final Score ----");
//			System.out.println("java:  " + cRound + "   You:  " + pRound);
//			System.out.println();
//			System.out.println("Want to play again? (y/n): ");
//			choice = scan.next();
//			System.out.println("Thanks for playing!");
//			scan.close();
//		}
//
//
//	}
//
//}//game still in progress
