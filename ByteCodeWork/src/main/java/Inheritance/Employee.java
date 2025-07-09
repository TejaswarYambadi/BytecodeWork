package Inheritance;
class Details{
	int id;
	String name;
	float salary;
	float exp;
	void getDetails(int i,String n,float s,float e) {
		id =i;
		name =n;
		salary=s;
		exp=e;
	}
}
class SalCal extends Details{
	void calsal() {
		float finalSal=salary+(salary*exp)/100;
		System.out.print("Final Salary = "+finalSal);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalCal x = new SalCal();
		x.getDetails(1,"s001",500,5);
		x.calsal();

	}

}
