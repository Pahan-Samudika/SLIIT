package Question02A;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOddNum {
	public static void main (String args[]) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int num;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter numbers (0 to quit) : ");
		num = scn.nextInt();
		
		while(num!=0) {
			numbers.add(num);
			
			num = scn.nextInt();
		}
		
		for(int i=numbers.size()-1;i>=0;i--) {
			if(numbers.get(i)%2==0) {
				numbers.remove(i);
			}
		}
		
		System.out.print("Odd numbers : [");
		for(int x :numbers) {
			System.out.print(x+", ");
		}
		System.out.println("]");
	}
}
