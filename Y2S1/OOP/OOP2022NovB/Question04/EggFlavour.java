package Question04;

public class EggFlavour implements IPrepareDeliciously{
	@Override
	public void addFlavour() {
		System.out.println("Added Egg for thr meal");
	}

	@Override
	public double getCost() {
		return 60;
	}
}
