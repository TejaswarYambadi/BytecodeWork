package thread_Examples;

public class Sleep_And_Join {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			System.out.println("Task A");
		});
	
		Thread t2 = new Thread(()->{
			System.out.println("Task B");
		});
		t1.start();
		t1.sleep(5000);
		t2.start();
	
	}
}
