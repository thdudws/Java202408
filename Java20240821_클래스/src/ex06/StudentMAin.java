package ex06;

public class StudentMAin {

	public static void main(String[] args) {

//		Student s1 = new Student();
//		s1.setName("차은우");
//		System.out.println(s1.getName());
		
		System.out.println(Student.job);
		
		Student.change("차승우");	//o
		
		System.out.println(Student.job);
		
		Student s2 = new Student();
//		s2.change("접근가능"); 
		//x 타인이 직관적으로 change가 정적메소드인지 파악불가

		
		
		
	}

}
