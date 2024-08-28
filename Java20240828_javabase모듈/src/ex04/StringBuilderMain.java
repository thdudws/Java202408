package ex04;

public class StringBuilderMain {

	public static void main(String[] args) {

//		StringBuilder builder = new StringBuilder();
		StringBuffer builder = new StringBuffer();
		
		
		builder.append("DEF");
		
		System.out.println(builder);
		
		builder.insert(0, "ABC");
		
		System.out.println(builder);
		
		builder.insert(1, "K");
		System.out.println(builder);
		
		builder.delete(1, 4); //1 ~ 4번째전까지 1은 K부터 ↑ 위에서 1에 K를 넣었음
		System.out.println(builder);
		
		
		
	}

}
