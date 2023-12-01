package Question04;

public class ChickenFlavour implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Added Chicken for thr meal");
	}

	@Override
	public double getCost() {
		return 100;
	}
	
}
