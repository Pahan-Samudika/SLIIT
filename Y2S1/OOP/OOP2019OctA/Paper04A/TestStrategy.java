package Paper04A;

public class TestStrategy {

	public static void main(String[] args) {
		Meal meal1 = new Breakfast();
		meal1.setFlavour(new ChickenFlavour());
		meal1.setDuration(new ThirtyMinutes());
		meal1.displayMeal();
		
		Meal meal2 = new Lunch();
		meal2.setFlavour(new FishFlavour());
		meal2.setDuration(new OneHour());
		meal2.displayMeal();
		
		Meal meal3 = new Dinner();
		meal3.setFlavour(new EggFlavour());
		meal3.setDuration(new FourtyFiveMinutes());
		meal3.displayMeal();
	}

}
