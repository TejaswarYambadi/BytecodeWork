package thread_Examples;

public class Thread_Names {
	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			System.out.println("Running " +Thread.currentThread().getName());
		});
		Thread t2 = new Thread(()-> {
			System.out.println("Running "+Thread.currentThread().getName());
		});
		Thread t3 = new Thread(()-> {
			System.out.println("Running "+Thread.currentThread().getName());
		});
		t1.start();
		t2.start();
		t3.start();
	}
	
}
