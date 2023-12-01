package Question04;

public class MissileController {
	
	private static MissileController instance;
	MissileSystem MS;
	BlastMissile blast;
	LaunchMissile launch;
	
	
	private MissileController(MissileSystem MS) {
		this.MS = MS;
	}
	
	public void setMissileSystem(MissileSystem MS) {
		this.MS = MS;
	}

	public static MissileController getInstance(MissileSystem MS) {
		if(instance==null) {
			instance = new MissileController(MS);
			System.out.println("Initialize Missile Controller");
		}
		return instance;
	}
	
	public void performLaunching(String start) {
		launch = new LaunchMissile(MS);
		this.launch.initiateOperation(start);
	}
	
	public void performBlasting(String end) {
		blast = new BlastMissile(MS);
		this.blast.initiateOperation(end);
	}
}
