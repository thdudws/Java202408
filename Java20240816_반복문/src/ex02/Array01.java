package ex02;

public class Array01 {

	public static void main(String[] args) {

		
		int[] nArr = new int[5];	//배열이 5개
//		int nArr[] = new int[5];	//잘 안쓰는 형식
		
		nArr[0] = 70;
		nArr[1] = 80;
		nArr[2] = 90;
		nArr[3] = 100;
		
		
//		System.out.println(nArr[0]);
//		System.out.println(nArr[1]);
//		System.out.println(nArr[2]);
//		System.out.println(nArr[3]);
//		System.out.println(nArr[4]);
		

		for(int i=0; i<5; i++)
			System.out.println(nArr[i]);	//위 방식의 축약형
		
		System.out.println("===========");
		
		int[] Arr = new int[5];
		
		Arr[0] = 60;
		Arr[1] = 70;
		Arr[2] = 80;
		Arr[3] = 90;
		Arr[4] = 100;
		
		for (int i=0; i<5; i++) {
			System.out.println(Arr[i]);
		}
		
		
		
	}

}
