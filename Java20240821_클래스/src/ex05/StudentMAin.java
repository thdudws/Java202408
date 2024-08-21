package ex05;

public class StudentMAin {

	public static void main(String[] args) {

		//new Student() -> 객체생성 or 인스턴스 생성
		//Student() (생성자(디폴트생성자) 또는 함수) 호출
		
		Student s1 = new Student();
		s1.info();
		
		Student s2 = new Student("차은우", 30, "000-1111-2222");
		s2.info();
		
		System.out.println(s2.getName()); 
		s2.setName("차은우");
		
	}

}
