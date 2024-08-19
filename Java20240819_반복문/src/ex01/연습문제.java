package ex01;

public class 연습문제 {

	public static void main(String[] args) {

		//int 형 배열 참조변수 nArr 설정
		int[] nArr = new int[5];
		
		
		//배열 초기화 -> 값의 범위는 1~100 => 랜덤함수 이용해서
		for(int i=0; i<5; i++) {
			nArr[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(nArr[i] + ", ");
		}
		
		
		//최대값, 최소값 구하기
		int max, min;	//변수 한번에 잡아주기
		max = 0;
		min = 999; //숫자로 초기화할 때
		
		//max = min = nArr[0];	배열의 첫번째 값을 넣어서 초기화 해주는 것
		
		for(int i=0; i<5; i++) {
			if(nArr[i]>max)
				max = nArr[i];
			
			if(nArr[i]<min)
				min = nArr[i];
		}
		
		System.out.println("\n최대값  : " + max + ", 최소값 : " + min );
//		System.out.printf("최대값  :  %d,  최소값 : %d\n" , max, min );
		
		
		//총점 & 평균
		int sum = 0;
//		double avg = 0;
		
		for(int i=0; i<nArr.length; i++) {	//숫자 대신 length 넣어주는 게 더 좋다
			sum += nArr[i];
		}
	
//		avg = sum/5.0;
		
		System.out.printf("총점  :  %d,  평균 : %.2f\n" , sum, sum/(double)nArr.length);	//(double)은 앞뒤 상관없이 넣어줘도 됌
//		System.out.println("총점  :  %d,  평균 : %.1f\n" , sum, sum/5.0);
		//length 배열의 수
		
		//오름차순 정렬(이중 for)
		
		for(int i=0; i<nArr.length; i++) {
			for(int j=0; j<nArr.length-1; j++) {	//j -> 0~3
				if(nArr[j]>nArr[j+1]); {//첫번째 배열과 그 다음 배열 비교
				 int tmp = nArr[j];
				  nArr[j] = nArr[j+1];
				  nArr[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<nArr.length; i++) {
			System.out.print(nArr[i] + ", ");
		}
		
		
		
	}

}
