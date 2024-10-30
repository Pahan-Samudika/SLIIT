package template;

public abstract class Beverages {
	void prepareRecepe() {
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}
	
	abstract void addCondiments();
	abstract void brew();
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pour into cup");
	}
}

class Tea extends Beverages{
	@Override
	void addCondiments() {
		System.out.println("Adding lemon");
	}
	
	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}
}

class Coffee extends Beverages{
	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");
	}
}
