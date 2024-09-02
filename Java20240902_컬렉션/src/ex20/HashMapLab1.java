package ex20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 표준입력으로 나라이름과 인구수를 입력받아
HashMap 객체에 5개까지 저장한 후에 출력하고 종료한다.
단, 입력되는 나라명은 모두 달라야 한다.
     
클래스명 : HashMapLab1

- 실행 결과
   나라이름을 입력하세요 : 
   인구 수를 입력하세요 : 
  *저장되었습니다.*
   나라이름을 입력하세요 : 
   인구 수를 입력하세요 : 
   *나라명 xxx는 이미 저장되었습니다.*
   :
   
  5개가 모두 입력되었습니다.
  입력된 데이터 : XX(nn), XX(nn)....
 */

public class HashMapLab1 {

	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의 --------------------");
		return super.equals(obj);
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		final int MAX = 5;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("나라 이름을 입력하세요 : ");
			String na = sc.nextLine();
			
			System.out.println("인구 수를 입력하세요 : ");
			int pup = Integer.parseInt(sc.nextLine());
			
			map.put(na, pup);
			count++;
			
			if(count >= MAX) break;
			
			System.out.println("*저장되었습니다.*");
			
		}
		
		Set<String> set = map.keySet();
		for(String s : set)
			System.out.println(s + " " + map.get(s));
		
//		
//		
//		System.out.printf("나라명 %s는 이미 저장되었습니다");
//		
//		System.out.printf("%d개가 모두 입력되었습니다");
//		
//		System.out.printf("입력된 데이터 : ");
		
		
	}

}
