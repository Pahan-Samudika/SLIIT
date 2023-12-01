package Question01;

public abstract class Customer {
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Customer ID : "+id);
		System.out.println("Customer Name : "+name);
	}
	
	public abstract void calculateBill();
	
}
