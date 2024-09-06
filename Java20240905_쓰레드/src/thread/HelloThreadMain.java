package thread;

public class HelloThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() +  " main() start");
		
		HelloThread hellothread = new HelloThread();
		
		System.out.println(Thread.currentThread().getName() + " start() 호출전");
		hellothread.start();
		System.out.println(Thread.currentThread().getName() + " start() 호출후");
		
		System.out.println(Thread.currentThread().getName() +  " main() end");
	}

}
