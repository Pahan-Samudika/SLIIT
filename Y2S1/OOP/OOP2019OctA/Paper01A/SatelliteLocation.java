package Paper01A;

public class SatelliteLocation implements IGeoLocation{
	String location;
	
	public SatelliteLocation(String location) {
		this.location = location;
	}
	
	@Override
	public void displayLocation() {
		System.out.println("Satellite location is = "+location);
	}
}
