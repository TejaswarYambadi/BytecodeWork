package practise;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.println("Reversed String = " + sb.toString());
		sc.close();
	}

}
