package inheritance;

class Emp_Details {
	int Emp_id;
	String Emp_name;
	float Sal;
}
class Find_Exp extends Emp_Details {
	float exp;

	Find_Exp(int Emp_id, String Emp_name, float sal, float exp) {
		this.Emp_id = Emp_id;
		this.Emp_name = Emp_name;
		this.exp = exp;
		this.Sal = sal;
		if (exp > 0 && exp < 2) {
			this.Sal = this.Sal + ((this.Sal * 5) / 100);
		} else {
			this.Sal = this.Sal + ((this.Sal * 10) / 100);
		}
	}

	public void display() {
		System.out.println("Employee ID = " + Emp_id);
		System.out.println("Employee Name = " + Emp_name);
		System.out.println("Employee Salary = " + Sal);
	}
}

public class Salary {
	public static void main(String[] args) {
		Find_Exp f = new Find_Exp(1, "A", 100, 8);
		f.display();
	}
}


