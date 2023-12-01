package Ques04b;

public class MobileUI {
	Command[] command;
	
	public MobileUI() {
		command = new Command[6];
	}

	void setCommand(int index,Command cmdObj) {
		this.command[index] = cmdObj;
	}
	
	public void commmandPressed(int index) {
		this.command[index].execute();
	}
}
