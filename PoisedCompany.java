import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 * public class Poised Company opened as the name of the class
 */
public class PoisedCompany
{
	// Methods of the class
	public static Person getPersonalInfo() {
		Scanner personinput = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = personinput.nextLine();

		personinput = new Scanner(System.in);
		System.out.print("Enter your phone number: ");
		String telNumb = personinput.nextLine();

		personinput = new Scanner(System.in);
		System.out.print("Enter your Email Address: ");
		String emailAddress = personinput.nextLine();

		personinput = new Scanner(System.in);
		System.out.print("Enter your physical Adress: ");
		String physicalAddress = personinput.nextLine();

		Person pers = new Person(name, telNumb, emailAddress, physicalAddress);

		return pers;

	}

	// Method of the project class
	public static Project getProjectInfo() {
		Scanner projectinput = new Scanner(System.in);
		System.out.print("Enter a project name: ");
		String projectName = projectinput.nextLine();

		int projectNumb = 0;
		do {
			try {
				projectinput = new Scanner(System.in);
				System.out.printf("Enter a project number: ");
				projectNumb = projectinput.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid number.");
			}
		} while (true);

		Scanner projectinfoinput = new Scanner(System.in);
		System.out.print("Enter project deadline: ");
		String deadline = projectinfoinput.nextLine();

		projectinfoinput = new Scanner(System.in);
		System.out.print("Enter building type: ");
		String buildingType = projectinfoinput.nextLine();

		int ERFNumber = 0;
		do {
			try {
				projectinfoinput = new Scanner(System.in);
				System.out.print("Enter project ERF number: ");
				ERFNumber = projectinfoinput.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid number.");

			}
		}
		while (true);
		projectinfoinput = new Scanner(System.in);
		System.out.print("Enter project total price: ");
		double totalPrice = projectinfoinput.nextDouble();
		double totalCostPaid = 0;
		// Using the do/while loop to execute the try catch block until the condition is true
		do {
			// Try block usage for checking of errors
			try {
				projectinfoinput = new Scanner(System.in);
				System.out.print("Enter total cost paid: ");
				totalCostPaid = projectinfoinput.nextDouble();
				break;
			// Handle the potential exception
			} catch (Exception e) {
				// Printing the message to be displayed to the user if they performed an incorrect input on the first message
				System.out.println("Please confirm the total amount paid!");
			}
		}
		// While loop used to indicate that the process should be repeated until it is true
		while (true);
		projectinfoinput = new Scanner(System.in);
		System.out.print("Enter physical address: ");
		String physicalAddress = projectinfoinput.nextLine();

		// Getter method to get the Customer's personal information
		System.out.println("Capturing Customer information \n-------------------------------\n");
		Person customer = getPersonalInfo();

		// Getter method to get the Contractor's personal information
		System.out.println("Capturing Contractor information\n-------------------------------\n");
		Person contractor = getPersonalInfo();

		// Getter method to get the Architect's personal information
		System.out.println("Capturing Architecture information\n---------------------------------\n");
		Person architect = getPersonalInfo();

		// The project constructor
		// Returning output information/value from the construction
		return new Project(projectName, projectNumb, deadline, buildingType,
				ERFNumber, totalPrice, totalCostPaid, physicalAddress, contractor, architect, customer);
	}

	// Creation of the static void main class
	public static void main(String[] args) throws ParseException {
		ProjectList listproj = ProjectList.getOnlyList();
		fileReader prfilelist = new fileReader();
		prfilelist.readFromFile();

		do {
			/*main menue*/
			Scanner mainMenu = new Scanner(System.in);//scanner method used to display the new information received 
			System.out.print("Enter AP to add a project:\nEnter ED to edit a project\nEnter VA to view all project: \nEnter VU to view overdue projects: \nEnter e to exit: ");//menu options to be selected by the user based on the transaction they wish to perform
			String userChoice = mainMenu.next();

			if (userChoice.equalsIgnoreCase("Ap")) {
				Project p = getProjectInfo();
				listproj.addProject(p);

			} else if (userChoice.equalsIgnoreCase("VA")) {
				listproj.projectDetails();
			} else if (userChoice.equalsIgnoreCase("VU")) {
				listproj.viewOverdueProjects();
			} else if (userChoice.equalsIgnoreCase("ed")) {
				System.out.print("list project number from the list of projects \n ");
				listproj.projectIds();
				Scanner projectP = new Scanner(System.in);
				System.out.print("Enter the project number: ");
				int projectNum = projectP.nextInt();


				Project construction = listproj.getProject(projectNum);

				if (construction == null) {
					System.out.print("the project does not exist \n");

				} else {
					// Scanner method used to display the new information received
					Scanner projectMenu = new Scanner(System.in);
					// Menu options to be selected by the user based on the transaction that they wish to perform
					System.out.print("Enter CD to change deadline: \nEnter TP to change project total price: \nEnter UP to update contractors contact details: \nEnter AP to add a project: \nEnter F to finalize the project: \nEnter e to exit: \n ");
					String menu = projectMenu.nextLine();
					if (menu.equalsIgnoreCase("CD")) {
						//if the selection from the menu is "CD",the user cases have no impact on their input because of the equalsIgnoreCase
						Scanner projectInfoInput = new Scanner(System.in);
						System.out.print("Enter new project deadline: ");
						String deadline = projectInfoInput.nextLine();
						construction.setDeadline(deadline);
					} else if (menu.equalsIgnoreCase("TP")) {
						Scanner projectInfoInput = new Scanner(System.in);
						System.out.print("Change project total price: ");
						Double total_cost = projectInfoInput.nextDouble();
						construction.setTotalCost(total_cost);
					} else if (menu.equalsIgnoreCase("UP")) {
						Scanner projectInfoInput = new Scanner(System.in);
						System.out.print("Enter new phone number: ");
						String telephone_number = projectInfoInput.nextLine();

						construction.getContractor().setTelephone_number(telephone_number);
						projectInfoInput = new Scanner(System.in);
						System.out.print("Enter new email address: ");
						String email_address = projectInfoInput.nextLine();
						construction.getContractor().setEmail_address(email_address);

						construction.getContractor().setTelephone_number(telephone_number);
						projectInfoInput = new Scanner(System.in);
						System.out.print("Enter new physical address: ");
						String physical_address = projectInfoInput.nextLine();
						construction.getContractor().setPhysicalAddress(physical_address);

						System.out.println("Contractor \n");
						System.out.println(construction.getContractor() + "\n");
					}
					//********************************************************************************************************************
					else if (menu.equalsIgnoreCase("F")) {
						double tot_Amount = construction.getTotalCost();
						System.out.println(tot_Amount);
						double total_price_paid = construction.getTotalCostPaid();
						//System.out.println(totalPricePaid);

						double out = tot_Amount - total_price_paid;
						System.out.println(out);

						String[] invoice = new String[5];
						double totalFee = construction.getTotalCost();
						double totalAmountDate = construction.getTotalCostPaid();
						System.out.println("***** These are the outstanding fees *****");
						double finalTotal = totalFee - totalAmountDate;

						if (finalTotal > 0) {
							invoice[0] = "Customer name: " + construction.customer.getName();
							invoice[1] = "Customer telephone number: " + construction.customer.getTelephone_number();
							invoice[2] = "Customer email address: " + construction.customer.getEmail_address();
							invoice[3] = "Customer physical address: " + construction.customer.getPhysical_address();
							invoice[4] = "Date Finalised: " + LocalDateTime.now();


							// Added a file writer here to write an invoice to a new text file
							try {
								BufferedWriter fileWriter = new BufferedWriter(new FileWriter("completedProjects.txt", true));
								String data = "";
								for (String deets : invoice) {
									fileWriter.write(deets + "\n");
								}
								fileWriter.write("\n\n");
								System.out.println("==== The file was successfully updated. ====");
								fileWriter.close();
							} catch (Exception e) {
								System.out.print("File updating failed.");
							}

							// Setting new date and writing to completed projects text file
							DateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
							String newDate = dFormat.format(new Date());
							construction.setDeadline(newDate);

							System.out.println("***** Client Details *****\n");
							System.out.println(construction.getCustomer() + "\n");

							// Method here removes a project so that we can have an arraylist of only fresh projects.
							listproj.removeProject(construction);
						} else {
							System.out.println("There are still outstanding fines.");
						}
					}
				}
			} else if (userChoice.equalsIgnoreCase("e")) {
				break;
			}

		} while (true);
		fileWriter f = new fileWriter();
		f.writeToFile();
	}
}


