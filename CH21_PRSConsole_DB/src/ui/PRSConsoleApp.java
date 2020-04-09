package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;

public class PRSConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome");

		DAO<User> userRepo = new UserDB();
		List<User> users = userRepo.list();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true)
		}
		
		System.out.println("List of Users...");
		for (User u: users) {
			System.out.println(u);
		}
		
		
		System.out.println("Bye!");
	}

	private static void displayMenu( ) {
		System.out.println("COMMAND MENU:");
		System.out.println("=====================");
		System.out.println("list - List all Users");
		System.out.println("add - Add a User");
		System.out.println("del - Delete a user");
		System.out.println("exit - Exit app");
		System.out.println();
	}
	
	
	
	
	
	
	
}
