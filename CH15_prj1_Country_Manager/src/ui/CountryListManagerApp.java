package ui;

import db.CountryIO;
import util.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		// welcome+initialization
		System.out.println("Welcome to Country List Manager App.");
		System.out.println();
		CountryIO countryIO = new CountryIO();
		int menunbr = 0;

		while (menunbr != 3) {
			// -start loop
			// display menu
			displayMenu();
			// get user input
			menunbr = Console.getInt("Enter menu number: ", 0, 4);
			System.out.println();
			// business logic
			switch (menunbr) {
			case 1:
				for (String country : countryIO.getCountries()) {
					System.out.println(country);
				}
				System.out.println();
				break;

			case 2:
				String country = Console.getString("Enter country: ", true);
				countryIO.addCountry(country);
				System.out.println("this country has been saved");
				System.out.println();
				break;
			case 3:
				// do nothing exits app
				break;

			// display results
			// --end loop
			}

			// outro
		}
		System.out.println("Goodbye.");
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("1 - List Countries");
		System.out.println("2 - Add Country");
		System.out.println("3 - Exit");
		System.out.println();
	}

}
