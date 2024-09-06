package thread;

import static util.MyLogger.log;

public class CounterThreadAMain {

	public static void main(String[] args) {

		CounterThread thread = new CounterThread();
		thread.start();
		
	}

}
