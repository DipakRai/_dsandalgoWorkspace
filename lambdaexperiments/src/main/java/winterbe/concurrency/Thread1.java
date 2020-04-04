package winterbe.concurrency;

import java.util.concurrent.TimeUnit;

public class Thread1 {

	public static void main(String[] args) {
		
		Runnable task = () -> {			
			System.out.println("Hello " + Thread.currentThread().getName());
		};
		task.run();
		try {
			TimeUnit.SECONDS.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread thread = new Thread (task);
		thread.start();
		System.out.println("Done!");
	}
}
