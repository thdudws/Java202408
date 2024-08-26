package ex06;

abstract class Animal {	//추상클래스(미완성클래스) -> 객체 생성 불가 뼈대만 존재
	
	private String name;	//멤버변수, 인스턴스 변수	=> 생성된 객체들이 개별적 가지고 있음
	
	public Animal() {}
	
	public Animal (String name) {
		this.name = name;
	}

	abstract void speak(); //추상메소드
	
	void info () {	//메소드, 인스턴스 메소드
		System.out.println(name + " 입니다.");
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
}
