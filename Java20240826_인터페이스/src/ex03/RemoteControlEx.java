package ex03;

public class RemoteControlEx {

	public static void main(String[] args) {

		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.trunOn();
		rc.setVolum(5);
		rc.trunOff();
		
		System.out.println("-----------------");
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.trunOn();
		rc.setVolum(6);
		rc.trunOff();
		
	}

}
