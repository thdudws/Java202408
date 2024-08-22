package ex03;

public class Car {

	String name;
	static int count;
	
	Car(){}
	
	Car (String name){
		this.name = name;
		++count;
	}
	
	void infoCar() {
		System.out.println("차량 구입, 이름 : " + this.name);
	}
	
	static void showTotalCars() {
		System.out.println("구매한 차량 수 : " + count);
	}
	
}
