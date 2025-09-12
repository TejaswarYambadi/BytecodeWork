package thread_Examples;

public class PriorityDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println("Maximum Priority Thread is Running");
		});
		Thread t2 = new Thread (()->{
			System.out.println("Normal Priority Thread is Running");
		});
		Thread t3 = new Thread(()->{
			System.out.println("Minimun Priority Thread is Running");
		});
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
