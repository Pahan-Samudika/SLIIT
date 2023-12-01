package Ques02a;

public class CalcSum implements Runnable{
	
	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<100000;i++) {
			sum+=i;
		}
		
		System.out.println("Sum of the numbers from 1 to 100,000 ("+Thread.currentThread().getName()+") = "+sum);
	}

}
