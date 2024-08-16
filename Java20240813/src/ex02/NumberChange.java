package ex02;

/*
 * num1 = 20;
 * num2 = 10;
 * 두 수 교환해서 출력
 */

public class NumberChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 20;
		int num2 = 10;
		
		System.out.println("before-----");
		System.out.println("num1 : " + num1 + " , num2 : " + num2);
		
		int tmp = num1; //두 수 교환하려면 매개체를 하나 더 추가해서
		num1 = num2;
		num2 = tmp;
		
		System.out.println("after-----");
		System.out.println("num1 : " + num1 + " , num2 : " + num2);
		
		
		//다른 예제
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		
		
	}

}
