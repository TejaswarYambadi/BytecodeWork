package oops;
class Employee{
	int empid;
	String name;
	static String companyname;
	static {
		companyname="Tcs";
		//System.out.println("Company name "+companyname);
	}
	Employee(int empid,String name){
		this.empid=empid;
		this.name=name;
	}
	public void show() {
		System.out.println("Employee ID = "+empid);
		System.out.println("Employee name = "+name);
	}
	public static void display() {
		System.out.println("Company name "+companyname);
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(001,"Alice");
		e.show();
		e.display();
		Employee e1 = new Employee(002,"Bob");
		e1.show();
		e1.display();
		Employee.display();
		
	}

}
