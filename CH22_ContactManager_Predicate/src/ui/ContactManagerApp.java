package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import business.Contact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		List<Contact> contacts = new ArrayList<>();

		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// print out a list of all contact
		System.out.println("All contacts: ");
		displayContacts(contacts);
		
		System.out.println("Contacts with no phone: ");
		List<Contact> contactsNoPhone = filterContacts(contacts,c -> c.getPhone()==null);
		displayContacts(contactsNoPhone);
	
		System.out.println("Contacts with no email: ");
		List<Contact> contactsNoEmail = filterContacts(contacts,c -> c.getEmail()==null);
		displayContacts(contactsNoEmail);
		
		System.out.println("Contacts with no email nor phone: ");
		List<Contact> contactsNoEmailNoPhone = filterContacts(contacts,c -> c.getEmail()==null && c.getPhone()== null);
		displayContacts(contactsNoEmailNoPhone);
	
		System.out.println("Contacts with last name Murach: ");
		List<Contact> contactsMurach = filterContacts(contacts,c -> c.getName().contains("Murach"));
		displayContacts(contactsMurach);
	
		
	}

	
	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact>
filteredContacts = new ArrayList<>();
		for( Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
		}
	
	private static void displayContacts(List<Contact> contacts) {
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
	}
}