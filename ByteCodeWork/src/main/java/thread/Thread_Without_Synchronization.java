package thread;
class Counter{
	int count=0;
	public  void counter() {
		count++;
	}
}
public class Thread_Without_Synchronization {
	public static void main(String[]args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(()->{for(int i=0;i<1000;i++) c.counter();});
		Thread t2 = new Thread(()->{for(int i=0;i<1000;i++) c.counter();});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}
