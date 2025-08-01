package inheritance;
class Person{
	String name;
	Person(String name){
		this.name = name;
	}
	public void displayinfo() {
		System.out.println("Person Name = "+name);
	}
}
class Student extends Person{
	int roll_no;
	Student(String name,int roll_no){
		super(name);
		this.roll_no =roll_no;
	}
	public void displayStuInfo() {
		System.out.println("Student name = "+name);
		System.out.println("Student Roll_No = "+roll_no);
	}
}
public class Person_Studnent {
	public static void main(String[] args) {
		Student s = new Student("ABC",123);
		s.displayStuInfo();
	}

}
