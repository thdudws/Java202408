package tv;

public class TVTest {

	public static void main(String[] args) {

		TV sTV = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rTV = new RentalTV("RENTALTV-10", 42, 1, 100000);
		
		sTV.channelUp();
		sTV.channelUp(); 
		
		rTV.channelDown();
		rTV.channelDown();
		rTV.channelDown();
		
		TVTest.printAllTV(sTV);
		TVTest.printAllTV(rTV);
		
		TVTest.printRentalTV(rTV);
		
	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		
		if (tv instanceof SaleTV sale) {
			sale.paly();
			sale.sale();
		}
		
		if (tv instanceof RentalTV rent) {
			rent.play();
		}
	}
	
	static void printRentalTV(Rentable tv) {
		if (tv instanceof RentalTV rent) {
			rent.rent();
		}
	}

}
