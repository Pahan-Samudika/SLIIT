package Ques04b;

public class GarageGateOpen implements Command{
	
	GarageGate gate;
	
	public GarageGateOpen(GarageGate gate) {
		this.gate = gate;
	}

	@Override
	public void execute() {
		gate.open();
	}

}
