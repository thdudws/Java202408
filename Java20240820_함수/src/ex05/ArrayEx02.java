package ex05;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		//new 연산자로 배열 생성 ↓
		//타입[] 변수 = new 타입[길이];

		int[] oldIntArry = {1,2,3};	//길이가 3인 배열
		int[] newIntArray = new int[5];	//길이 5인 배열을 새로 생성
		
		newIntArray = oldIntArry;
		for(int i=0; i<newIntArray.length; i++)
			System.out.println(newIntArray[i]);
		
		System.out.println("-----------------------------");
		
		int[] oldIntArry2 = {1,2,3};
		int[] newIntArray2 = new int[5];
		
		//oldIntArry2에 있는 값을 newIntArray2에 복사
		for(int i=0; i<oldIntArry.length; i++)
			newIntArray2[i] = oldIntArry2[i];
		
		oldIntArry[2] = 300;
		for(int i=0; i<oldIntArry.length; i++)
			System.out.println(oldIntArry[i]);
		
		for(int i=0; i<newIntArray2.length; i++)
			System.out.println(newIntArray2[i]);
		
		System.out.println("----------------------------------");
		
		//oldIntArry2에 있는 값을 newIntArray2에 복사
				
		int[] oldIntArry3 = {10,20,30,40,50};	//길이가 3인 배열
		int[] newIntArray3 = new int[5];	//길이 5인 배열을 새로 생성
		System.arraycopy(oldIntArry3, 0, newIntArray3, 0, oldIntArry3.length);
		
		for(int i=0; i<oldIntArry3.length; i++)
			System.out.println(oldIntArry3[i]);
		
		System.out.println("----------------------------------");
		
		for(int i=0; i<newIntArray3.length; i++)
			System.out.println(newIntArray3[i]);
		
		
//		int[] old = {1,2,3};	//길이가 3인 배열
//		
//		int[] newArr = new int[5];	//길이 5인 배열을 새로 생성
//		
//		for(int i=0; i<old.length; i++) {	//배열 항목 복사
//			newArr[i] = old[i];
//		}
//		
//		for(int i=0; i<newArr.length; i++) {	//배열 항목 출력
//			System.out.print(newArr[i] + ", ");
//		}
		
		
//		String[] oldStrArray = {"java", "array", "copy"};	//길이가 3인 배열
//		
//		String[] newStrArray = new String[5];	//길이 5인 배열을 새로 생성
//		
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length );	//배열 항목 복사
//		
//		for(int i=0; i<newStrArray.length; i++) {	//배열 항목 출력
//			System.out.print(newStrArray[i] + ", ");
//		}
		
		
		System.out.println("----------------------------------");
		
		
//		//배열 항목 반복을 위해 향상된 for문
//		for(int n : newIntArray3)
//			System.out.println(n);
//		
//		String[] str = {"java", "spring", "python", "javascript"};
//		for(int i=0; i<str.length; i++)
//			System.out.println(str[i]);
//		
//		for(String s : str)
//			System.out.println(s);
		
		
		//배열 변수 선언과
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 : " + avg);
		
		
	}

}
