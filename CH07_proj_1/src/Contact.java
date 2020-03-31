
public class Contact {
	String firstName;
	String lastName;
	String email;
	String phone;
	

	
	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void displayContact() {
		System.out.println(firstName + "," + lastName + "," + email + "," + phone);
	}
}
