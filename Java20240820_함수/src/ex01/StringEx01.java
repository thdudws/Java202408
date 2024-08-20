package ex01;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		
		int[] nArr = {1,2,3,4,5};

		String str1 = "korea";
		String str2 = new String ("801020-1079145");
		
		Scanner sc = new Scanner(System.in);
		
		//charAt 특정 위치의 문자열 추출
		char ch = str1.charAt(4);
		System.out.println(ch);
		
		char ch2 = str2.charAt(7);
		String s = (ch2 == '1') ? "남" : "여";
		
		System.out.println(s);
		
		int len = str1.length();
		System.out.println("len : " + len);
		
		String oldStr = "java programing";
						 
		//replace 문자열 대체
		String newStr = oldStr.replace("java", "Spring");
		
		System.out.println(newStr);
		System.out.println(oldStr);
		
		//substring 문자열 잘라내기
		String sub1 = oldStr.substring(3);	//3번째부터
		System.out.println(sub1);
		
		String sub2 = oldStr.substring(5, 9);	//5번째부터 9번째전까지
		System.out.println(sub2);
		
		//indexOf 문자열 찾기
		int len2 = oldStr.indexOf("prog");
		System.out.println(len2);
		
		String board = "국어,영어,수학,컴퓨터";
		
		String[] sArr = board.split(",");
		
		//length 문자열 길이
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		String phone = "010-1234-5678";
		
		//split 문자열 분리
		String[] phone2 = phone.split("-");
		for(int i=0; i<phone2.length; i++)
			System.out.println(phone2[i]);
			
		String str3 = "com";
		String str4 = "com";
		
		System.out.println(str3 == str4);
		
		String str5 = new String ("com");
		String str6 = new String ("com");
		
		System.out.println(str5 == str6);
		
		//equals 내부 문자열 비교
		boolean b = str3.equals(str4);
		System.out.println(b);
		
		boolean b2 = str5.equals(str6);
		System.out.println(b2);
		
//		String oldStr = "java programing";
		System.out.println(oldStr.startsWith("Spring"));
		
		String str7 = "		Java Spring		";
		System.out.println(str7.length());
		
		String str8 = str7.trim();
		System.out.print(str8);	//앞뒤 공간제거
		System.out.println(str7);
		
		System.out.println(str8.toUpperCase());
		System.out.println(str8.toLowerCase());

		
	}

}
