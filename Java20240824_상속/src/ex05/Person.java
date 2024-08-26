package ex05;


public class Person {

	String name; //private 있는 건 상속불가
	int age;
	
	public Person() {}	//반드시 작성해주기
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//final -> 메소드 재정의를 허용하지 않겠다.
	public void introduce() {
		System.out.printf("안녕하세요 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
	
	
}
