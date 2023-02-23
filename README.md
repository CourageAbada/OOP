# OOP
This code contains a Java class called Project. The Project class represents a construction project and has several attributes, including:

projectName: the name of the project
projectNum: the project number
deadline: the deadline for the project
buildingType: the type of building being constructed
ERFNumber: the ERF number for the project
totalCost: the total cost of the project
totalCostPaid: the total amount paid for the project
physicalAddress: the physical address of the project
The Project class also has three attributes that are objects of the Person class, representing the contractor, architect, and customer of the project.

Class Constructor
The Project class has a constructor that takes in the following parameters:

java
Copy code
public Project(String projectName, int projectNum, String deadline, String buildingType, int ERFNumber,
               double totalCost, double totalCostPaid, String physicalAddress,
               Person contractor, Person architect, Person customer)
This constructor creates a new instance of the Project class with the given attribute values.

Getter and Setter Methods
The Project class has several getter and setter methods for accessing and modifying its attributes. These methods include:

getProjectName(): returns the project name
getProjectNum(): returns the project number
getDeadline(): returns the project deadline
getBuildingType(): returns the building type
getERFNumber(): returns the ERF number
getTotalCost(): returns the total cost of the project
getTotalCostPaid(): returns the total amount paid for the project
getPhysicalAddress(): returns the physical address of the project
getContractor(): returns the Person object representing the contractor of the project
getArchitect(): returns the Person object representing the architect of the project
getCustomer(): returns the Person object representing the customer of the project
setDeadline(String newDate): sets a new deadline for the project
setTotalCost(Double newTotalCost): sets a new total cost for the project
Attributes
The Project class has several attributes that can be accessed using the getter and setter methods described above. These attributes include:

projectName: the name of the project
projectNum: the project number
deadline: the deadline for the project
buildingType: the type of building being constructed
ERFNumber: the ERF number for
