package ex04;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in); 	//객체 생성 (인스턴트 생성)
		
		int count = 0;
		
		System.out.println("첫 번째 정수입력 >> ");
		
		int num3 = sc.nextInt();
		count = count+1;
		
		System.out.println("두 번째 정수입력 >> ");	
		
		int num4 = sc.nextInt();
		count = count+1;
		
		int sum = num3 + num4;
		
		double avg =(double)sum/count;	//실수를 강제로 적용해준 것 
		
		System.out.println("두 수 합 : "+ sum + ", 두 수 평균 : "+ avg);
		
	}
	
	{
		
		//		복습
				
		//		Scanner sc = new Scanner(System.in);   //객체 생성 (인스턴트 생성)
		//		
		//		System.out.println("첫 번째 정수입력 >> ");
		//		int num3 = sc.nextInt();
		//		
		//		System.out.println("두 번째 정수입력 >> ");	
		//		int num4 = sc.nextInt();
		//		
		//		int sum = num3 + num4;
		//		
		//		double avg =sum/2.0;
		//		
		//		System.out.println("두수합 : "+ sum + ", 두 수 평균 : "+ avg);
		
	}

}
