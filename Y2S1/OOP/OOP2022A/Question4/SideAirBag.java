package Question4;

public class SideAirBag implements CarAirBag {
	@Override
	public void airBagMotionDetection() {
		System.out.println("Motion detection on for Side Air Bag");
	}
	
	public void airBagLightlndecator() {
		System.out.println("Light Indicator on for Side Air Bag");
	}
}
