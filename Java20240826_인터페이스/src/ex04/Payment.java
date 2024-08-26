package ex04;

public interface Payment {

	void makePayment(double amount);
	
}

/*
 *결제 시스템 구현하기
문제 설명: Payment라는 인터페이스를 정의하고, 이 인터페이스를 구현하는 여러 결제 방식을 작성하세요. 
각 결제 방식은 makePayment(double amount) 메서드를 구현해야 합니다.

요구사항:

Payment 인터페이스를 정의하고, makePayment(double amount) 메서드를 선언하세요.
CreditCardPayment, PayPalPayment, CashPayment 클래스를 작성하여 Payment 인터페이스를 구현하세요.
CreditCardPayment의 makePayment(double amount)는 "신용카드로 {amount}원을 결제합니다."를 출력합니다.
PayPalPayment의 makePayment(double amount)는 "PayPal로 {amount}원을 결제합니다."를 출력합니다.
CashPayment의 makePayment(double amount)는 "현금으로 {amount}원을 결제합니다."를 출력합니다.
Main 클래스를 작성하여 각각의 결제 방식 객체를 생성하고 makePayment() 메서드를 호출하여 출력 결과를 확인하세요.
 */