package ex01;

import java.util.Scanner;

/*
 * 문제 
 * 양의 정수 N을 입력받아서
 * 1부터 N까지 홀수의 합을 구한다.
 */

public class ForEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//입력받아야 하는 것
		System.out.println("양의 정수를 입력하시오 -> ");

		int N = sc.nextInt();
		int sum = 0;
		
//		for(int i=1; i<=N; i++) {
//			if(i % 2 == 1) //짝수의 합일 때는 1을 0으로 
//				sum += i;
//		}
//		
		for(int i=1; i<=N; i+=2 ) {
			if(i % 2 == 1) //짝수의 합일 때는 1을 0으로 
				sum += i;
		}
		
		System.out.println("N 홀수의 합 : " + sum);
		
		
		
		
		
	}

}
