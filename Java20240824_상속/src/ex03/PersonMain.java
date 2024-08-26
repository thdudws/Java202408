package ex03;

import ex04.PartTimeStudent;
import ex04.Person;
import ex04.SaleMan;
import ex04.Student;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("홍길동", 22);
		
		person.introduce();
		person.walk();
		
		System.out.println("==================================");
		
		Student student = new Student("이유리", 20, "아주대학교", "12345678");
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("==================================");

		SaleMan sales = new SaleMan("김철수", 24, "삼성", 20000);
		sales.introduce();
		sales.work();
		sales.walk();
		
		System.out.println("-------------------------------------");
		PartTimeStudent parttimeStudent = new PartTimeStudent("신짱구", 23, "아주대", "12345679", "구내식당 알바", 100000);
		parttimeStudent.introduce();
		parttimeStudent.work();
		
	}

}
