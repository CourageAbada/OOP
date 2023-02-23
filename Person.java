/**
 * public class for person is created to maintain all the information about the persons that will be listed in the project details
 */
// class person
public class Person {
	// Attributes of the Person class
	private String name;
	String telephone_number;
	String email_address;
	private String physical_address;
	private String telephoneNumber;
	private String emailAddress;
	private String physicalAddress;

	/**
	 * @param name             indicates the name of the person that will be part of the project
	 * @param telephone_number indicates the telephone numbers of the person
	 * @param email_address    indicates the email address of the person
	 * @param physical_address indicates the physical address of the person
	 */
// Constructor of the person class
	public Person(String name, String telephone_number, String email_address, String physical_address) {
		this.name = name;
		this.telephone_number = telephone_number;
		this.email_address = email_address;
		this.physical_address = physical_address;
	}

	/**
	 * getter method used to get the name of the person
	 *
	 * @return the name of the person
	 */
	public String getName() {// Getter method used to get the name of the person
		return name;// Returning of the name
	}

	/**
	 * getter method used to get the telephone number of the person
	 *
	 * @return telephone number of the person
	 */
	public String getTelephone_number() {//getter method used to get the name of the person
		return telephone_number; // Returning of the telephone number
	}

	/**
	 * getter method to get the email address of the person
	 *
	 * @return email address
	 */
	public String getEmail_address() {//getter method used to get the email address of the person
		return email_address;// Returning of the email address
	}

	/**
	 * getter method used to get the physical address of the person
	 *
	 * @return physical address of the person
	 */
	public String getPhysical_address() {
		return physical_address;
	}

	/**
	 * setter method for setting the person telephone number
	 *
	 * @param newTelephone_number String variable to be printed
	 */
	// Public void class to set the telephone number
	public void setTelephone_number(String newTelephone_number) {
		telephone_number = newTelephone_number;
	}

	/**
	 * setter method for setting the person email address
	 *
	 * @param newEmailAddress String variable to be printed
	 */
	// Public void class to set the email address
	public void setEmail_address(String newEmailAddress) {
		email_address = newEmailAddress;
	}

	/**
	 * setter method for setting the person physical address
	 *
	 * @param newPhysicalAddress String variable to be printed
	 */
	// Public void class to set/change the physical address if necessary
	public void setPhysicalAddress(String newPhysicalAddress) {
		physical_address = newPhysicalAddress;
	}

	/**
	 * Using the toString class displaying the format the data captured from this code when being printed out
	 *
	 * @return the output of the display of the output details on the toString
	 */
	// Returning the output of the formatting of the toString information
	public String toString() {
		String output = "Name: " + name;
		output += "\nTelephone number: " + telephoneNumber;
		output += "\nEmail address: " + emailAddress;
		output += "\nPhysical address: " + physicalAddress;
		return output;

	}

	/**
	 * Public class created to display the information on the file opened
	 *
	 * @return the format of the displaying of the information when printed on the file
	 */
	public String toFile() {
		return name + ", " + telephoneNumber + ", " + emailAddress + ", " + physicalAddress;
	}
}
