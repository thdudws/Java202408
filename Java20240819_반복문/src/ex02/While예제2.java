package ex02;

public class While예제2 {

	public static void main(String[] args) {


		
		int i=0;
		
		while( i<=9) {
			int j=1;
				while( j<=9) {
					System.out.printf("%d X %d = %d\n", i,j ,i*j);
				j++;
			}
			 i++;
		}
				
	}

}
