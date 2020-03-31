
public class Contact {
	//add define instance variables aka attributes --must be private!!
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	//generate constructors always 2!! default and fully loaded--builds the object 

	public Contact() { //default constructor - type this one out
	firstName = "";
	lastName = "";
	email = "";
	phone = "";
	
	}
	public Contact(String firstName, String lastName, String email, String phone) { //fully loaded constructor generate rclick>source
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	//generate getters and setters
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

	//define displayContact method
	public String displayContact() {
		String contactStr = "-------------------------------------------\n"+
							"----Current Contact------------------------\n"+
							"-------------------------------------------\n"+
							"Name:           "+firstName+" "+lastName+"\n" +
							"Email Address:  "+email+"\n"+
							"Phone NUmber:   "+phone+"\n"+
                            "-------------------------------------------\n";
							
		return contactStr;
	}
	
	//generate toString (optional)
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ "]";
	}


	}

