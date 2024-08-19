package ex03;

import java.util.Scanner;

public class 확인문제 {

	public static void main(String[] args) {

		//while문과 Scanner nextLine() 메소드를 사용하여 키보드로 입력받아 
		//예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해 보시오.
		
		Scanner sc = new Scanner(System.in);

		boolean bank = true;
		
		int deposit = 0; //예금
		int withdrawal = 0;	//출금
		int balance = 0;	//잔고
	
		
		while (bank) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 : 2. 출금 : 3. 잔고 : 4. 종료;");
			System.out.println("-----------------------------------");
			System.out.print("선택 > ");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
			
				System.out.print("예금액 > ");
				deposit =  sc.nextInt();
				balance += deposit;
				
			}else if(strNum.equals("2")) {
				
				System.out.print("출금액 > ");
				withdrawal = sc.nextInt();
				balance -= withdrawal;
				
			}else if(strNum.equals("3")) { 
				System.out.println("잔고 > " + balance);
				
			}else if(strNum.equals("4")) { 
				bank = false;
			}else 
				System.out.println("1~4 사이의 숫자만 입력하세요");
			
		}
		System.out.println("프로그램 종료");
		
		
	}

}
