import java.util.ArrayList;

public class WizzardsBagApp {

	public static void main(String[] args) {
		// welcome msg
		String choice = "command";
		String grabItem = "";
		int editItemIdx = 0;
		String editItemName = "";
		int dropItemIdx = 0;

		System.out.println("Welcome to the Wizzards bag!");

		ArrayList<String> inventory = new ArrayList<>(3);
		inventory.add("Wooden Staff");
		inventory.add("Wizzard Hat of intelligence");
		inventory.add("Cloth boots of stamina");

		commandMenu();
		choice = Console.getString("\nCommand: ");

		// -- begin loop"
		while (!choice.equalsIgnoreCase("exit")) {
			if (choice.equalsIgnoreCase("show")) {
				for (int i = 0; i < inventory.size(); i++) {
					System.out.println(i + 1 + ". " + inventory.get(i));
				}
			} 
			else if (choice.equalsIgnoreCase("grab")) {

				if (inventory.size() < 4) {
					grabItem = Console.getString("Item name: ");
					inventory.add(grabItem);
					System.out.println(grabItem + " was added!");
				}
			} 
			else if (choice.equalsIgnoreCase("edit")) {
				editItemIdx = Console.getInt("Number: ", 0, inventory.size() + 1);
				editItemName = Console.getString("Updated Item: ");
				inventory.set(editItemIdx - 1, editItemName);
				System.out.println("Item number: " + (editItemIdx) + " was updated!");
			}

			else if (choice.equalsIgnoreCase("drop")) {
				dropItemIdx = Console.getInt("Number: ", 0, inventory.size() + 1);
				System.out.println(
						inventory.get((dropItemIdx) - 1) + " was dropped!" + inventory.remove(dropItemIdx - 1));

			} 
			else if (choice.equalsIgnoreCase("help")) {
				commandMenu();
			}
			else {
				System.out.println("Command not recognized, please try again or type help to display command list.");
			}
			choice = Console.getString("\nCommand: ");
		}
			System.out.println("later Skater!");
		}

	public static void commandMenu() {
		System.out.println("\n List of Commands: \n" + "\nshow - Shows items in bag" + "\nGrab - grab an item"
				+ "\nEdit - change the name of an item" + "\nexit - exit the program");

	}

}


// print out the command menu
// show --
// grab
// edit
// drop
// exit

// user input reuqired
// show - minimum 3 items hold a max of four - sysout
// grab .add item -sysout
// show display arrayList - sysout
// edit is going to me a set command to change item - sysout
// drop is remove obj - sys

// exits

//