package ex06;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	//객체 생성

		Student 철 = new Student();
		철.나이 = 50;
		철.이름 = "김대철";
		철.전화번호 = "010-1545-5678";
		철.info();
		
		Student 소영 = new Student();
		소영.나이 = 40;
		소영.이름 = "박소영";
		소영.전화번호 = "010-1345-5678";
		소영.info();
		
	}

}

	class Student {	//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
		
		String 이름;
		int 나이;
		String 전화번호;
		
		
		void info() {
			System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n", 
					이름, 나이, 전화번호);	//%s 문자열로 출력
		}
		
		void 입실() {
			System.out.println("입실하다");
		}
		void 퇴실() {
			System.out.println("퇴실하다");
		}
		void 조퇴() {
			System.out.println("조퇴하다");
		}
	}
	
	