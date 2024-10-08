package ex07;

import java.security.PublicKey;

//멤버로컬클래스 생성


interface  Printable {
	void print();
	void print2();
}

class Papers {
	private String message;
	public Papers(String message) {this.message = message;}
	
	public Printable getPrinter() {	//반환타입 : Printable -> Printable 구현한 클래스만 반환한다.
		
		//printable p = 이 자리에 올 수 있는 대상은? => printable 구현 클래스만 올 수 있다.
		
		//printable p = new Printer();
		
//		Printable p = new Printable() {	//printable을 구현한 클래스지만 이름이 없는 것
//			@Override
//			public void print() {
//				System.out.println(message);
//			}
//		};
//		
//		return p;
		
		return new Printable() {	//익명클래스
			@Override
			public void print() {
				System.out.println(message);
			}
			
			@Override
			public void print2() {
			}
		};
		
	}
	
}

public class MemberLocalClass {

	public static void main(String[] args) {

		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
	}

}
