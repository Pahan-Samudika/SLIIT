package Question4;

public class Demo {

	public static void main(String[] args) {
		CarAirBag fAirbag = new FrontAirBag();
		CarAirBag sAirbag = new SideAirBag();
		
		new NissanCar(fAirbag).assembleLight();
		new NissanCar(fAirbag).assembleMotionsensor();
		new NissanCar(sAirbag).assembleMotionsensor();
		
		new ToyotaCar(fAirbag).assembleLight();
		new ToyotaCar(fAirbag).assembleMotionsensor();
		new ToyotaCar(sAirbag).assembleLight();
		new ToyotaCar(sAirbag).assembleMotionsensor();
	}

}
