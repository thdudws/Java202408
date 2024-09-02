package ex17;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01{

	public static void main(String[] args) {

		/*
		 * Queue는 인터페이스이다. 따라서 객체 생성을 할 수 없다.
		 * Queue를 사용하기 위해서는 Queue를 구현하든가, 아니면 구현된 객체를 사용하면 된다.
		 */
		
		Queue<Integer> qu = new LinkedList<Integer>();
		
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		
	}

}
