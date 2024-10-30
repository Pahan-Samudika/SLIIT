package command;

public class Test {

	public static void main(String[] args) {
		Light LL = new LivingRoomLight();
		Light KL = new KitchenLight();
		
		Command on = new LightOnCommand(LL);
		on.execute();
		Command off = new LightOffCommand(KL);
		off.execute();
	}

}
