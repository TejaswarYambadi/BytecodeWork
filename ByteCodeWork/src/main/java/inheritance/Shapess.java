package inheritance;
class Sha{
	int radius;
	Sha(int radius){
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Drawing Method with radius "+ radius);
	}
}
class Circle extends Sha{
	Circle(int radius){
		super(radius);
	}
	public void drawCircle() {
		System.out.println("Drawing a Circle With radius "+radius);
	}
}
public class Shapess {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.drawCircle();
		c.draw();
		
	}

}
