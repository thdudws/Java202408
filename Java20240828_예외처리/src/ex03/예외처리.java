package ex03;

import java.util.Scanner;

public class 예외처리 {

	public static void main(String[] args) {

		//예외처리 try~catch
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		double result = 0;
		
		//try => 문제가 될 소지가 있는 경우 try{} 안에 기입
		//catch => 예외(문제)가 발생하면 처리하는 블럭
		try {	
			result = num1 / num2;
			
		}catch(Exception e) {
			e.printStackTrace(); //예외처리 붉은 글씨 블라블라
			System.out.println("--------------------");
			System.out.println(e.getMessage()); //by zero
		}
		
		System.out.println("두 수를 나눈 결과는 " + result);
		
		System.out.println("프로그램 종료!!");
		
	}

}
