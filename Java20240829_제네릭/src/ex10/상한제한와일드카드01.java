package ex10;

/*
 * 상한 제한 (? extends T): 특정 타입과 그 하위 타입을 허용하며, 읽기 전용 작업에 적합합니다. 타입 안전성을 유지하면서 다양한 타입을 허용할 수 있습니다.
하한 제한 (? super T): 특정 타입과 그 상위 타입을 허용하며, 쓰기 전용 작업에 적합합니다. 타입 안전성을 유지하면서 하위 타입의 요소를 추가할 수 있습니다.
둘 다 제네릭 타입의 유연성을 유지하면서도 타입 안정성을 보장하기 위한 방법으로 사용됩니다. 이를 통해 자바에서 더 안전하고 유연한 제네릭 프로그래밍을 할 수 있습니다.
 * */

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
	// Box<? extends Number> => 와일드 카드 상한 제한 
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class 상한제한와일드카드01 {

	public static void main(String[] arge) {
	
		Box<Integer> iBox = new Box();
		iBox.setObj(1234);
		
		Box<Double> dBox = new Box();
		dBox.setObj(12.15);
		
		Box<String> sBox = new Box();
		sBox.setObj("korea");
		
		BoxFactory.peekBox(iBox);
		BoxFactory.peekBox(dBox);
//		BoxFactory.peekBox(sBox); error
	}
	
}


