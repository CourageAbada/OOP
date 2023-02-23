import java.util.*;

/**
 * public class fileWriter created for writing on the file
 * variable projList that will be used to store information from the list of information in the file
 */
public class fileWriter {
	ProjectList projList;

	/**
	 * getter method used on the class to get the list of information on the list using the variable projList
	 */
	public fileWriter() {
		projList = ProjectList.getOnlyList();
	}

	/**
	 * try and catch block used for controlling potential errors that may occur when writing to the file
	 */
	public void writeToFile() {
		try {
			Formatter fileWriter = new Formatter("projectList.txt");
			String data = "";
			for (Project p : projList.getPlist()) {
				data += p.toFile() + "\n";
			}
			data = data.substring(0, data.length() - 1);

			fileWriter.format("%s", data);
			fileWriter.close();

			System.out.print(data);
			System.out.println("The file was successfully updated.");
		} catch (Exception e) {
			System.out.print("File updating failed.");

		}

	}

}
