package Question04;

public class RocketMissileSystem implements MissileSystem{

	private static RocketMissileSystem instance = null;
	
	private RocketMissileSystem() {
		
	}
	
	public static RocketMissileSystem getInstance() {
		if(instance==null) {
			instance = new RocketMissileSystem();
			System.out.println("Initialize Rocket Missile System...");
		}
		
		return instance;
	}
	
	@Override
	public void launch(String source) {
		System.out.print("Rocket Missile launch from "+source);
	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Rocket Missile blast Flight "+destination);
	}

}
