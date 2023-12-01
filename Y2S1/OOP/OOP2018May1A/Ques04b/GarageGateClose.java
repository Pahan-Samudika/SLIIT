package Ques04b;

public class GarageGateClose implements Command{

	GarageGate gate;
	
	public GarageGateClose(GarageGate gate) {
		this.gate = gate;
	}
	
	@Override
	public void execute() {
		gate.close();
	}

}
