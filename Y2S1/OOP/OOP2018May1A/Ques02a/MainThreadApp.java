package Ques02a;

public class MainThreadApp {

	public static void main(String[] args) {
		Thread countdown = new CountDown();
		
		Thread Black = new Thread(new CalcSum());
		Thread White = new Thread(new CalcSum());
		
		Black.setName("Black");
		White.setName("White");
		
		countdown.start();
		
		try {
			countdown.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Black.start();
		White.start();
	}

}
