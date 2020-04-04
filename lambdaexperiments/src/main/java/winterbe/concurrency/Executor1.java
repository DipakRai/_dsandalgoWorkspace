package winterbe.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 * Print Hello World using ExecutorService
 * @author mulshankar13
 *
 */
public class Executor1 {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(()->{
			String threadName = Thread.currentThread().getName();
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Hello "+threadName);
		});
		try {
			System.out.println(" attempt to shutdown executors...");
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			System.err.println(" Tasks interrupted...");
		}
		finally {
			if(!executor.isTerminated()) {
				System.out.println(" Cancelling non-finished tasks...");
			}
			executor.shutdownNow();
			System.out.println(" Shutdown completed...");
		}
	}

}
