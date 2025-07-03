//Write a program to check whether a number is even or odd?
import java.util.Scanner;
class Evenodd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a = sc.nextInt();
		if (a%2==0) System.out.println("Even number");
		else  System.out.println("Negative number");
	

	}
}