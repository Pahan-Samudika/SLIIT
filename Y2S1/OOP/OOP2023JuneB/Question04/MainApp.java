package Question04;

public class MainApp {

	public static void main(String[] args) {
		MissileSystem HS = HeatMissileSystem.getInstance();
		MissileSystem RS = RocketMissileSystem.getInstance();
		
		MissileController missileController = MissileController.getInstance(HS);
		
		missileController.performLaunching("Colombo");
		missileController.performBlasting("MH370");
		
		missileController.setMissileSystem(RS);
		missileController.performLaunching("Kandy");
		missileController.performBlasting("MH420");
		
	}

}
