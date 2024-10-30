package abstractfactory;

public interface Shape {
	void draw();
}

class Square implements Shape{
	public void draw() {
		System.out.println("Inside Square::draw()");
		System.out.println("**********");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("**********");
		System.out.println();
	}
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Inside Circle::draw()");
	    System.out.println("   *****   ");
	    System.out.println(" *       * ");
	    System.out.println("*         *");
	    System.out.println("*         *");
	    System.out.println(" *       * ");
	    System.out.println("   *****   ");
	    System.out.println();
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Inside Rectangle::draw()");
		System.out.println("*****************");
		System.out.println("*               *");
		System.out.println("*               *");
		System.out.println("*               *");
		System.out.println("*               *");
		System.out.println("*****************");
		System.out.println();
	}
}
