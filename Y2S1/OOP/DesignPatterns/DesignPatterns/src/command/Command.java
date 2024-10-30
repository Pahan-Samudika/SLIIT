package command;

public interface Command {
	void execute();
}

class LightOnCommand implements Command{
	private Light light;
	
	public LightOnCommand(Light light) {
        this.light = light;
    }
	
	@Override
	public void execute() {
		light.on();
	}
}

class LightOffCommand implements Command{
	private Light light;
	
	public LightOffCommand(Light light) {
        this.light = light;
    }
	
	@Override
	public void execute() {
		light.off();
	}
}
