package thread_Synchronization;
class BankAccount{
	int balance=1000;
	public  synchronized void withdraw(int amount) {
		if(amount <= balance) {
			System.out.println("Withdraw Inititated");
			System.out.println("Withdraw Done Sucessfully");
			balance-=amount;
		}
		else {
			System.out.println("Insufficient Funds");
			System.out.println("Your current balance = "+balance);
		}
	}
}
class User extends Thread{
	BankAccount acc;
	User(BankAccount acc){
		this.acc=acc;
	}
	public void run() {
		acc.withdraw(700);
	}
}
public class ATM_Withdraw{
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		User t1 = new User(acc);
		User t2 = new User(acc);
		try {
		t1.start();
		t1.sleep(10000);
		t2.start();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}