package ex03;

public class Audio implements RemoteControl {

	//필드
	private int volume;
	
	//turnOn() 추상 메서드 오버라이딩
	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다.");
	}

	//turnOff() 추상 메서드 오버라이딩
	@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
	}

	//setVolum() 추상 메서드 오버라이딩
	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	
	
}
