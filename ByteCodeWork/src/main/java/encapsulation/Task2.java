package encapsulation;
class Rectangle{
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		double area= length*width;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*(length+width);
		return perimeter;
	}
}
public class Task2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(10);
		System.out.println(r.getPerimeter());
		System.out.println(r.getArea());
	}
}
