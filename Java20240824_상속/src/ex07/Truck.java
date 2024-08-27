package ex07;

public class Truck extends Vehicle {

	double loadCapacity; //(적재 용량: 단위는 톤)
	
	public Truck (String licensePlate, String owner, double loadCapacity) {
		super(licensePlate, owner);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	double calculateMaintenanceCost() {
		return loadCapacity*20000.0;
	}
	
//	void startEngine() { super.printInfo();에 포함되어있음
//		System.out.println("차량이 시동을 걸었습니다.");
//	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("적재 용량 : " + loadCapacity);
		System.out.println("정비 비용 : " + calculateMaintenanceCost());
	}
	
}
