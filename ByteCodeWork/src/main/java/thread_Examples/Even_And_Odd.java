package thread_Examples;
public class Even_And_Odd{
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(()-> {
			for(int i=1;i<10;i+=2) {
				System.out.println("Odd"+i);
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0;i<=10;i+=2) {
				System.out.println("Even"+i);
			}
		});
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}
}
