package ex03;

//final 클래스 상속 불가
public class Student extends Person {

	String school;
	String studentID;
	
	public Student () {}
	
	//super(name, age, school, studentID);
	public Student(String name, int age, String school, String studentID) {
		super(name, age);	//상위클래스 생성자 호출 구문
		this.school = school;
		this.studentID = studentID;
	}
	
	@Override
	public void introduce() {
		super.introduce();	//오버라이딩한 상위클래스 호출
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, studentID);
	}

	public void study () {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
}
