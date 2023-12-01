package Question4;

public class ToyotaCar implements Car {
	CarAirBag A;
	
	public ToyotaCar(CarAirBag A) {
		this.A = A;
	}
	
	@Override
	public void assembleLight() {
		System.out.println("Assembling for Toyota");
		A.airBagLightlndecator();
	}
	
	@Override
	public void assembleMotionsensor() {
		System.out.println("Assembling for Toyota");
		A.airBagMotionDetection();
	}
}
