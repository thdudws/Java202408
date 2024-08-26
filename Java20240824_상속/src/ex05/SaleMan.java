package ex05;

public class SaleMan extends Person {

	private String company;
	private int salary;
	
	public SaleMan(String name, int age, String company, int salary) {
		super(name,age);	//순서가 중요, 바뀌면 에러
		this.company = company;
		this.salary = salary;
	}
	
	public void introduce () {
		System.out.printf("제 회사는 %s이고, 급여는 %d입니다.\n", company, salary);
		System.out.printf("안녕하세요 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	}
	
	public void work () {
		System.out.println(name + "이(가) 근무 중 입니다.");
	}
	
}
