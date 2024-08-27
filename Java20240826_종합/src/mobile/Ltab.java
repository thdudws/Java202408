package mobile;

public class Ltab extends Mobile {

	public Ltab(String mobilename, int batterySize, String osType) {
		super(mobilename, batterySize, osType);
	}

	@Override	//배터리 잔량 100 => 2분 20
	public void operate(int time) {	//배터리 감소 구현 1분 충전시 배터리 10 감소
		int tmp = getBatterySize() - time*10;
		setBatterySize(tmp);
	}
	
	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize() + time*10);
	}
	
	
}
