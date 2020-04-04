package mulshankar13.threads;

public class OddEvenThreadsNonLambda {

	public static void main(String[] args) {
		OddThread oddThread = new OddThread();
		EvenThread evenThread = new EvenThread();
		Thread thread1 = new Thread(oddThread);
		Thread thread2 = new Thread(evenThread);
		thread1.start();
		thread2.start();
		/*
		 * try { oddThread.join(); evenThread.join(); } catch(InterruptedException e) {
		 * e.printStackTrace(); }
		 */
	}
}

class OddThread implements Runnable {
	public OddThread() {
		System.out.println(" OddThread instantiated...");
	}

	@Override
	public void run() {
		for (int i = 1; i < 50; i = i + 2) {
			synchronized (this) {
				try {
					System.out.println("Odd:" + i);
					this.wait();
					this.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class EvenThread implements Runnable {

	public EvenThread() {
		System.out.println("EvenThread instantiated...");
	}

	@Override
	public void run() {
		for (int i = 2; i < 50; i = i + 2) {
			synchronized (this) {
				try {
					this.notify();
					System.out.println("Even:" + i);
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}