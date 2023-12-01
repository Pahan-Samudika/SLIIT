package Question4;

public class NissanCar implements Car{
	
	CarAirBag A;
	
	public NissanCar(CarAirBag A) {
		this.A = A;
	}
	
	@Override
	public void assembleLight() {
		System.out.println("Assembling for Nissan");
		A.airBagLightlndecator();
	}
	
	@Override
	public void assembleMotionsensor() {
		System.out.println("Assembling for Nissan");
		A.airBagMotionDetection();
	}
}
