package thread;
class Mythread extends Thread{
	public void run() {

		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class MultipleThreadsRunning {
	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		t1.setName("Thread1");
		t1.start();
		Mythread t2 = new Mythread();
		t2.setName("Thread2");
		t2.start();
	}

}
