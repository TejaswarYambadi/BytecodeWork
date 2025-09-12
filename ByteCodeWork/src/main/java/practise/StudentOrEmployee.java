package practise;
class Employee{
	int empid;
	String ename;
	Employee(int empid, String ename){
		this.empid= empid;
		this.ename= ename;
	}
	public void getData() {
		System.out.println("EmpId "+empid+" "+"Ename "+ename);
	}
}
class Student{
	int sid;
	String sname;
	Student(String sname,int sid){
		this.sid = sid;
		this.sname=sname;
	}
	public void getData() {
		System.out.println("SId "+sid+" "+"Sname "+sname);
	}
}
public class StudentOrEmployee {
	public static void main(String[] args) {
		Object o[]= new Object[2];
		o[0]= new Employee(1,"Employee");
		o[1]= new Student("Student",2);
		for(int i=0;i<o.length;i++) {
			Object obj = o[i];
			if(obj instanceof Employee) {
				Employee e = (Employee)obj;
				e.getData();
			}
			else if(obj instanceof Student){
				Student s = (Student) obj;
				s.getData();
			}
		}
	}
}
