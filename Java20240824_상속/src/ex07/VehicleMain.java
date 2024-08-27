package ex07;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle car = new Car("123가 4567", "이순신", "Diesel", 10);
		car.printInfo();
		
		System.out.println("----------------------");
		
		Vehicle truck = new Truck("548가 8452","김자바",5);
		truck.printInfo();
		
	}

}
