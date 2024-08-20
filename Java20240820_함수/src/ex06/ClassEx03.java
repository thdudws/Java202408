package ex06;

import java.util.Scanner;

public class ClassEx03 {

	public static void main(String[] args) {
		
		Book b2 = new Book();
		
		b2.제목 = "달러구트의 꿈 백화점";
		b2.저자 = "이미예";
		b2.가격 = 16000;
		b2.재고수량 = 100;
		
		b2.판매(50);
		b2.입고(30);
		b2.총판매금액();
		b2.info();
	
	}

}

class Book {
	String 제목;
	String 저자;
	int 가격;
	int 재고수량;
	int 판매누적수량;
	
	void 판매(int stock) {	
		재고수량 -= stock;
		판매누적수량 += stock;
	}
	
	void 입고(int stock) {
		재고수량 += stock;
	}
	
	void 총판매금액() {
		System.out.println("총판매금액 : " + 판매누적수량 * 가격);
	}
	
	void info() {
		System.out.printf("제목 : %s, " + "저자 : %s, 가격 : %d, 재고수량 : %d, 판매누적수량 : %d\n", 
				제목, 저자, 가격, 재고수량, 판매누적수량);
	}
}
	
	
	