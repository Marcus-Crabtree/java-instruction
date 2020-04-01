
public class Customer extends Person {
	// instance variable
	private String customerNumber;
	// constructors
	public Customer() { // empty/ default
		super();
	}

	public Customer(String firstName, String lastName, String customerNumber) {  // loaded
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}
	
	// getters and setters

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	// toString
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + "]";
	}

	
}
