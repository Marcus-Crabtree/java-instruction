
public class Person {
	//instance variables
	private String firstName;
	private String lastName;
	// generate constructors
	public Person() { // default
		super();
	}
	public Person(String firstName, String lastName) { // loaded
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//toString
	@Override
	public String toString() {
		return "Name:" + firstName + " " + lastName;
		
	}
	
	
}
