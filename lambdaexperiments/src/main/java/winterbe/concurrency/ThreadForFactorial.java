package winterbe.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author mulshankar13
 *
 */
public class ThreadForFactorial {

	public static void main(String[] args) {
		int num=5;
		//ExecutorService executorService = Executors.newCachedThreadPool();
		//FactorialRunnable factorialRunnable = new FactorialRunnable(5);
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		FactorialCallable factorialCallable = new FactorialCallable(num);
		Future <Double>factorial = executorService.submit(factorialCallable);
		try {
			System.out.println("Callable:Factorial of "+num + " is "+factorial.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}

// Create a runnable task
class FactorialRunnable implements Runnable {

	int num = 1;
	double factorial = 1;

	public FactorialRunnable(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		for (int i = num; i > 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + "= " + factorial);
	}

}

// create a Callable task
class FactorialCallable implements Callable<Double>{

	int num = 1;
	double factorial = 1;
	public FactorialCallable(int num) {
		this.num=num;
	}

	@Override
	public Double call() throws Exception {
		for (int i = num; i > 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
}