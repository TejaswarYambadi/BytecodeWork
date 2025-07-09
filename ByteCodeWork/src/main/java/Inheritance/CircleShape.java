package Inheritance;


class shapes{
	void draw() {
		System.out.println("Draw a shape");
	}
}
class circle extends shapes{
	void draws() {
		System.out.println("Draw a circle");
	}
}
public class CircleShape{
	public  static void main(String[] args) {
		circle c = new circle();
		c.draws();
		
	}
}