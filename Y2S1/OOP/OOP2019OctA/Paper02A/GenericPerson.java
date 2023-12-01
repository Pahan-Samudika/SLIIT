package Paper02A;

import java.util.ArrayList;

public class GenericPerson {
	
	public <T extends IPerson> void displayElements(ArrayList<T> objectList) {
		for(T value:objectList) {
			System.out.println(value.displayDetails());
		}
	}
}
