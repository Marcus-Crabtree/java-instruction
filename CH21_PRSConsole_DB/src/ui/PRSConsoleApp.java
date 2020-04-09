package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import util.Console;

public class PRSConsoleApp {

	private static DAO<User> userRepo = new UserDB();

	public static void main(String[] args) {
		System.out.println("Welcome");

		List<User> users = userRepo.list();

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
			case "list":
				listUsers();
				break;
			case " add":
				addUser();
				break;
			case " del ":
				deleteUser(); // need to complete
				break;
			case "get":
				getUser(); // need to complete
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid entry");
				break;

			}
		}

		System.out.println("Bye!");
	}

	private static void addUser() {
		// prompt all user fields
		String un = Console.getString("Username? ", true);
		String pw = Console.getString("Password? ", true);
		String fn = Console.getString("First Name? ", true);
		String ln = Console.getString("Last Name? ", true);
		String pn = Console.getString("Phone Number? ", true);
		String em = Console.getString("Email? ", true);
		// skipping boolean fields for now..
		User u = new User(un, pw, fn, ln, pn, em, false, false);
		if (userRepo.add(u)) {
			System.out.println("User successfully added.");
		} else {
			System.out.println("Issue adding User.");
		}

	}

	private static void getUser() {
		List<User> users = userRepo.get(id);
		
		for (User u : users) {
			System.out.println(u);
		}
		
		}
		else {
			System.out.println("User not found");
		}
		
	

	private static void listUsers() {
		List<User> users = userRepo.list();

		System.out.println("List of Users...");
		for (User u : users) {
			System.out.println(u);
		}

	}

	private static void deleteUser() { // need to finish

		User u = userRepo.get(id);

		if (userRepo.delete(u)) {
			System.out.println("User successfully added.");
		} else {
			System.out.println("Issue adding User.");
		}

	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("=====================");
		System.out.println("list - List all Users");
		System.out.println("add - Add a User");
		System.out.println("del - Delete a user");
		System.out.println("get - Get a User");
		System.out.println("exit - Exit app");
		System.out.println();
	}

}
