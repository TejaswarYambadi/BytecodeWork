package inheritance;
class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Barking...");
	}
}
class Labrador extends Dog{
	public void color() {
		System.out.println("WhiteColor...");
	}
}
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labrador l = new Labrador();
		l.color();
		l.bark();
		l.eat();

	}

}
