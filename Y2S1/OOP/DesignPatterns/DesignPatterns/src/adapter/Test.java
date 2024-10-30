package adapter;

public class Test {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		
		Turkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		
		
		TurkeyAdapter TA = new TurkeyAdapter(turkey);
		TA.quack();
		TA.fly();
	}

}
