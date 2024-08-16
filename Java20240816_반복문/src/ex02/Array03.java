package ex02;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		
		/*
		 * 5명 학생 com점수 키보드로 입력받아서 출력하기
		 * 입력할때도 반복문 
		 * 출력할때도 반복문
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int[] com = new int[5]; 

		
		//배열 숫자대신 com.length 넣어주는 게 더 좋은 방법
		
				
		//입력시 반복문
		for (int i=0; i<5; i++) {
			System.out.printf(" %d번째 학생의 com 점수를 입력 >> ", i+1);
			com[i] = sc.nextInt();
		}
		
		//랜덤으로 출력
//		for (int i=0; i<5; i++) {
//			com[i] = (int)(Math.random()*101);
//		}
//		
		//출력시 반복문
		System.out.print("출력 : ");
		for (int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		
		System.out.println();
		
		
		//입력한 데이터의 역순 출력
		System.out.print("역순 출력 : ");
		for (int i=0; i<5; i++) {
			System.out.print(com[4-i] + ", ");
		}
		
		System.out.println();	//줄변경
		
		
		//최대값, 최소값 계산
		
		//최대값
		int max = 0;
		
		for (int i=0; i<5; i++) {
			if(com[i]>max);
				max = com[i];
		}
		
		System.out.println("최대값 : " + max);
		
		
		//최소값
		int min = com[0];
		
		for (int i=0; i<5; i++) {
			if(com[i]<min);
			min = com[i];
		}
		
		System.out.println("최소값 : " + min);
		
		//축약형
//		int max, min;
//		max = min = com[0]; 1번째 방법
//		
//		max = 0;
//		min = 9999; 2번째 방법
//		
//		for (int i=0; i<5; i++) {
//			if(com[i]>max);
//			max = com[i];
//			
//			if(com[i]<min);
//			min = com[i];
//		}
//		
//		System.out.println("최대값 : " + max + " , 최소값 : " + min);
		
		
		//합계
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			sum += com[i];
		}
		
		System.out.println("합계 : " + sum);
		
		
		//평균값 소수점 둘째 자리까지
		double avg = sum / 5.0;
		
		System.out.printf("평균 : %.2f", avg);
		
		
		//평균이랑 합계 합쳐서
//		int sum = 0;
//		
//		for (int i=0; i<5; i++) {
//			sum += com[i];
//		}
//		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, sum/5.0);
//		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, (double)sum/com.length);
		
		
		System.out.println();
		
		
		//정렬 
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5-1-i; j++) {
				if(com[j]>com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}			
		}
				
		//정렬 후 출력
		System.out.print("정렬 후 출력 : ");
		for (int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		
		
		
	}

}
