/**
 * import of the java.io.File
 */

import java.io.File;
import java.util.Scanner;

/**
 *
 *public class fileReader opened for reading the information from the opened file
 *variable name that will be used to read the information on the list from the file
 */
public class fileReader {
	// Attributes
	ProjectList plist;

	/**
	 *constructor
	 *variable plist to read the information received from the list when the getter method was used
	 */
	public fileReader() {

		plist = ProjectList.getOnlyList();
	}

	/**
	 * public void readFromFile class opened for reading the information on the file opened
	 */
	public void readFromFile() {
/**
 * try and catch block used for the exception to errors in the file
 */
		try {

			File projFile = new File("projectList.txt");
			Scanner fileInput = new Scanner(projFile);

			while (fileInput.hasNextLine()) {
				String fileData = fileInput.nextLine();
				String[] dataArray = fileData.split(", ");

/**
 * indexing of the project details and the objects from the person class
 */
				String prname = dataArray[0];
				String prtype = dataArray[3];
				int projectNumber = Integer.parseInt(dataArray[1]);
				double totalAmount = Double.parseDouble(dataArray[5]);
				double amountPaid = Double.parseDouble(dataArray[6]);
				String projDeadline = dataArray[2];
				int ERF = Integer.parseInt(dataArray[4]);
				String Physical_address = dataArray[7];

				// Contractors details
				String contractorName = dataArray[8], contractorTeleNum = dataArray[9], contractorEmail = dataArray[10],
						contractorPhysicalAddress = dataArray[11];

				// Architect details
				String arcName = dataArray[12], architectTeleNum = dataArray[13], architectEmail = dataArray[14], architectPhysicalAddress = dataArray[15];

				// Customer details
				String cusName = dataArray[16], customerTeleNum = dataArray[17], customerEmail = dataArray[18], customerPhysicalAddress = dataArray[19];
				Person fileConstructor = new Person(contractorName, contractorTeleNum, contractorEmail, contractorPhysicalAddress);
				Person fileArchitecture = new Person(arcName, architectTeleNum, architectEmail, architectPhysicalAddress);
				Person fileCustomer = new Person(cusName, customerTeleNum, customerEmail, customerPhysicalAddress);
				Project fileObject = new Project(prname, projectNumber, projDeadline, prtype, ERF, totalAmount, amountPaid, Physical_address, fileConstructor, fileArchitecture, fileCustomer);

/**
 * variable plist.addProject will be used to add a file object
 */
				plist.addProject(fileObject);
			}
		} catch (Exception ex) {
/**
 * message to be printed out on the screen if there may be any errors		
 */
			System.out.println("File reading has failed.");
		}
	}
}



