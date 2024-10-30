package abstractfactory;

public class ShapeFactory {
	public Shape getShape(String Shapename) {
		if (Shapename == null) {
            return null;
		}
		else if(Shapename.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		else if(Shapename.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		
		else if(Shapename.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else {
			return null;
		}
	}
}
