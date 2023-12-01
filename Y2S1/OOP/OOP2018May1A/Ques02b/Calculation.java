package Ques02b;

public class Calculation {
	private double ans=1;

	public double getAns() {
		return ans;
	}
	
	public void Factorial(int start,int end) {
		
		for(int i=start;i<=end;i++) {
			ans*=i;
			System.out.println("Start = "+start+", End = "+end+" ,i = "+i+" ,Current Answer = "+ans);
		}
	}
}
