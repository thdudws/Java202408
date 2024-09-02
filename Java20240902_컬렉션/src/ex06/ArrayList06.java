package ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayList06 {

	public static void main(String[] args) {

		//출력 방식 => Iterator
//		List<String> list = new ArrayList<>();
		Set<String> list = new HashSet<String>();
		
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
		list.add("kor1");	//중복 데이터 저장 X
		
		Iterator<String> itr = list.iterator();	//반복자 획득
		
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("----------------------");
		
		itr = list.iterator();	//반복자 획득
		
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
	}

}
