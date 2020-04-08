package ui;

import java.util.ArrayList;      //currently will not add to established list, 
import java.util.List;           //display
								//delete untested
import business.Pets;
import util.Console;

public class PetStoreApp {
	private static List<Pets> pets = null;

	public void List() {
		// initialize the list of movies
		pets = new ArrayList<Pets>();
		Pets p1 = new Pets(1, "Dog", "Golden Retreiver", "Ruby", 5);
		Pets p2 = new Pets(2, "Dog", "Golden Retreiver ", "Cooper", 1);

		pets.add(p1);
		pets.add(p2);
	}

	public static void main(String[] args) {
		// welcome+initialization

		System.out.println("Welcome to the Pet Store App!");

		String command = "";
		// start loop
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			// get user input
			command = Console.getString("Command: ", true);
			System.out.println();

			switch (command) {

			case "list":
				listAllPets();
				break;

			case "add":
				addPet();
				break;

			case "adopt":
				removePet();
				break;

			case "exit":
				// exit app
				break;

			case "default":
				System.out.println("Invalid entry, try again.");
				// error
				break;
			}
			// end loop

		}
		// goodbye
		System.out.println("Goodbye.");
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("========================\n");
		System.out.println();
		menu.append("list   - List all pets\n");
		menu.append("add    - Add a pet to our list\n");
		menu.append("adopt  - Adopt a pet\n");
		menu.append("exit   - Exit the store\n");
		System.out.println(menu);
	}

	public static void addPet() {
		// prompt user for pet data
		int id = Console.getInt("Pet ID: ", 0, (int) Double.POSITIVE_INFINITY);
		String type = Console.getString("Type? ", true);
		String species = Console.getString("Species? ", true);
		String name = Console.getString("Name? ", true);
		double age = Console.getDouble("age? ", 0, (double) Double.POSITIVE_INFINITY);
		// add movie
		Pets p = new Pets(id, type, species, name, age);
		pets.add(p);

		// display confirmation message
		System.out.println("Your pet was successfully added!");

	}

	public static void listAllPets() {
		System.out.println("Pet Inventory");
		System.out.println("---------------");
		System.out.println();
		// get list of all pets
		 List<Pets> pets = pets.getAll();

		// display to screen
		for (Pets p : pets) {
			System.out.println(p);
		}
	}

	public static void removePet() {
		System.out.println("Pet Adoption");
		System.out.println("---------------");
		int id = Console.getInt("Enter th ID you wish to adopt:  ");

		Pets p = pets.get(id);

		System.out.println();
		if (p != null) {
			pets.remove(p);
			System.out.println(p.getName() + " has been Adopted!.\n");
		} else {
			System.out.println("No pet matches that ID.\n");
		}
	}
}
