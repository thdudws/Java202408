package mobile;

public class Otab extends Mobile {

	public Otab() {
	}
	
	public Otab(String mobilename, int batterySize, String osType) {
		super(mobilename, batterySize, osType);
	}

	@Override
	public void operate(int time) {	//배터리 감소 구현 1분 충전시 배터리 10 감소
		int tmp = getBatterySize() - time*12;
		setBatterySize(tmp);
	}

	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize() + time*8);
	}
	
	
}
