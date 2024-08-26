package ex07;

public class ClassC extends ClassB {

	private int c;

	public ClassC() {}
	
	public ClassC(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	@Override
	void info() {
		super.info();
		System.out.println(c);
	}
	
}
