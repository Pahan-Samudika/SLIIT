package Ques03;

import java.util.Scanner;

public class Student {
	private String id;
	private String names;
	private float marks[];
	private int noOfSubjects;
	
	public Student(String id, String names) {
		this.id = id;
		this.names = names;
	}
	
	public float inputMarks(int index) throws MarksException {
		Scanner scn = new Scanner(System.in);
		float mark = 0;
		
		System.out.print("Enter marks : ");
		mark = scn.nextFloat();
		
		if(mark<0 || mark>100) {
			throw new MarksException(mark);
		}
		return mark;
	}
	
	public void input() throws MarksException{
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.print("Enter Subject Number : ");
			noOfSubjects = scn.nextInt();
			
			if(noOfSubjects<0) {
				throw new MarksException("Invalid value");
			}
			
			marks =new float[noOfSubjects];
			
			try {
				for(int i=0;i<noOfSubjects;i++) {
					System.out.print("Subject "+(i+1)+" , ");
					marks[i]=inputMarks(noOfSubjects);
				}
				
			} catch (MarksException e) {
				System.out.println("Value "+e.getMarks()+" is invalid for Marks");
			}
			
		}catch(MarksException x) {
			System.out.println(x);
		}
	}
	
	public float getAverage(){
		float total=0,avg=0;
		
		try {
			for(int i=0;i<noOfSubjects;i++) {
				total+=marks[i];
			}
			
			avg = total/noOfSubjects;
			
		}catch(NullPointerException e) {
			System.out.println("");
		}
		
		return avg;
	}
}
