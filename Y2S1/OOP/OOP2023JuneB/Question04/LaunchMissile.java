package Question04;

public class LaunchMissile implements MissileOperation {

	MissileSystem MS;
	
	public LaunchMissile(MissileSystem MS) {
		this.MS = MS;
	}

	@Override
	public void initiateOperation(String location) {
		MS.launch(location);
	}

}
