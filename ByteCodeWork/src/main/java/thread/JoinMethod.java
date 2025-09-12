package thread;
class Threads extends Thread{
	public void run() {
		System.out.print(Thread.currentThread().getName());
		for(int i=0;i<3;i++) {
			System.out.print(" "+(i+1)+ "  ");
		}
	}
}
public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
	Threads t1 = new Threads();
	t1.start();
	t1.join();
	Threads t2 = new Threads();
	t2.start();
	t2.join();
	Thread t3 = new Threads();
	t3.start();
	t3.join();
	}
}
