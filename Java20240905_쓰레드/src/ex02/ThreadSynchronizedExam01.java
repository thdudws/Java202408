package ex02;

class Counter {
	int count = 0;
	public void increment() {
		count++;
	}
	public void decrement() {
		count--;
	}
	int getCount() {return count;}
}

public class ThreadSynchronizedExam01 {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		for(int i=0; i<=100; i++)
			counter.increment();
			
		for(int i=0; i<=100; i++)
			counter.decrement();
			
		System.out.println("counter : " + counter.getCount());
		
	}

}
