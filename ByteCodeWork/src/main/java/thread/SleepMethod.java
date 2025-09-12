package thread;

public class SleepMethod {

	public static void main(String[] args) {
		
		System.out.println("Start");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended....");
	}

}
