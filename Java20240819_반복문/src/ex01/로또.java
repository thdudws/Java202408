package ex01;

import java.util.Random;

public class 로또 {

	public static void main(String[] args) {

		
		int[] lotto = new int[6];
		
		
//		(int)(Math.random()*45)+1; //두가지 방식
//		random.nextInt(45)+1;
				
		
		Random random = new Random();
				
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<6; j++) {
				int tmp = random.nextInt(45)+1;
				boolean flag = false;
				
				for(int k=0; k<j; k++) {	//같은 숫자 중복체크
					if(lotto[k] == tmp) {
						flag = true;
						j--;
						break;
					}
				}
				
				if(flag == false) {
					lotto[j] = tmp;
					System.out.print(lotto[j] + ", ");
				}
			}
			System.out.println();
		}
						
		
//		 int[] nums = new int[6];
//		
//		 for(int k=0; k<5; k++) {
//	         for(int i=0; i<nums.length; i++) {
////	            nums[i] = (int)((Math.random()*45)+1);      
//	            nums[i] = random.nextInt(45)+1;   
//	         
//	            // 중복 제거(다시 뽑기)            
//	            for(int j=0; j<i; j++) {
//	               if(nums[i] == nums[j]) {
//	                  i--;
//	               }
//	            }
//	         }
//	         
//	         // 출력
//	         for(int i=0; i<nums.length; i++) {
//	            System.out.printf("%02d ", nums[i]);
//	         }
//	         System.out.println();
//	      }

				
		
	}

}
