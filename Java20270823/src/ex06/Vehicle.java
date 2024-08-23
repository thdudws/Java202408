package ex06;

public class Vehicle {

	String licensePlate;	//차량번호
	String owner;	//소유자
	
//	public Vehicle() {}
//	
	public Vehicle(String licensePlate, String owner) {
		this.licensePlate = licensePlate;
		this.owner = owner;
	}

	public void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	double calculateMaintenanceCost() {
		return 0;
	}
	
	void printInfo() {
		System.out.println("차량 번호 : " + licensePlate);
		System.out.println("소유자 : " + owner);
		startEngine();
	}
	
//	↑
//	public void introduce() {
//		System.out.printf("차량 번호 : %s\n소유자 : %s\n", licensePlate, owner);
//	}
//	
	
	
}
