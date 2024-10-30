package command;

public interface Light {
	void on();
	void off();
}

class KitchenLight implements Light{
	public void on() {
		System.out.println("Kitchen light on");
	}
	
	public void off() {
		System.out.println("Kitchen light off");
	}
}

class LivingRoomLight implements Light{
	public void on() {
		System.out.println("Living room light on");
	}
	
	public void off() {
		System.out.println("Living room light off");
	}
}