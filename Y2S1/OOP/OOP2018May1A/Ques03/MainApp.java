package Ques03;

public class MainApp {

	public static void main(String[] args) throws MarksException {
		Student student = new Student("1111","Saman");
		
		student.input();
		
		System.out.println("Average : "+student.getAverage());
	}

}
