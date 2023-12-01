package Question03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Object lock = new Object();
		String pattern1;
		String pattern2;
		int count;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Pattern 1 = ");
		pattern1 = scn.next();
		scn.nextLine();
		
		System.out.print("Enter Pattern 2 = ");
		pattern2 = scn.next();
		scn.nextLine();
		
		System.out.print("Enter Count = ");
		count = scn.nextInt();
		scn.nextLine();
		
		Thread p1 = new Thread(new Pattern01(lock,pattern1,count));
		Thread p2 = new Thread(new Pattern02(lock,pattern2,count));
		
		System.out.println("==============Threads Start Printing Patterns==============");
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
