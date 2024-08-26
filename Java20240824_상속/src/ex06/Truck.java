package ex06;

public class Truck extends Vehicle {

	double loadCapacity;
	
	//calculateMaintenanceCost() 메서드를 오버라이드하여
	//적재 용량에 비례한 정비 비용을 계산
	//톤당 20000원의 정비 비용이 발생한다고 가정
	
	public Truck (String licensePlat, String owner, double loadCapacity) {
		super(licensePlat, owner);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	double calculateMaintenanceCost() {
		return loadCapacity*20000.0;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("적재 용량 : " + loadCapacity);
		System.out.println("정비 비용 : " + calculateMaintenanceCost());
	}
	
}
