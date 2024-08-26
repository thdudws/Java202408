package ex04;

public class PersonMain {

	public static void main(String[] args) {

		/*
		double d1 = 10.2;
		int num = 10;
		//num = d1; X
		d1 = num;	//d1 = (double)num; => d1 = 10.0
		*/
		
		//상위클래스(person)는 하위클래스(student)를 참조할 수 있다.
		//단, 접근할 수 있는 영역은 상위클래스(person) 내로 한정된다.
		Person p1 = new Person();
		Person ps1 = new Student();
		Person pps = new PartTimeStudent();
		
		//하위클래스는 상위클래스를 참조할 수 없다.
		Student s1 = new Student();
		Student s2 = new PartTimeStudent();
		
//		Student s3 = new Person(); X 상위클래스는 참조 불가능
		
		PartTimeStudent pss = new PartTimeStudent();
		
//		PartTimeStudent ps2 = new Person(); error
//		PartTimeStudent ps3 = new Student(); error
		
	}

}
