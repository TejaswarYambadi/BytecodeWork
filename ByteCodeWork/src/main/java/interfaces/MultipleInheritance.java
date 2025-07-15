package interfaces;
interface A{
	void show();
}
interface B{
	void display();
}
class C implements A,B{
	public void show() {
		System.out.println("Showing");
	};
	public void display() {
		System.out.println("Displaying");
	};
}
public class MultipleInheritance {
	public static void main(String[] args) {
		C c1= new C();
		c1.show();
		c1.display();
		}
}
