package ex12;

class A{}
class B extends A{}
class C extends B{}

class Box<T>{	
	private T obj;
	
	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}
	@Override
	public String toString() {
		return obj.toString();
	}

}

class BoxFactory{
	// Box<? super Number> => 와일드 카드 하한 제한 
	//B위의 조상은 다 대입가능 하한 제한 B 아래는 제한(B 상위클래스만 대입가능)
	//기능 => set만 가능 ==> 저장
	//주로 쓰기 전용 작업
	public static void peekBox(Box<? super B> box) {	
		System.out.println(box);
		box.getObj();
		box.setObj(new B());
	}
}

public class 하한제한와일드카드01 {

	public static void main(String[] arge) {
	
		Box<Object> o = new Box();
		Box<A> a = new Box();
		Box<B> b = new Box();
		Box<C> c = new Box();
		
		
		BoxFactory.peekBox(o);
		BoxFactory.peekBox(a);
		BoxFactory.peekBox(b);
//		BoxFactory.peekBox(c);
		
	}
	
}


