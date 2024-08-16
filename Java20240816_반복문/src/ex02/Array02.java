package ex02;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {

		
		/*
		 * 5명 학생 com점수 키보드로 입력받아서 출력하기
		 * 입력할때도 반복문 
		 * 출력할때도 반복문
		 */
		
		
		int[] com = new int[5]; //5명의 방(배열)
		
		Scanner sc = new Scanner(System.in);		
		
		
//		입력시 반복문
		for(int i=0; i<5; i++) {
			System.out.printf("%d번째 학생의 com점수 입력 >> ", i+1); //%d 10진 정수 출력
			com[i] = sc.nextInt();
		}	
		
//		출력시 반복문
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		
		
		//최대값 계산			
		int max = 0;
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			if(com[i]>max)
				max = com[i];
		}
		
		System.out.println("최대값 : " + max);
		
		
//		int min = 0;
//		
//		System.out.println();
//		
//		for(int i=0; i<5; i++) {
//			if(com[i]<min)
//				min = com[i];
//		}
//		
//		System.out.println("최소값 : " + min);
		
		
		//합계
		int sum = 0;		
		
		for(int i=0; i<5; i++) {
			sum += com[i];
		}
		
		System.out.println("합계 : " + sum);
		
		
		//평균값 소수점 둘째 자리까지
		double avg = sum / 5.0;
		
		System.out.printf("평균 : %.2f\n", avg); 
		
		
		for(int i=0; i<5; i++) {
			if(com[i]>max);
				max = com[i];
		}
		
		
	}

}
