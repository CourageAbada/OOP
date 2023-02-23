import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * a public class for the project list is created
 */
public class ProjectList {
	private static ProjectList onlyList = null;
	ArrayList<Project> plist;

	/**
	 * a private class for the project list is created with the variable projectlist to recognize the arrayList of all the projects
	 */
	private ProjectList() {
		plist = new ArrayList<Project>();
	}

	/**
	 * the getOnlyList function is used to get the list of projects from the file
	 * the onlyList variable name is now going to be used to recognize the project list noted on the file
	 *
	 * @return the data found under the onlyList variable name
	 */
	public static ProjectList getOnlyList() {
		if (onlyList == null) {
			onlyList = new ProjectList();
		}

		return onlyList;
	}

	/**
	 * using the getter method to get data of a specific project from the project arrayList
	 *
	 * @return the data from the arrayList using the projlist variable name
	 */
	public ArrayList<Project> getPlist() {
		return plist;
	}

	/**
	 * public void class
	 *
	 * @param p is used for adding information in a project from the projList
	 */
	public void addProject(Project p) {
		plist.add(p);
	}

	public void removeProject(Project p) {
		plist.remove(p);
	}
	/**
	 * for loop created under the public void projectDetails to print out/display the details about a project from the list in a new line format
	 */
	public void projectDetails() {
		for (Project p : plist) {
			System.out.println(p);
			System.out.println("\n\n");
		}
	}

	/**
	 * for loop created under under the public void projectIds class to display/print out the details about a project using the projects id number
	 */
	public void projectIds() {
		for (Project p : plist) {
			System.out.println("project number: " + p.getProjectNum());
		}
	}

	/**
	 * method to return all overdue projects
	 */
	public void viewOverdueProjects() throws ParseException {
		for (Project poised : plist) {
			Date deadlineProject = new SimpleDateFormat("dd/MM/yyyy").parse(poised.getDeadline());
			Date currentDate = new Date();
			System.out.println("*******\n" + deadlineProject);
			if (deadlineProject.compareTo(currentDate) > 0) {
				System.out.println(poised + "\n\n===============================================================\n\n");
			} else {
				System.out.println("All projects are up to date.");
			}
		}
	}


	/**
	 * @param projectId
	 * @return the project from the projlist using the projectId of which
	 */
	public Project getProject(int projectId) {
		int index = 0;
		for (Project p : plist) {
			if (p.getProjectNum() == projectId) {
				plist.remove(index);// y are we removing the index
				return p;
			}
			index++;
		}
		return null;
	}
}