package abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory SF1 = new ShapeFactory();
		Shape C = SF1.getShape("CIRCLE");
		C.draw();
		
		ShapeFactory SF2 = new ShapeFactory();
		Shape S = SF2.getShape("SQUARE");
		S.draw();
		
		ShapeFactory SF3 = new ShapeFactory();
		Shape R = SF3.getShape("RECTANGLE");
		R.draw();
	}

}
