package thread_Synchronization;
class Demo{
	public static synchronized void show(String msg) {
		System.out.print("Hii Hello Welcome "+msg);
	}
}
public class StaticSynchronization {
	public static void main(String[] args) {
		Demo d = new Demo();
	Thread t = new Thread(()-> d.show("ALice"));
	t.start();
	}
}
