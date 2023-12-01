package Ques04b;

public class Oven {
	private String name;

	public Oven(String name) {
		this.name = name;
	}
	
	void on() {
		System.out.println(name+" Oven is on");
	}
	
	void off() {
		System.out.println(name+" Oven is off");
	}
}
