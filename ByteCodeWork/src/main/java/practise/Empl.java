package practise;
public class Empl {
	final int empid ;
	String ename;
	static int count;
	{
		++count;
		empid=count;
		//System.out.println("Count = "+count);
	}
	Empl(){
		ename="A";
		System.out.println("Empid = "+empid);
		System.out.println("Ename = "+ename);
	}
	Empl(String ename){
		this.ename=ename;
		System.out.println("Empid = "+empid);
		System.out.println("Ename = "+ename);
	}
	public static void main(String[] args) {
		Empl e = new Empl();
		Empl e1 = new Empl("ALice");
		Empl e2 = new Empl("Bob");
		Empl e5 = new Empl("ALice");
		
	}
	
}
