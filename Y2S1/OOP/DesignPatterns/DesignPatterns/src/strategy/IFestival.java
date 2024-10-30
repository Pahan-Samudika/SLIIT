package strategy;

public interface IFestival {
	void performEvent();
}

class CodeFest implements IFestival{
	@Override
	public void performEvent() {
		System.out.println("Perform Codefest Event");
	}
}

class RoboFest implements IFestival{
	@Override
	public void performEvent() {
		System.out.println("Perform RoboFest Event");
	}
}

class GameFest implements IFestival{
	@Override
	public void performEvent() {
		System.out.println("Perform GameFest Event");
	}
}
