package tv;

public class RentalTV extends TV implements Rentable{

	private int price;
	
	public RentalTV() {}
	
	public RentalTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("대여 TV 채널 %d번의 프로를 플레이 합니다.\n", getChannel());
	}
	
	public void rent() {
		String tmp = String.format("%,d", price);
		System.out.printf("%s 모델의 상품을 대여합니다. %s 원을 지불해주세요\n", getModel(), tmp);
	}
	

	@Override
	public String toString() {
		String tmp = String.format("%,d", price);
		String s = "대여상품정보 : 모델명(" +  getModel() + "), 가격(" + tmp + "원), 크기(" + getSize()+")";
		return s;
	}

}
