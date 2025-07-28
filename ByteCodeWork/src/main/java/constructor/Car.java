package constructor;

public class Car {
	String brand;
	Car(){
		brand="Ford";
	}
	public String getBrand() {
		return brand;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c =  new Car();
		String b = c.getBrand();
		System.out.println("Brand Name = "+b);

	}

}
