package ex01;

public class 메서드 {

	public static void main(String[] args) {

		int sum1 = add(5, 10);	//메서드 호출
		System.out.println("결과1 출력: " + sum1);
		
		int sum2 = add(15, 20);
		System.out.println("결과2 출력: " + sum2);
		
	}
	
	public static int add(int a, int b) {	//메서드 선언 부분 - 메서드 이름, 반환 타입, 매개변수(파라미터)
		System.out.println(a + "+" + b +" 연산 수행"); //메서드가 수행해야하는 코드 블록
		int sum = a + b;
		return sum;
	}

	//public 다른 클래스에서 호출할 수 있는 메서드
	//static 정적 메서드
	//int 반환 타입
	//add 메서드의 이름 부여
	//(int a, int b) 메서드 호출할 때 전달하는 입력 값
	//↑ 해당 메서드안에서만 사용된다.
}
