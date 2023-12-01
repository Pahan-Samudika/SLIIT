package Question01;

import java.util.ArrayList;

public class MainApp {
	public static void main(String args[]) {
		ArrayList<RegisteredCus> RegCusList = new ArrayList<>();
		
		RegisteredCus cus1 = new RegisteredCus(101,"Kamal");
		RegisteredCus cus2 = new RegisteredCus(105,"Sunil");
		
		RegCusList.add(cus1);
		RegCusList.add(cus2);
		
		for(RegisteredCus x:RegCusList) {
			x.display();
			System.out.println();
		}
	}
	
}
