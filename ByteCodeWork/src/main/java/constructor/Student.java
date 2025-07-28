package constructor;

public class Student {
	String name;
	Student(){
		name="unknown";
	}
	Student(String name){
	this.name=name;  
	}
	public String names() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("hii");
		System.out.println(s1.names());
	}

}
