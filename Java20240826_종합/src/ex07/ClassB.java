package ex07;

public class ClassB extends ClassA {

	private int b;
	
	public ClassB() {
	}
	
	public ClassB(int b) {
//		super(0); 기본생성자 없을때
		this.b = b;
	}
	
	public ClassB(int a, int b) {
		super(a);
		this.b = b;
	}
	
	int getB() {
		return b;
	}
	
	@Override
	void info() {
		super.info();
		System.out.println(b + "");
	}
	
}
