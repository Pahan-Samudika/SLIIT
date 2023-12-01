package Ques04b;

public class MainApp {

	public static void main(String[] args) {
		MobileUI mobileapp = new MobileUI();
		
		Oven mainOven = new Oven("mainOven");
		
		GarageGate garageGate = new GarageGate("This is garageGate");
		
		Command OnOven = new OvenOn(mainOven);
		Command OffOven = new OvenOff(mainOven);
		Command OpenGate = new GarageGateOpen(garageGate);
		Command CloseGate = new GarageGateClose(garageGate);
		
		mobileapp.setCommand(1,OnOven);
		mobileapp.setCommand(2,OffOven);
		mobileapp.setCommand(3,OpenGate);
		mobileapp.setCommand(4,CloseGate);
		
		mobileapp.commmandPressed(3);
		mobileapp.commmandPressed(1);
		mobileapp.commmandPressed(4);
		mobileapp.commmandPressed(2);
		
		
	}

}
