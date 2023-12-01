package Question3;

import java.util.ArrayList;

public class ConsumerThread implements Runnable{
	private final ArrayList <Integer> queue;
	
	public ConsumerThread(ArrayList <Integer> queue) {
		this.queue = queue;
	}
	
	public void run() {
		System.out.println("Consumer Started");
		while(true) {
			synchronized(queue) {
				while(queue.isEmpty()) {
					try {
						queue.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				int val = queue.remove(0);
				System.out.println("Consumer thread consumes "+val);
				
				System.out.print("Elements in Queue = [");
				for(int x:queue) {
					System.out.print(x+",");
				}
				System.out.println("]");
			}
			
			try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}
