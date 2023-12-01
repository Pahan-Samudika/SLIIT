package Question04;

public class FishFlavour implements IPrepareDeliciously{

	@Override
	public void addFlavour() {
		System.out.println("Added Fish for thr meal");
	}

	@Override
	public double getCost() {
		return 80;
	}
	
}
