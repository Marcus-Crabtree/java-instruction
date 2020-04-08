package ui;

import java.util.ArrayList;       
import java.util.List;           
								
import business.Pet;
import util.Console;

public class PetStoreApp {
	private static List<Pet> pets = new ArrayList<Pet>();

	public void List() {
		// initialize the list of movies
		pets = new ArrayList<Pet>();
	}

	public static void main(String[] args) {
		Pet p1 = new Pet(1, "Dog", "Golden Retreiver", "Ruby", 5);
		Pet p2 = new Pet(2, "Dog", "Golden Retreiver ", "Cooper", 1);
		
		pets.add(p1);
		pets.add(p2);
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
		Pet p = new Pet(id, type, species, name, age);
		pets.add(p);

		// display confirmation message
		System.out.println("Your pet was successfully added!");

	}

	public static void listAllPets() {
		System.out.println("Pet Inventory");
		System.out.println("---------------");
		System.out.println();
		// get list of all pets
		 

		// display to screen
		for (Pet p : pets) {
			System.out.println(p);
		}
	}

	public static void removePet() {
		System.out.println("Pet Adoption");
		System.out.println("---------------___");
		int id = Console.getInt("Enter th ID you wish to adopt:  ");

		Pet petToRemove = null;
		for (Pet p: pets) {
			if (p.getId()== id) {
				petToRemove =p;
				break;
			}
		}

		System.out.println();
		if (petToRemove != null) {
			pets.remove(petToRemove);
			System.out.println(petToRemove.getName() + " has been Adopted!.\n");
		} else {
			System.out.println("No pet matches that ID.\n");
		}
	}
}
