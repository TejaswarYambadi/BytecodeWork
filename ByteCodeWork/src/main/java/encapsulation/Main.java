package encapsulation;
class Person{
	private String name;
	private int age;
	
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		if(newAge>0) {
			age=newAge;
		}
		else {
			age=0;
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("ABC");
		p.setAge(-50);
		System.out.println("Name = "+p.getName());
		System.out.println("Age = "+p.getAge());
		
	}

}
