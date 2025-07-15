package interfaces;

interface Payment{
	void processPayment(double amount);
}
class PayPal implements Payment{
	public void processPayment(double amount) {
		System.out.println("Processing of amount "+ amount+" through Paypal");
	};
}
class Stripe implements Payment{
	public void processPayment(double amount) {
		System.out.println("Processing of amount "+ amount+" through Stripe");
	};
}

public class PaymentDemo {
	public static void main(String[] args){
		PayPal p1 = new PayPal();
		Stripe s1 = new Stripe();
		p1.processPayment(100);
		p1.processPayment(20);
		s1.processPayment(50);
	}
}
