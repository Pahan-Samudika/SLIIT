package bridge;

public interface TV {
	void on();
	void off();
	void tune(int channel);
}

class LGTV implements TV{
	@Override
	public void on() {
		System.out.println("Switch on LGTV");
	}
	@Override
	public void off() {
		System.out.println("Switch off LGTV");
	}
	@Override
	public void tune(int channel) {
		System.out.println("LGTV Channel tuned to : "+channel);
	}
}

class SonyTV implements TV{
	@Override
	public void on() {
		System.out.println("Switch on SonyTV");
	}
	@Override
	public void off() {
		System.out.println("Switch off SonyTV");
	}
	@Override
	public void tune(int channel) {
		System.out.println("SonyTV Channel tuned to : "+channel);
	}
}