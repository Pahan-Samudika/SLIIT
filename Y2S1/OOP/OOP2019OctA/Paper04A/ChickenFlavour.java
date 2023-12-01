package Paper04A;

public class ChickenFlavour implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Added Chicken for the meal");
	}

	@Override
	public double getCost() {
		return 100;
	}

}
