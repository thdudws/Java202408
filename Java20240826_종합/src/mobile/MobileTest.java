package mobile;

public class MobileTest {

	public static void main(String[] args) {
		 // 각각의 Mobile 객체를 생성한다. 
		 // 생성된 객체의 정보를 출력한다.(printMobile() 호출) 
		 
		 Mobile mLtab = new Ltab("Ltab", 500, "ABC-01");
		 Mobile mOtab = new Otab("Otab", 1000, "XYZ-20");
		
		 MobileTest.printTitle();
		 MobileTest.printMobile(mLtab);
		 MobileTest.printMobile(mOtab);
		 
		 
		// 각각의 Mobile 객체에 10분씩 충전을 한다.
		// 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
		 mLtab.operate(10);
		 mOtab.operate(10);
		 System.out.println();
		 System.out.println("   [10분 충전]");
		 MobileTest.printTitle();
		 MobileTest.printMobile(mLtab);
		 MobileTest.printMobile(mOtab);
		 System.out.println();
		 
		 
		// 각각의 Mobile 객체에 5분씩 통화를 한다.
		// 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
		 mLtab.operate(5);
		 mOtab.operate(5);
		 System.out.println("   [5분 통화]");
		 MobileTest.printTitle();
		 MobileTest.printMobile(mLtab);
		 MobileTest.printMobile(mOtab);
		
		 
		 // 각각의 Mobile 객체에 10분씩 충전을 한다. 
		 // 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출) 
		 // 각각의 Mobile 객체에 5분씩 통화를 한다. 
		 // 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
	}
	
	public static void printTitle() {
		System.out.println("     Mobile	      Battery	       OS");
		System.out.println("-------------------------------------------------");
	}
	
	public static void printMobile(Mobile mobile) {
		 System.out.printf("%10s\t %10d\t %10s\t\n", mobile.getMobilename(),
				 mobile.getBatterySize(),
				 mobile.getOsType());
	}
	

}
