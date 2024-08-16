package ex03;

/*
 * 작은 자료형은 큰 자료형에 자동으로 형변환되서 저장됨 
 * 정수 타입이 실수 타입으로 대입되면 무조건 자동 타입 변환이 됨
 */

public class 자동형변환 {

	public static void main(String[] args) {
		int num1 = 10; //10은 메모리 공간에 int형으로 저장됨
		
		//int num2 = 10.2; //10.2는 메모리공간에 double로 저장된다
		
		double d1 = 10;
		
		long l1 = 100;
		
		float f1 = l1; //f1 = 100.0f;
	} 

}
