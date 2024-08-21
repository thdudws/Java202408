package ex06;

import java.util.Scanner;

public class 복습01 {

	public static void main(String[] args) {
		
		Student1 철 = new Student1();
		철.나이 = 50;
		철.이름 = "김대철";
		철.전화번호 = "010-5418-4831";
		철.info();
	
		
	}

}

class Student1 {
	String 이름;
	int 나이;
	String 전화번호;
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n", 이름, 나이, 전화번호 );
	}
	
	void 입실 () {
		System.out.println("입실하다");
	}
	
	void 퇴실 () {
		System.out.println("퇴실하다");
	}
	
	void 조퇴 () {
		System.out.println("조퇴하다");
	}
}
