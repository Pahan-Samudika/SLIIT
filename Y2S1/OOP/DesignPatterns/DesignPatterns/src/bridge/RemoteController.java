package bridge;

public interface RemoteController {
	void on();
	void off();
	void tune(int channel);
}

class RC implements RemoteController{
	TV tv;
	
	public RC(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void on() {
		tv.on();
	}
	@Override
	public void off() {
		tv.off();
	}
	@Override
	public void tune(int channel) {
		tv.tune(channel);
	}
}
