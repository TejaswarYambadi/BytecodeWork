package thread;
/*Creating thread by extends Thread class
 * 
class Mythread extends Thread{
	public void run() {
		System.out.print("Thread is running..."+Thread.currentThread().getName());
	}
	
}*/


/* Creating thread by implementing Runnable interface
class Mythread implements Runnable{
	public void run() {
		System.out.print("Thread is running.."+Thread.currentThread().getName());
	}
}
*/

public class ThreadCreation {
	public static void main(String[] args) {
		Thread t = new Thread(()->{
			System.out.print("Thread is running...");
		});
		t.run();

	}

}
