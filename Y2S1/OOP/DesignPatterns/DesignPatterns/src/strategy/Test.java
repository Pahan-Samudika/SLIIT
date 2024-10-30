package strategy;

public class Test {

	public static void main(String[] args) {
		Student PG = new PostGrad();
		PG.offerPrograms();
		PG.conductEvents();
		PG.displayStudents();
		
		System.out.println("=======Assign new Event=======");
		PG.setFestivals(new CodeFest());
		PG.conductEvents();
		
		
		System.out.println("==============================");
		Student UG = new UnderGrad();
		UG.offerPrograms();
		UG.conductEvents();
		UG.displayStudents();
		
		System.out.println("=======Assign new Event=======");
		UG.setPrograms(new MScPrograms());
		UG.offerPrograms();
	}

}
