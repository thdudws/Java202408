package ex03;

public class RemoteControlEx {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();
		rc.trunOn();
		rc.setVolum(5);
		rc.trunOff();
		
		
	}

}
