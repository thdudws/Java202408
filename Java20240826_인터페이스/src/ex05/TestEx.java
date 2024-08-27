package ex05;

class A {
	
	String name;
	int age;
	
	public A() {}
	
	public A(String name, int age) {
		this.name = name;
	}
	
	void fa() {
		System.out.println("AAAAAAAAA");
	}
}

class B extends A {
	
	public B() {}
	
	@Override
	void fa() {
		System.out.println("BBBBBBBBB");
	}
}

class C extends B {
	@Override
	void fa() {
		System.out.println("CCCCCCCCC");
	}
}

public class TestEx {
	
	public static void main(String[] args) {

		Object obj = new A("홍길동", 20);
		System.out.println(obj);
		
		System.out.println("------------------------");
		
		A a = new C();
		a.fa();
		
		B b = (B)a;
		b.fa();
		((B)a).fa();
		
	}

}
