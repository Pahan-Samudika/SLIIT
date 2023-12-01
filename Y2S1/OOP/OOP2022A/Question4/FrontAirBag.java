package Question4;

public class FrontAirBag implements CarAirBag {
	
	@Override
	public void airBagMotionDetection() {
		System.out.println("Motion detection on for Front Air Bag");
	}
	
	public void airBagLightlndecator() {
		System.out.println("Light Indicator on for Front Air Bag");
	}
	
}
