package Ques04b;

public class OvenOn implements Command{
	
	Oven oven;
	
	public OvenOn(Oven oven) {
		this.oven = oven;
	}

	@Override
	public void execute() {
		oven.on();
	}

}
