package encapsulation;
class LightBulb {
	private boolean isOn;
	
	public LightBulb() {
        isOn = false;
    }
	public void setTurnOn() {
		isOn=true;
	}
	public void setTurnOff() {
		isOn=false;
	}
	public boolean isOn() {
		return isOn;
	}
}
public class Task4 {

	public static void main(String[] args) {
		LightBulb b = new LightBulb();
		System.out.println(b.isOn());
		b.setTurnOn();
		System.out.println(b.isOn());
		b.setTurnOff();
		System.out.println(b.isOn());
	}

}
