package ex07;

public class ClassA {

	private int a;
	
	public ClassA() { //기본생성자 
	}
	
	public ClassA(int a) {
		this.a = a;
	}
	
	//getter -> int a -> int getA
	int getA() {
		return a;
	}
	
	void info() {
		System.out.println(a + "");
	}
	
}
