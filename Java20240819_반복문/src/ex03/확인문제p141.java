package ex03;

import java.util.Scanner;

public class 확인문제p141 {

	public static void main(String[] args) {
		
		//while문과 Scanner nextLine() 메소드를 사용하여 키보드로 입력받아 
		//예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해 보시오.

		int balance = 0;	//잔고
		int deposit = 0;	//예금
		int withdrawal = 0;	//출금
		
		boolean flag = true;	//조건식을 위한 변수 선언
		
		while(flag) {	//메뉴 생성
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 : 2. 출금 : 3. 잔고 : 4. 종료;");
			System.out.println("-----------------------------------");
			
			Scanner sc = new Scanner(System.in);	//스캐너 생성
			
			//"1" ==> 1
			System.out.println("선택 > ");
			int num = Integer.parseInt(sc.nextLine()); //문자를 정수로 변환
			
			switch(num) {
			case 1 :
				System.out.println("예금액 > ");
				deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				break;
			case 2 :
				System.out.println("출금액 > ");
				withdrawal = Integer.parseInt(sc.nextLine());
				balance -= withdrawal;
				break;
			case 3 :
				System.out.println("잔고 > " + balance);
				break;
			case 4 :
				flag = false;	//조건식을 false로 만듦
				break;
			default : 
				System.out.println("1~4 사이의 숫자만 입력하세요 ");
			}
			
		}
		System.out.println("프로그램 종료");
		
	}

}
