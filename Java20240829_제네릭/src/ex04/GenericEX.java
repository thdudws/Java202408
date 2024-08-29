package ex04;

public class GenericEX {

	public static void main(String[] args) {

		Product<TV, String> product1 = new Product<>();
		
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println("----------------");
		Product<Car, Integer> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel(10);
		
		Car car = product2.getKind();
		Integer carModel =  product2.getModel();
		
	}

}


/*
 *	private TV kind;
	private K model;
	
	public TV getKind() {
		return kind;
	}
	public void setKind(TV kind) {
		this.kind = kind;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	} 
	
	public class <Car, Integer>
	
	private TV kind;
	private K model;
	
	public Car getKind() {
		return kind;
	}
	public Car setKind(TV kind) {
		this.kind = kind;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	} 
 * 
 */
