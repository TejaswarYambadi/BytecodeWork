package inheritance;
class MathUtility {
	static float side;
	MathUtility(float side){
		this.side=side;
	}
	static float square() {
		float area = side*side;
		return area;
	}
}
class Calculator extends MathUtility{
	Calculator(float side){
		super(side);
	}
	static float cube() {
		float volume = side*side*side;
		return volume;
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(5);
		System.out.println(Calculator.cube());
		System.out.println(Calculator.square());
	}

}
