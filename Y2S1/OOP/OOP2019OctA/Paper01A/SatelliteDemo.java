package Paper01A;

public class SatelliteDemo {

	public static void main(String[] args) {
		
		ISatellite navigationalSatelite = new NavigationSatellite("Ravana-01");
		IGeoLocation locationTracker1 = new SatelliteLocation("Sri-Lanka");
		ISatellite droneSatelite = new DroneSatellite("Ravana-02");
		IGeoLocation locationTracker2 = new SatelliteLocation("Russia");
		
		ISatellite[] sateliteArray = new ISatellite[] {navigationalSatelite,droneSatelite};
		IGeoLocation[] igeoLocation = new IGeoLocation[] {locationTracker1,locationTracker2};
		
		SatelliteCenter sateliteCenter = new SatelliteCenter(0, sateliteArray, igeoLocation);
		sateliteCenter.StartService();
		sateliteCenter.StopService();
		sateliteCenter.locationService();
		
		System.out.println();
		
		SatelliteCenter remoteController2 = new SatelliteCenter(1, sateliteArray, igeoLocation);
		remoteController2.StartService();
		remoteController2.StopService();
		remoteController2.locationService();

	}

}
