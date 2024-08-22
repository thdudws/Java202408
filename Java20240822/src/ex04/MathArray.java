package ex04;

public class MathArray {


	
	static int sum (int[] values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			 sum += values[i];
		}
		return sum;
		
	}
	
	static double average (int[] values) {
//		int sum = 0;
//		
//		for(int i=0; i<values.length; i++) {
//			 sum += values[i];
//		}
//		double average =(double)sum/values.length;
//		return average;
		
		return sum(values)/values.length; //축약형
	}
	
	static int min(int[] values) {
		int min = values[0];
		
		for(int i=0; i<values.length; i++) {
			if(values[i]<min) min = values[i];
		}
		return min;
	}
	
	static int max(int[] values) {
		int max = 0;
		
		for(int i=0; i<values.length; i++) {
			if(values[i]>max) max = values[i];
		}
		return max;
	}
	
	
	
	

	
}
