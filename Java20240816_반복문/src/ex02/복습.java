package ex02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] com = new int[5];
		
		//입력 시 반복문
		for(int i=0; i<5; i++) {
			System.out.printf("%d번째 학생의 com 점수를 입력하세요 -> ", i+1);
			com[i] = sc.nextInt();
		}
		
		//출력시 반복문
		System.out.print("출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		
		System.out.println();
		
		//입력한 데이터의 역순으로 출력
		System.out.print("역순 출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[4-i] + ", ");
		}
		
		System.out.println();
		
		//최대값, 최소값
		int max, min;
		max = min =com[0];
		
		for(int i=0; i<5; i++) {
			if (com[i]>max)
				max=com[i];
			
			if(com[i]<min)
				min=com[i];
		}
		
		System.out.println("최대값 : " + max + " , 최소값 : " + min);
		
		//평균, 합계
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum += com[i];
		}
		
		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, sum/5.0);
		
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
		for(int i=0; i<5; i++) {
			System.out.println(com[i] + ", ");
		}
		
	}

}
