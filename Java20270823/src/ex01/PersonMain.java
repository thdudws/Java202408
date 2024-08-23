package ex01;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("홍길동", 20);
		
		person.introduce();
		person.walk();
		
		System.out.println("-------------------------------------");
		
		
		Student student = 
				new Student("홍길동", 20, "아주대학교", "12345678");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("-------------------------------------");
		
		SaleMan sales = new SaleMan("홍길동", 20, "삼성", 10000);
		sales.walk();
		sales.work();
		
	}

}
