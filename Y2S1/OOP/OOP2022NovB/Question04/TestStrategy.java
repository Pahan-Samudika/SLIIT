package Question04;

public class TestStrategy {

	public static void main(String[] args) {
		
		Meal meal = new Breakfast();
		meal.setFlavour(new ChickenFlavour());
		meal.setDuration(new ThirtyMinutes());
		meal.displayMeal();
	}

}
