package strategy;

public abstract class Student {
	IPrograms IP;
	IFestival IF;
	
	public void offerPrograms() {
		IP.offerPrograms();
	}
	
	public void conductEvents() {
		IF.performEvent();
	}
	
	public abstract void displayStudents();
	
	public void setPrograms(IPrograms IP) {
		this.IP = IP;
	}
	
	public void setFestivals(IFestival IF) {
		this.IF = IF;
	}
}

class PostGrad extends Student{
	
	public void displayStudents() {
		System.out.println("Postgraduate Students");
	}
	
	public PostGrad() {
		setFestivals(new RoboFest());
		setPrograms(new DoctoralPrograms());
	}
}

class UnderGrad extends Student{
	
	public void displayStudents() {
		System.out.println("Undergraduate Students");
	}
	
	public UnderGrad() {
		setFestivals(new CodeFest());
		setPrograms(new BScPrograms());
	}
}

