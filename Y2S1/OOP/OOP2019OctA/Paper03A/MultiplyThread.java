package Paper03A;

public class MultiplyThread implements Runnable{

	private Object lock;
	private int start;
	private int range;
	
	

	public MultiplyThread(Object lock, int start, int range) {
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	void multiplyNumbers(Object lock, int start, int range) {
		synchronized(lock) {
			for(int i=start; i<=range ; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread-1 => "+i+" x "+i+" = "+(i*i));
					lock.notify();
					lock.wait();
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void run() {
		multiplyNumbers(lock,start,range);
	}
	
}
