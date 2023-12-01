package Question01;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		Student S1 = new Student();
		Student S2 = new Student();
		Course C1 = new Course();
		Course C2 = new Course();
		
		
		S1.Read();
		System.out.println("");
		
		S2.Read();
		System.out.println("");
		
		C1.Read();
		System.out.println("");
		
		C2.Read();
		System.out.println("");
		
		C1.AddStudent(S1);
		C1.AddStudent(S2);
		C2.AddStudent(S1);
		
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		
		studentList.add(S1);
		studentList.add(S2);
		courseList.add(C1);
		courseList.add(C2);
		
		System.out.println("Student Information : ");
		for(Student student:studentList) {
			student.Print();
		}
		
		System.out.println("Course Information : ");
		for(Course course:courseList) {
			course.Print();
		}
	}

}
