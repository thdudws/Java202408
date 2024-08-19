package ex01;

import java.util.Random;

public class 복습 {

	public static void main(String[] args) {

//		
//		int[] lotto = new int[6];
//		
//		Random random = new Random();
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<6; j++) {
//				int tmp = random.nextInt(45)+1;
//				boolean flag = false;
//				
//				for(int k=0; k<j; k++) {
//					if(lotto[k] == tmp) {
//						flag =  true;
//						j--;
//						break;
//					}
//				}
//				if(flag == false) {
//					lotto[j] = tmp;
//					System.out.print(lotto[j] + " ");
//				}
//			}
//			System.out.println();
//		}
		
		
		int[] lotto =new int[45];	//45개의 배열 설정(0)
		
		Random random = new Random();
		
		for(int i=0; i<45; i++) 	//1~45개 숫자 대입
			lotto[i] = i+1;
		
		for(int j=0; j<5; j++) {	//로또 게임 5개
			
			for(int i=0; i<45; i++) { //배열 섞기
				int index = random.nextInt(45);
				int tmp = lotto[i];
				lotto[i] = lotto[index];
				lotto[index] = tmp;		
			}
			
			for(int k=0; k<6; k++)	//앞자리 6개 출력
				System.out.print(lotto[k]+" ");
			System.out.println();
		}
				
		
	}

}
