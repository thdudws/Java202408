package ex01;

import java.util.Scanner;

/*
 	나이하고 이름을 키보드 통해 입력 받아서 출력하는 예제
 */

public class InputNameAge {

	public static void main(String[] args) {
		
		//변수는 선언될 때의 타입에 따라 저장할 수 있는 값의 종류와 허용 범위가 달라짐
	
		/*기본자료형 -> 
		 * 정수형
		 * 	byte,short,int,long
		 * 실수형
		 * 	float,double -> float는 정밀도 낮음, 더 큰 실수 저장할 수 있는 사용 double 권장
		 * float 실수 사용시 ex)float f1 = 2145236652.0'f' 넣어주기 정수는 상관없음
		 * 논리형
		 * 	boolean
		 * 문자형
		 * 	char
		 */
		
		//import -> 해당 단어에 ctrl + space
		
		//문자열 변수로 저장하려면 string 사용
		// \n 출력시 줄바꿈
		
		/*아스키코드표 많이 쓰이는 것 외워두면 좋다.
			char c1 = 65 "A"
			char c2 = 97 "a"
			char c3 = 48 "0" 숫자
		 */ 
		
		//-> 야매팁 sysout + (ctrl + space) ->  System.out.println(); 
			
		Scanner sc = new Scanner(System.in); //키보드 통해서 입력받을 때
		
		//이름
		System.out.println("이름을 입력하세요 : ");		
		String a = sc.nextLine(); //string 기본자료형이 아니므로 참조문자형 문자열 입력받을 때 사용
		System.out.println("나의 이름은 " + a + " 입니다.");
		
		//나이 -> 정수형(int) 사용
		System.out.println("나이를 입력하세요 : ");
		int b = sc.nextInt();		
		System.out.println("나의 나이는 " + b + " 입니다.");
		
		System.out.println("프로그램 종료!!");
		
			
		//시간
		int hour = 8;
		int minute = 30;

		System.out.println(hour + "시간" + minute + "분");
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		
	}

}
