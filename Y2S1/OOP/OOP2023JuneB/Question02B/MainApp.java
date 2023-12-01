package Question02B;

public class MainApp {

	public static void main(String[] args) {
		Pair<String,Integer> object1;
		Pair<Double,String> object2;
		
		object1 = new Pair<>("Test 1",42);
		object2 = new Pair<>(3.14,"Test 2");
		
		System.out.println("Printing First Pair");
		System.out.println("First Value : "+object1.getFirst());
		System.out.println("Second Value : "+object1.getSecond());
		
		System.out.println("");
		
		System.out.println("Printing Second Pair");
		System.out.println("First Value : "+object2.getFirst());
		System.out.println("Second Value : "+object2.getSecond());
	}

}
