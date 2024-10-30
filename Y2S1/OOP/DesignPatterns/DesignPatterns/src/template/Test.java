package template;

public class Test {
	
	static Beverages beverage = null;

	public static void main(String[] args) {
		
		Beverages tea = new Tea();
		
		tea.prepareRecepe();
		System.out.println("=======================");
		
		Beverages coffee = new Coffee();
		
		coffee.prepareRecepe();
		
	}

}
