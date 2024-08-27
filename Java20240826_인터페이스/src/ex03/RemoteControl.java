package ex03;

public interface RemoteControl {

	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메서드 -> 메서드 선언부만 작성
	void trunOn();
	void trunOff();
	void setVolum(int volume);
	
	
}
