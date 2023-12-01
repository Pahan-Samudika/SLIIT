package Ques01;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<>();
		
		Book Book1 = new Book(1111,"This is a book",500.00,"One Publications","Novel",500);
		Book Book2 = new Book(2222,"This is a book",1000.00,"Two Publications","TextBook",200);
		
		items.add(Book1);
		items.add(Book2);
		
		Car Car1 = new Car(3333,"This is a Car",3000.00,"Toyota","Racing");
		Car Car2 = new Car(4444,"This is a Car",5000.00,"Toyota","Family");
		
		items.add(Car1);
		items.add(Car2);
		
		for(Item x : items) {
			x.Display();
			System.out.println("");
		}

	}

}
