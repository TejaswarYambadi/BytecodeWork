package inheritance;
class Vehicle_Type{
	String type = "Petrol";
	void displayCarType() {
        System.out.println("Vehicle Type: " + type);
    }
}
class Car extends Vehicle_Type{
	 String type = "Sports Car";
	 void displayCarType() {
	        System.out.println("Car Type: " + super.type);
	    }
}
public class Vehicle {

	public static void main(String[] args) {
		Car c = new Car();
		c.displayCarType();
		//displayType();

	}

}
