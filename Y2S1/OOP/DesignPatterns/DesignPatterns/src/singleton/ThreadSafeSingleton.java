package singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton ThreadSafeSingleton;
	
	private ThreadSafeSingleton() {}
	
	public static ThreadSafeSingleton getInstance() {
		
		if(ThreadSafeSingleton == null) {
			synchronized (Singleton.class) {
				ThreadSafeSingleton = new ThreadSafeSingleton();
				System.out.println("Singleton invocation");
			}
			
		}
			return ThreadSafeSingleton;
	}
}
