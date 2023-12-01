package Paper01A;

public class SatelliteCenter {
	private int option;
	
	private ISatellite[] satellites;
	private IGeoLocation[] trackers;
	
	
	public SatelliteCenter(int option, ISatellite[] satellites, IGeoLocation[] trackers) {
		this.option = option;
		this.satellites = satellites;
		this.trackers = trackers;
	}
	
	public void StartService() {
		if(this.option==0) {
			satellites[0].activate();
		}
		if(this.option==1) {
			satellites[1].activate();
		}
	}
	
	public void StopService() {
		if(this.option==0) {
			satellites[0].deactivate();
		}
		if(this.option==1) {
			satellites[1].deactivate();
		}
	}
	
	public void locationService() {
		if(this.option==0) {
			trackers[0].displayLocation();
		}
		if(this.option==1) {
			trackers[1].displayLocation();
		}
	}
}
