package ex01;

public class MainUser {

	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();
		
		tv.IsActive(true); //전원 켜고
		tv.ChangeSound(1);
		tv.ChangeSound(1);
		tv.ChangeSound(1);
//		System.out.println(tv.sound);	//3
		
		tv.ChangeSound(-1);
		tv.ChangeSound(-1);
//		System.out.println(tv.sound);	//1
		
		tv.IsActive(false); //전원끄기
		
		
	}

}
