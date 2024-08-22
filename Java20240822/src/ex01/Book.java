package ex01;

public class Book {

	String title;
	String author;
	int page;
	
	//생성자
	Book(){	this("", "", 0);}
	
	// title과 author만을 매개변수로 받는 생성자
	Book(String title, String author){
//		this.title =  title;
//		this.author = author;
		this(title, author, 0);
		System.out.println("생성자");
	}
	
	// 모든 필드를 매개변수로 받는 생성자
	Book(String title, String author, int page){
		this.title =  title;
		this.author = author;
		this.page = page;
		
//		page = this.page; 0이 나옴 오류
		
	}
	
	void displayInfo() {
		System.out.printf("제목 : %s, 저자 : %s, 페이지 : %d\n", title, author, page);
	}
	
}
