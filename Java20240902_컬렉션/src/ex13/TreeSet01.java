package ex13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class TreeSet01 {

	public static void main(String[] args) {

		//TreeSet => 자동 정렬(오름차순 정렬)
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(2);
		set.add(8);
		set.add(30);
		set.add(8);
		set.add(29);
				
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
