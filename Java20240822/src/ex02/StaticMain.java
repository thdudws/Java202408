package ex02;

class StaticEx {
	int count = 0;	//멤버변수, 인스턴스변수	(개인적)
	static int cnt = 0;	//정적변수, 클래스변수 (공유) 
	
	void func() {
		//인스턴스변수, 클래스변수 사용가능, 인스턴스메소드, 클래스메소드 사용가능
	}
	
	static void sfunc() {
		//클래스변수, 클래스메소드만 사용가능, 인스턴스변수, 인스턴스메소드 사용불가
	}
	
}

public class StaticMain {

	public static void main(String[] args) {

		StaticEx ex1 = new StaticEx();
		
		ex1.count++;
		ex1.cnt++; //↓
//		StaticEx.cnt++;	클래스변수는 클래스 이름따라서 인스턴스변수랑 구분짓기 쉽게
		
		
		System.out.println(ex1.count + " , " + ex1.cnt);
		
		StaticEx ex2 = new StaticEx();
		ex2.count++;
		ex2.cnt++;
		System.out.println(ex2.count + " , " + ex2.cnt);
		
		
		StaticEx ex3 = new StaticEx();
		ex3.count++;
		ex3.cnt++;
		System.out.println(ex3.count + " , " + ex3.cnt);
		
	}
	
	

}
