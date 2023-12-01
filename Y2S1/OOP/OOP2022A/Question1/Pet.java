package Question1;

public class Pet implements PointAllocator{
	
	protected int points = 0 ;
	
	@Override
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public int getPoints() {
		return points;
	}
	
	public void feed() {
		points+=5;
	}
	
	public void clean() {
		points+=10;
	}
	
	public void cuddle() {
		points+=15;
	}

	public void GetTotalPoints() {
		System.out.println("Total points is "+points);
	}
}


