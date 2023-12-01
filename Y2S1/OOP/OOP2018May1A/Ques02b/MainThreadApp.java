package Ques02b;

public class MainThreadApp {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		
		int end = 40;
		int work = end/4;
		
		Thread thread1 = new ParallelThread(calculation,1,1*work);
		Thread thread2 = new ParallelThread(calculation,1+1*work,2*work);
		Thread thread3 = new ParallelThread(calculation,1+2*work,3*work);
		Thread thread4 = new ParallelThread(calculation,1+3*work,4*work);
		
		thread1.setName("1");
		thread2.setName("2");
		thread3.setName("3");
		thread4.setName("4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		
		System.out.println("Factorial of "+end+" = "+calculation.getAns());
	}

}
