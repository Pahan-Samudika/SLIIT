package Ques04b;

public class OvenOff implements Command{

	Oven oven;
	
	public OvenOff(Oven oven) {
		this.oven = oven;
	}
	
	@Override
	public void execute() {
		oven.off();
	}

}
