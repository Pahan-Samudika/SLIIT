package Question01;

import java.util.Scanner;

public class Student {
	private String StudentId;
	private String name;
	private String address;
	private String contactno;
	
	public Student() {
		
	}

	public Student(String studentId, String name, String address, String contactno) {
		StudentId = studentId;
		this.name = name;
		this.address = address;
		this.contactno = contactno;
	}
	
	public String getName() {
		return name;
	}

	public void Read() {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Student ID : ");
		this.StudentId = scn.next();
		System.out.print("Enter Student Name : ");
		this.name = scn.next();
		System.out.print("Enter Student Address : ");
		this.address = scn.next();
		System.out.print("Enter Student Telephone : ");
		this.contactno = scn.next();
	}
	
	public void Print() {
		System.out.println("Student ID is : " + StudentId);
		System.out.println("Student Name is : " + name);
		System.out.println("Student Address is : " + address);
		System.out.println("Student Telephone is : " + contactno);
		System.out.println("");
	}
	
	

}
