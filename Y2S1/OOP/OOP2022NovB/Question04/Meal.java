package Question04;

public abstract class Meal {
	IPrepareQuickly time;
	IPrepareDeliciously flavour;
	
	public void setFlavour(IPrepareDeliciously flavour) {
		this.flavour = flavour;
	}
	public void setDuration(IPrepareQuickly time) {
		this.time = time;
	}
	
	public void mealWithFlavour() {
		flavour.addFlavour();
	}
	
	public void mealInDuration() {
		time.deliveryTime();
	}
	
	public abstract void displayMeal();
	public abstract void displayCost();
}
