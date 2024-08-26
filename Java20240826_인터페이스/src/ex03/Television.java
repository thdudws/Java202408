package ex03;

public class Television implements RemoteControl {

	private int volnum;

	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolum(int volume) {
		if(volnum > RemoteControl.MAX_VOLUME) {
			this.volnum = RemoteControl.MAX_VOLUME;
		}else if(volnum < RemoteControl.MIN_VOLUME) {
			this.volnum = RemoteControl.MIN_VOLUME;
		}else {
			this.volnum = volnum;
		}
		System.out.println("현재 TV 볼륨 : " + this.volnum);
	}
	
}
