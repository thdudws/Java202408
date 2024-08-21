package ex02;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] com = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d번째 학생의 com점수를 입력하세요 >> ", i+1);
			com[i] = sc.nextInt();	//정수로 입력받기
		}
		
		System.out.print("출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		
		System.out.println();
		
		System.out.print("역순 출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[4-i] + ", ");
		}
		
		System.out.println();
		
		int max, min;
		max = min = com[0];
		
		for(int i=0; i<5; i++) {
			if(com[i]>max)
				max = com[i];
			
			if(com[i]<min)
				min = com[i];
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += com[i];
		}
		
		System.out.printf("합계 : %d, 평균 : %.1f", sum, sum/5.0);
			
		
		System.out.println();
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i-1; j++) {
				if(com[i]>com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		
		
		System.out.print("정렬 후 출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		
	}

}
