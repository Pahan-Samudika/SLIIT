package Question1;

public class Demo {

	public static void main(String[] args) {
		Pet S1 = new Squirrel("Run3");
		S1.cuddle();
		S1.feed();
		S1.GetTotalPoints();
		
		Pet S2 = new Squirrel("Run5");
		S2.cuddle();
		S2.feed();
		S2.GetTotalPoints();
		
		Pet C1 = new Cat();
		C1.clean();
		C1.cuddle();
		C1.feed();
		C1.GetTotalPoints();
		
		Pet P1 = new Parrot("Walk");
		P1.feed();
		P1.GetTotalPoints();

	}

}
