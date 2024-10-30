package bridge;

public class Test {

	public static void main(String[] args) {
		TV lgtv = new LGTV();
		TV sonytv = new SonyTV();
		
		
		RC rc1 = new RC(lgtv);
		rc1.on();
		rc1.off();
		rc1.tune(20);
		
		rc1 = new RC(sonytv);
		rc1.on();
		rc1.off();
		rc1.tune(10);
	}

}
