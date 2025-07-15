package inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest g1=new Guest();
		g1.read();
		Developer d = new Developer();
		d.write();
		d.read();
		Admin a = new Admin();
		a.read();
		a.write();
		a.manage();	
	}

}
