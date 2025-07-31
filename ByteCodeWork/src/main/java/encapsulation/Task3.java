package encapsulation;

class Dog{
	private String name;
	private String breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void bark() {
		System.out.println("Woof! My name is "+ getName());
	}
}
public class Task3 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("ALICE");
		d1.setBreed("DOG");
		d1.bark();
	}

}