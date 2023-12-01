package Question01;

import java.util.Scanner;

public class RegisteredCus extends Customer{
	
	double rewardPoints;
	double netAmount;
	
	public RegisteredCus(int id, String name) {
		super(id, name);
		this.rewardPoints = 0;
		this.netAmount = 0;
	}

	@Override
	public void calculateBill() {
		Scanner scn = new Scanner(System.in);
		double bill,discount;
		
		System.out.print("Enter Bill Amount : ");
		bill = scn.nextDouble();
		
		if(bill>950.00) {
			rewardPoints += bill*(15/100.0);
		}
		discount = bill*(7/100.0);
		
		netAmount = bill - discount;
	}
	
	@Override
	public void display() {
		super.display();
		calculateBill();
		System.out.println("Customer reward points : "+rewardPoints);
		System.out.println("Customer Net amount to pay : "+netAmount);
	}
	
	
	
}
