package Paper02A;

public class Student implements IPerson{
	private String studentID;
	private int grade;
	
	public Student(String studentID, int grade) {
		this.studentID = studentID;
		this.grade = grade;
	}
	
	public String displayDetails() {
		return "Student = "+studentID+", Grade = "+grade;
	}
}
