package Question02;

public class Employee <T,U>{
	private U name;
	private T empId;
	
	public Employee(T empId, U name) {
		this.name = name;
		this.empId = empId;
	}

	public T getEmpId() {
		return empId;
	}
	
}
