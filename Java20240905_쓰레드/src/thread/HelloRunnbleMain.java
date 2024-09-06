package thread;

public class HelloRunnbleMain {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() +  " main() start");
		
		HelloThread hellothread = new HelloThread();
		Thread thread = new Thread(hellothread);
		
		thread.start();
		
		System.out.println(Thread.currentThread().getName() +  " main() end");
		
	}

}
