package ex06;

import java.util.Scanner;

public class 복습03 {

	public static void main(String[] args) {
		
		Book2 책 = new Book2();
		책.제목 = "달러구트 꿈 백화점";
		책.저자 = "이미예";
		책.가격 = 14000;
		책.재고수량 = 100; 
		
		책.입고(20);
		책.판매(50);
		책.총판매금액();
		책.info();
	}

}

class Book2 {
	String 제목;	//변수
	String 저자;
	int 가격;
	int 재고수량;
	int 판매누적수량;
	
	void 판매 (int bookm) {	//함수
		재고수량 -= bookm;
		판매누적수량 += bookm;
	}
	
	void 입고 (int bookm) {
		재고수량 += bookm;
	}
	
	void 총판매금액 () {
		System.out.println("총판매금액 : " + 판매누적수량 * 가격);
	}
	
	void info() {
		System.out.printf("제목 : %s, 저자 : %s, 가격 : %d, 재고수량 : %d, 판매누적수량 : %d\n", 
				제목, 저자, 가격, 재고수량, 판매누적수량);
	}
	
}
