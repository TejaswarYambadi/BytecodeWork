package polymorphism;
class Payments{
	void display() {
		System.out.println("Payment Done");
	}
}
class UPIPayment extends Payments{
	void display() {
		System.out.println("UPI Payment Done");
	}
}
class CardPayment extends Payments{
	void display() {
		System.out.println("Card Payment  Done");
	}
}
class WalletPayment extends Payments{
	void display() {
		System.out.println("Wallet Payment Done");
	}
}
class Cash extends Payments{
	void display() {
		System.out.println("Payment Done with cash");
	}
}
public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments p1 = new UPIPayment();
		Payments p2 = new CardPayment();
		Payments p3 = new WalletPayment();
		Payments p4 = new Cash();
		p1.display(); 
		p2.display();
		p3.display(); 
		p4.display(); 
		

	}

}
