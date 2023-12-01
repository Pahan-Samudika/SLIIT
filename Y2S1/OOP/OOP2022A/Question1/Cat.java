package Question1;

public class Cat extends Pet{
	
	public void feed() {
		super.feed();
		System.out.println("Feeding the Cat");
	}
	
	public void clean() {
		super.clean();
		System.out.println("Cleaning the Cat");
	}
	
	public void cuddle() {
		super.cuddle();
		System.out.println("Cuddling the Cat");
	}

}
