package Paper03A;

public class PlusThread implements Runnable{
	
	private Object lock;
	private int start;
	private int range;
	
	

	public PlusThread(Object lock, int start, int range) {
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	void addNumbers(Object lock, int start, int range) {
		synchronized(lock) {
			for(int i=start; i<=range ; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread-0 => "+i+" + "+i+" = "+(i+i));
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
		addNumbers(lock,start,range);
	}

}
