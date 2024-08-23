package ex02;

//final class Student => Student 클래스 상속불가
//public final class Student extends Person{
public class Student extends Person{

	
	private String school;
	private String studentID;	//학번
	
	public Student() {}
	
	public Student(String school, String studentID) {
		this.school = school;
		this.studentID = studentID;
//		this("kim",10,school,studentID);
	}
	
	public Student(String name, int age, String school, String studentID) {
		super(name, age);	//상위클래스(person) 생성자 호출 구문
		this.school = school;
		this.studentID = studentID;
	}
	
	//@:어노테이션, @Override ->상위클래스 메소드를 하위클래스가 재정의했다.
	//문제가 있다면 컴파일 에러 출력된다.
	@Override	
	public void introduce () {
//		↓ System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
		super.introduce();	//오버라이딩한 상위클래스 메소드 호출
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, studentID);
	}
	
	public void study () {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
}
