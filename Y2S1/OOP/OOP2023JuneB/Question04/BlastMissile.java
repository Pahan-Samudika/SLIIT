package Question04;

public class BlastMissile implements MissileOperation {
	
	MissileSystem MS;
	
	public BlastMissile(MissileSystem MS) {
		this.MS = MS;
	}
	
	@Override
	public void initiateOperation(String location) {
		MS.blast(location);
	}

}
