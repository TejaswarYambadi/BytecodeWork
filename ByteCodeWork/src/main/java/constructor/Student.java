package constructor;

public class Student {
	String name="unknown";
	Student(String name){
		name =this.name;
	}
	public String names() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Hiii");
		System.out.println(s1.names());
	}

}
