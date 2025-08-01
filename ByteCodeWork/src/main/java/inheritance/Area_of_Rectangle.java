//1.Program to calculate area of rectangle using single inheritance in java.
package inheritance;
class Get_Details{
	float length;
	float width;
	Get_Details(float length,float width){
		this.length=length;
		this.width=width;
	}
	
}
class Get_Area extends Get_Details{

	Get_Area(float length, float width) {
		super(length,width );
		System.out.println("Area of rectangle = "+(length*width));
		
	}
	
}
public class Area_of_Rectangle {

	public static void main(String[] args) {
		new Get_Area(5,10);
	}

}
