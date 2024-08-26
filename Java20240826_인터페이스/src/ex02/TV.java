package ex02;

interface TV {

	int MAX = 100;	//public final
	
	void powerOn();	//abstract public
	
	void powerOff();
	void soundUp();
	void soundDown();

	//채널 변경 추가 default -> 채널변경은 선택사항 옵션, 되도록 쓰지 말기
	void chanelUp();
	void chanelDown();
	
}
