package polymorphism;
class Employee{
	String name;
	int id;
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	void display() {
		System.out.println("Employee Name: " + name + ", ID: " + id);
	}
}
class FullTime extends Employee{
	 int salary;
	 FullTime(String name,int id,int salary){
		 super(name,id);
		 this.salary=salary;
	 }
	 void display() {
		 System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: " + salary);
	 }
}
class PartTime extends Employee{
	int hours;
	PartTime(String name,int id,int hours){
		super(name,id);
		this.hours=hours;
	}
	void display() {
		System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: " + 100*hours);
	}
}
class ContractEmployee extends Employee{
	int contract;
	ContractEmployee(String name,int id,int contract){
		super(name,id);
		this.contract=contract;
	}
	void display() {
		System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: " + contract);
	}
}
public class EmployeePayRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new FullTime("E001", 101, 50000);
		Employee e2 = new PartTime("E002", 102, 20);
		Employee e3 = new ContractEmployee("E003", 103, 30000);
		e1.display();
		e2.display();
		e3.display();
	}

}
