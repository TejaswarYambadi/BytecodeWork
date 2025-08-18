package practise;
class Engine{
	static String engine_type;
	Engine(String type){
		engine_type = type;
	}
	public void start() {
		System.out.println("Engine Started with "+engine_type);
	}
}
public class Car {
	Engine e =null;
	Car(Engine e1){
		e=e1;
	}
	public void startjourney() {
		e.start();
	}
	public static void main(String[] args) {
		Engine obj = new Engine("Petrol Type");
		Car c = new Car(obj);
		c.startjourney();
	}

}
