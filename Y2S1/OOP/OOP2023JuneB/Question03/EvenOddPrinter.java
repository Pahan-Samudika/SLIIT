package Question03;

public class EvenOddPrinter {
	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1;
	private static final Object lock = new Object();
	
	public static void main(String args[]) {
		Thread evenThread = new Thread(new EvenRunnable(),"EvenThread");
		Thread oddThread = new Thread(new oddRunnable(),"OddThread");
		
		evenThread.start();
		oddThread.start();
		
	}
	
	static class EvenRunnable implements Runnable {
		
		@Override
		public void run() {
			while(nextNum<=MAX_NUM) {
				synchronized(lock) {
					if(nextNum%2==0) {
						System.out.println("Even Thread : "+nextNum);
						nextNum++;
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		}
	}
	
	static class oddRunnable implements Runnable {

		@Override
		public void run() {
			while(nextNum<=MAX_NUM) {
				synchronized(lock) {
					if(nextNum%2!=0) {
						System.out.println("Odd Thread : "+nextNum);
						nextNum++;
						lock.notify();
					}else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		}
	}
}
