package ex06;

import java.util.Scanner;

public class ClassEx02 {

	public static void main(String[] args) {

//	Scanner sc = new Scanner(System.in);
		
		Bank b1 = new Bank();
		
		b1.계좌번호 = "123-456789-281";
		b1.소유자이름 = "박우리";
		b1.입금(10000);
		b1.출금(2000);
		b1.잔액();
		b1.info();
	
	}

}

class Bank {
	String 계좌번호;
	String 소유자이름;
	int 잔액;
		
	void 입금(int money) {	
		잔액 += money;
		System.out.println("입금 : " + money);	
	}
	
	void 출금(int money) {
		잔액 -= money;
		System.out.println("출금 : " + money);
	}
	
	void 잔액() {
		System.out.println("현재 잔액 : " + 잔액);
	}
	
	void info() {
		System.out.printf("계좌번호 : %s , " + "소유자이름 : %s, 잔액 : %d\n", 계좌번호, 소유자이름, 잔액);
	}
}
	
	
	