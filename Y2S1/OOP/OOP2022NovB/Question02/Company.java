package Question02;

import java.util.HashMap;
import java.util.Map;

public class Company {
	public static void main(String args[]) {
		
		Map<Integer,Employee<?,?>> empList = new HashMap<>();
		
		Employee<String,String> emp1 = new Employee<>("EMP12345","Nishan Perera");
		empList.put(1, emp1);
		Employee<Integer,String> emp2 = new Employee<>(12345,"Saman Kumara");
		empList.put(2, emp2);
		
		for(int id:empList.keySet()) {
			Employee<?,?> value = empList.get(id);
			System.out.println("Employee number: "+id+ " and the Employee ID is: "+value.getEmpId());
		}
	}
}
