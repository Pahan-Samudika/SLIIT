package Question2;

public class DemoApp {

	public static void main(String[] args) {
		TCalculation <Integer> intCal = new TCalculation<>();
		
		TCalculation <Double> douCal = new TCalculation<>();
		
		intCal.append(5);
		intCal.append(10);
		intCal.append(5);
		intCal.append(10);
		
		System.out.println("Average of Int List : "+intCal.average());
		
		
		douCal.append(4.0);
		douCal.append(8.0);
		douCal.append(4.0);
		douCal.append(8.0);
		
		System.out.println("Average of Double List : "+douCal.average());
	}

}
