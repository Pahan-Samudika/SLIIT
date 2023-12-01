package Paper04A;

public class Breakfast extends Meal{

	@Override
	public void displayMeal() {
		System.out.println("Preparing Breakfast.....");
		super.mealWithFlavour();
		super.mealInDuration();
		displayCost();
		System.out.println();
	}

	@Override
	public void displayCost() {
		System.out.println("Cost for the meal is = "+flavour.getCost());
	}

}
