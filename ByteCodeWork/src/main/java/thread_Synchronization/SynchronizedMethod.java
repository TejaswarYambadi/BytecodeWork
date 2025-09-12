package thread_Synchronization;
class counter{
	int count=0;
	public synchronized void increment() {
		count++;
	}
	public int display() {
		return count;
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) throws InterruptedException {
		counter c = new counter();
		Thread t1 = new Thread(() -> { for(int i=0;i<10;i++) c.increment(); });
		Thread t2 = new Thread(() -> { for(int i=0;i<10;i++) c.increment(); });

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Final Count " + c.count);

	}
}
