package adapter;

public interface Duck {
	public void quack();
	
	public void fly();
}


class MallardDuck implements Duck{
	@Override
	public void quack() {
		System.out.println("Quack duck Mallard");
	}
	
	@Override
	public void fly() {
		System.out.println("I am flying");
	}
}


class TurkeyAdapter implements Duck{
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}
	
	@Override
	public void fly() {
		for(int i=0;i<5;i++) {
			turkey.fly();
		}
	}
}