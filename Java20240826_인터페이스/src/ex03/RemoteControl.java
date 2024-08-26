package ex03;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	void trunOn();
	void trunOff();
	void setVolum(int volume);
	
	
}
