package Paper01A;

public class NavigationSatellite implements ISatellite{
	
	String name;
	
	public NavigationSatellite(String name) {
		this.name = name;
	}
	
	@Override
	public void activate() {
		System.out.println(name+" navigation satellite activate");
	}
	
	@Override
	public void deactivate() {
		System.out.println(name+" navigation satellite deactivate");
	}
}
