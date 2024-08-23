package ex03;

public class PartTimeStudent extends Student {

	String job;
	int pay;
	
	public PartTimeStudent() {}
	
	public PartTimeStudent(String name, int age, String school, String studentID, String job, int pay) {
		super(name, age, school, studentID);
		this.job = job;
		this.pay = pay;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.printf("현재는 %s중이고, 하루 일급은 %d 입니다.\n", job, pay);
	}
	
	public void work() {
		System.out.println("근무 중!");
	}
	
}
