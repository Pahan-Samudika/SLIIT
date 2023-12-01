package Question3;

import java.util.ArrayList;

public class ProducerThread implements Runnable{
	private final ArrayList <Integer> queue;
	
	public ProducerThread(ArrayList <Integer> queue) {
		this.queue = queue;
	}
	
	public void run() {
		System.out.println("Producer Started");
		int val = 10;
		while(true) {
			synchronized(queue) {
				queue.add(val);
				System.out.println("Producer adding value = "+val+" to Queue");
				val+=10;
				
				queue.notify();
			}
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
