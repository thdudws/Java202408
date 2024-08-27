package mobile;

public abstract class Mobile {

	private String mobilename;
	private int batterySize;
	private String osType;
	
	public Mobile() {}
	
	public Mobile(String mobilename, int batterySize, String osType) {
		this.mobilename = mobilename;
		this.batterySize = batterySize;
		this.osType = osType; 
	}
	
	public abstract void operate(int time);
	
	public abstract void charge(int time);

	
	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	} 
	
	
}
