package ex02;

public class StudentMAin {

	public static void main(String[] args) {

		//new Student() -> 객체생성 or 인스턴스 생성
		//Student() (생성자(디폴트생성자) 또는 함수) 호출
		
		/*
		 * 객체와 인스턴스의 차이
			객체와 인스턴스는 클래스에 정의된 내용에 따라 생성된 것이라는 점에서 같은 의미로 사용되지만, 
			엄격히 구분해본다면 객체는 모든 인스턴스를 포괄하는 의미를 가지고 있고, 
			인스턴스는 클래스를 통해 생성된 하나의 인스턴스라는 의미를 가진다는 점에서 구별된다.
			같은 것으로 봐도 무방하다.
		 */
		
		Student s1 = new Student();
		s1.info();
		
		Student s2 = new Student("차은우", 30, "000-1111-2222");
		s2.info();
		
		Student s3 = new Student("홍길동", 25, "000-1111-2222");
		s3.info();
		
		Student s4 = new Student("지리산");
		s4.info();
		
		Student s5 = new Student("광교산", 30);
		s5.info();
		
	}

}
