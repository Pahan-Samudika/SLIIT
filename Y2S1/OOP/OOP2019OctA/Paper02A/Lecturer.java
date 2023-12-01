package Paper02A;

public class Lecturer implements IPerson{
	String employeeID;
	String department;
	
	public Lecturer(String employeeID, String departmrnt) {
		this.employeeID = employeeID;
		this.department = departmrnt;
	}

	@Override
	public String displayDetails() {
		return "Lecturer = "+employeeID+", Department = "+department;
	}
}
