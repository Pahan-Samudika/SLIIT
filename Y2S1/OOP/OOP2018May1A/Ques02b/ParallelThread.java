package Ques02b;

public class ParallelThread extends Thread{
	Calculation myCalc;
	int start;
	int end;
	
	
	public ParallelThread(Calculation myCalc, int start, int end) {
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}


	public void run() {
		System.out.println("Thread = "+Thread.currentThread().getName());
		myCalc.Factorial(start, end);
	}
}
