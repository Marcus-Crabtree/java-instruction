
public class Employee extends Person {
	// instance variables
	private String socSecNum;
	// constructors
	public Employee() { //empty
		super();
	}

	public Employee(String firstName, String lastName, String socSecNum) { // loaded
		super(firstName, lastName);
		this.socSecNum = socSecNum;
	}
	// getters and setters
	//requirement mask ssn xxx-xx-1234
	public String getSocSecNum() {
		String last4 = socSecNum.substring(7);
		return "XXX-XX-"+last4;
	}

	public void setSocSecNum(String socSecNum) {
		this.socSecNum = socSecNum;
	}
	// toString
	@Override
	public String toString() {
		return super.toString()+"\nSSN: "+ getSocSecNum();
	}
	

}
