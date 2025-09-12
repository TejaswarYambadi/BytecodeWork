package thread_Synchronization;
class Table{
	void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<11;i++) {
				System.out.println(n*i);
			}
		}
	}
}
public class SynchronizedBlock {
	public static void main(String[] args){
		Table t = new Table();
		Thread t1 = new Thread(()->t.printTable(3));
		Thread t2 = new Thread(()-> t.printTable(5));
		t1.start();
		t2.start();
	}
}
