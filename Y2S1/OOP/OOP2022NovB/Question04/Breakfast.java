package Question04;

public class Breakfast extends Meal{
	
	Meal meal;

	@Override
	public void displayMeal() {
		System.out.println("Preparing Breakfast.....");
		super.mealWithFlavour();
		super.mealInDuration();
		displayCost();
	}

	@Override
	public void displayCost() {
		System.out.println("Cost for the meal is = "+flavour.getCost());
	}

}
