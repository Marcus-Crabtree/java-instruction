
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
	public String getSocSecNum() {
		return socSecNum;
	}

	public void setSocSecNum(String socSecNum) {
		this.socSecNum = socSecNum;
	}
	// toString
	@Override
	public String toString() {
		return "Employee [socSecNum=" + socSecNum + "]";
	}
	

}
