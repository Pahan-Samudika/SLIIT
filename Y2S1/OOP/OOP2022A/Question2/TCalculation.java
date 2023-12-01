package Question2;

import java.util.ArrayList;

public class TCalculation <T extends Number>{
	private ArrayList<T> numList = new ArrayList<>();
	
	void append(T number) {
		numList.add(number);
	}
	
	double average() {
		if(numList.isEmpty()) {
			return 0.0;
			
		}else {
			double sum = 0;
			
			for(T num:numList) {
				sum += num.doubleValue();
			}
			
			return sum / numList.size();
		}
	}
}
