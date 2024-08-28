package ex07;

public class MaxMain {

	public static void main(String[] args) {

		int max = maxFunc(9, 18, 17);
		
		System.out.println(max);
		
		
	}

	static int maxFunc(int n1, int n2, int n3) {
		
//		int max = 0;
//		
//		max = Math.max(n1, n2);
//		max = Math.max(max, n3);
//		
//		return max;
		
		return Math.max(Math.max(n1, n2),n3);
		
	}
	
}
