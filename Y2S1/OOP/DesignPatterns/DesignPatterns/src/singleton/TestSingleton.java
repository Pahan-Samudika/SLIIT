package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			Singleton.getInstance();
		}
	}

}
