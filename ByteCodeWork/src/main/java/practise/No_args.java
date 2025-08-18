package practise;

public class No_args {
	int id;
	String name;
	
	No_args(){
		id=1;
		name="ABC";
	}

	public static void main(String[] args) {
		No_args n = new No_args();
		System.out.println("ID ="+ n.id);
		System.out.println("Name = "+n.name);
		No_args n1 = new No_args();
		n1.id=2;
		System.out.println("ID ="+ n1.id);
		System.out.println("Name = "+n1.name);

		System.out.println("ID ="+ n.id);
	}

}
