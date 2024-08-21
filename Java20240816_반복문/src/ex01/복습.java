package ex01;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

//		7세 이하일 경우: "미취학"
//		8세 이상 13세 이하일 경우: "초등학생"
//		14세 이상 16세 이하일 경우: "중학생"
//		17세 이상 19세 이하일 경우: "고등학생"
//		20세 이상일 경우: "성인"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하시오 >> ");
		int age = sc.nextInt();
		
//		int age = 5;
		
		String result = "";
		
		if(age<=7) {
			result =("미취학");
		}else if(age<=13) {
			result =("초등학생");
		}else if(age<=16) {
			result =("중학생");
		}else if(age<=19) {
			result =("고등학생");
		}else {
			result =("성인");
		}
		
		System.out.println(result);
		
	}

}
