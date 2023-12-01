package Question01;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	private String CourseId;
	private String name;
	private String instructor;
	ArrayList<Student> enrolledStudents;
	
	public Course() {
		
	}

	public Course(String courseId, String name, String instructor) {
		CourseId = courseId;
		this.name = name;
		this.instructor = instructor;
	}

	public void Read() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Course ID : ");
		this.CourseId = scn.next();
		System.out.print("Enter Course Name : ");
		this.name = scn.next();
		System.out.print("Enter Instructor : ");
		this.instructor = scn.next();
	}
	
	public void AddStudent(Student student){
		
		if(enrolledStudents==null) {
			enrolledStudents = new ArrayList<>();
		}
		enrolledStudents.add(student);
		
	}
	
	public void Print() {
		System.out.println("Course ID : " + CourseId);
		System.out.println("Course Name : " + name);
		System.out.println("Instructor : " + instructor);
		System.out.println("Enrolled Students : ");
		for(Student x : enrolledStudents) {
			System.out.println(x.getName());
		}
		System.out.println("");
	}
}
