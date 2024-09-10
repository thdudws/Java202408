package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};
		
		//stream 요소둘이 하나씩 흘러가면서 처리됌 강물처럼 띄워서 흘려보낸다
		int total = Arrays.stream(arr).filter(n -> n%2 == 1).sum();
		
		System.out.println(total);
		
		long count = Arrays.stream(arr).filter(i -> i%3==0).count();
		System.out.println(count);
		
		Arrays.stream(arr).forEach(n -> System.out.print(n +" "));
		
	}

}
