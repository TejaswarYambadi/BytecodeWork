package inheritance;

public class Admin extends Developer{
	public void manage() {
		super.read();
		write();
		System.out.println("Admin Manage code");
	}
	public void read() {
		System.out.println("Admin Read Updated Code");
	}
	
}
