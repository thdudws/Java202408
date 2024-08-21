package ex06;

import java.util.Scanner;

public class 복습02 {

	public static void main(String[] args) {
		
		Bank2 은행 = new Bank2();
		은행.계좌번호 = "158-548214-185";
		은행.소유자이름 = "김은행";
		은행.입금(10000);
		은행.출금(3000);
		은행.잔액();
		은행.info();
			
	}

}

class Bank2 {
	String 계좌번호;
	String 소유자이름;
	int 잔액;
	
	void 입금(int money) {
		잔액 += money;
		System.out.println("입금 : "+ money);
	}
	void 출금(int money) {
		잔액 -= money;
		System.out.println("출금 : "+ money);
	}
	void 잔액() {
		System.out.println("현재 잔액 : "+ 잔액);
	}
	void info() {
		System.out.printf("계좌번호 : %s, 소유자이름 : %s, 잔액 : %d\n", 
				계좌번호, 소유자이름, 잔액);
	}
}