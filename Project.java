/**
 * public class Project created
 */
public class Project {
    private final String physicalAddress;
    /**
     * Public class project attributes for the class project
     */
            private String projectName;//attribute of class Project
            private int projectNum;//attribute of class Project
            String deadline;//attribute of class Project
            String buildingType;//attribute of class Project
            private int ERFNumber;//attribute of class Project
            private double totalCost;//attribute of class Project
            private double totalCostPaid;//attribute of class Project
            String physical_address;

            /**
             * Objects from the class person
             */
            // Object of the persons class
            Person contractor;
            Person architect;
            Person customer;

            /**
             * Class project constructor
             *
             * @param projectName     message String variable to be printed
             * @param projectNum      message int variable to be printed
             * @param deadline         message String variable to be printed
             * @param buildingType    message String variable to be printed
             * @param ERFNumber       message int variable to be printed
             * @param totalCost       message double variable to be printed
             * @param totalCostPaid  message double variable to be printed
             * @param physicalAddress message String variable to be printed
             * @param contractor            Person object to be printed
             * @param architect              Person object to be printed
             * @param customer         Person object to be printed
             */
            public Project(String projectName, int projectNum, String deadline, String buildingType, int ERFNumber,
                           double totalCost, double totalCostPaid, String physicalAddress,
                           Person contractor, Person architect, Person customer) {
                /**
                 * New variable names for the information in the project class
                 */
                this.projectName = projectName;
                this.ERFNumber = ERFNumber;
                this.projectNum = projectNum;
                this.physicalAddress = physicalAddress;
                this.deadline = deadline;
                this.buildingType = buildingType;
                this.totalCost = totalCost;
                this.totalCostPaid = totalCostPaid;
                // Variable used for people attributes
                this.contractor = contractor;
                this.architect = architect;
                this.customer = customer;
            }

            /**
             * getter method used to get the details about the object Contractor from the person class
             *
             * @return details of variable contractor
             */
            public Person getContractor() {//using the getter method to get the contractor information
                return contractor;// Returning of the contractor information
            }

            /**
             * getter method used to get the details about the object Customer from the person class
             *
             * @return details of variable customer
             */
            public Person getCustomer() {//using the getter method to get the customer information
                return customer;// Returning of the customer information
            }

            /**
             * getter method used to get details about object Architect from the person class
             *
             * @return details of variable architect
             */
            public Person getArchitect() {//using the getter method to get the architect information
                return architect;// Returning of the architect information
            }

            /**
             * setter method to set the deadline date
             *
             * @param newDate variable used to set the deadline of the project
             */
            public void setDeadline(String newDate) {//setter method to set the new date to be displayed on the invoice
                deadline = newDate;// The deadline is now set to a new deadline date
            }

            /**
             * setter method to set the total cost of the projct
             *
             * @param newTotalCost variable used when printing the total cost of the project
             */
            public void setTotalCost(Double newTotalCost) {// Setter method is set to the total cost to be displayed on the invoice
                totalCost = newTotalCost;// The total cost is now set to the new total cost
            }

            /**
             * getter method used to get the information of the project name
             *
             * @return variable project_name
             */
            public String getProjectName() {//using the getter method to get the project name of the project
                return projectName;// Returning of the project name
            }

            /**
             * getter method used to get the ERF number of the project
             *
             * @return variable ERF_number
             */
            public int getERFNumber() {//using the getter method to get the ERF number of the project
                return ERFNumber;// Returning of the ERF number
            }

            /**
             * getter method to get the project number of the project
             *
             * @return variable project_num
             */
            public int getProjectNum() {//using the getter method to get the project number
                return projectNum;// Returning of the project number of the project
            }

            /**
             * getter method to get the physical address of the project
             *
             * @return variable physical_address
             */
            public String getPhysicalAddress() {//using the getter method to get the physical address of the project
                return physicalAddress;// Returning of the project physical address
            }

            /**
             * getter method to get the deadline of the project
             *
             * @return variable deadline
             */
            public String getDeadline() {//using the getter method to get the deadline
                return deadline;// Returning of the deadline of the project
            }

            /**
             * getter method to get details about the building type of the project
             *
             * @return variable building_type
             */
            public String getBuildingType() {//using the getter method to get the building type information
                return buildingType;// Returning of the building type information
            }

            /**
             * getter method used to get the total cost of the project
             *
             * @return variable total_cost
             */
            public double getTotalCost() {//using the getter method to get the total cost information
                return totalCost;// Returning of the total cost information
            }

            /**
             * getter method to get the total cost paid
             *
             * @return variable total_cost_paid
             */
            public double getTotalCostPaid() {//using the getter method to get the total cost paid information
                return totalCostPaid;// Returning of the total cost paid information
            }

            /**
             * Using the toString class displaying the format the data captured from this code when being printed out
             *
             * @return the output information captured about the project printed on the screen
             */
            // Using the toString method to format the data collected
            // Public toString method used to present the output data
            public String toString() {
                String output = "Project name: " + projectName;
                output += "\nProject num: " + projectNum;
                output += "\nDeadline: " + deadline;
                output += "\nBuilding type: " + buildingType;
                output += "\nERF number: " + ERFNumber;
                output += "\nTotal cost: " + totalCost;
                output += "\nTotal cost paid: " + totalCostPaid;
                output += "\nPhysical address: " + physicalAddress;
                output += "\n----------------\nCustomer details:\n" + customer;
                output += "\n----------------\nContractor details:\n" + contractor;
                output += "\n----------------\nArchitect details:\n" + architect;

                // Returning of the output of the formatted data from the toString
                return output;
            }

            /**]
             * public String toFile class opened for the capturing of information and formatting in the file
             *
             * @return details about the project in the specified format to be printed or sequenced on the file
             */
            public String toFile() {
                return projectName + ", " + projectNum + ", " + deadline +
                        ", " + buildingType + ", " + ERFNumber + ", " +
                        totalCost + ", " + totalCostPaid+ ", " + physicalAddress + ", " + contractor.toFile() + ", " + architect.toFile() + ", " + customer.toFile();
                }
            }


