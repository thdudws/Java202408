package ex03;

class Boxs<T> {
	public T content;
}

public class GenericEx {

	public static void main(String[] args) {

		Boxs<String> box1= new Boxs<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Boxs<Integer> box2 = new Boxs<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		
		
	}

}
