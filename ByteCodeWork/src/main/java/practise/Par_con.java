package practise;

public class Par_con {
	int id;
	String name;
	static String companyname;
	Par_con(int id,String name,String companyname){
		this.id=id;
		this.name=name;
		this.companyname=companyname;
	}
	public void display() {
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Company Name = "+companyname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Par_con p = new Par_con(1,"A","TCS");
		p.display();
		Par_con p1 = new Par_con(2,"A","Infosys");
		p1.display();
		System.out.println(p.companyname);
		
	}

}
