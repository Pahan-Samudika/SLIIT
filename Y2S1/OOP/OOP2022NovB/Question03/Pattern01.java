package Question03;

public class Pattern01 implements Runnable{
	
	private String pattern;
	private int count;
	Object lock;
	
	public Pattern01(Object lock,String pattern, int count) {
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=count;i++) {
			synchronized(lock) {
				System.out.print("Pattern 01 Thread =   ");
				for(int k=0;k<i;k++) {
					System.out.print(" ");
				}
				for(int j=count;j>=i;j--) {
					System.out.print(pattern+" ");
				}
				System.out.println("");
				lock.notify();
				try {
					lock.wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
