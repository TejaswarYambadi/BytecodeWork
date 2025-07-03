//Write a program to check whether a character is uppercase or lowercase alphabet?
import java.util.Scanner;
class Ulcase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an alphabet = ");
		char ch=sc.next().charAt(0);
		if (Character.isLowerCase(ch))System.out.println("Lower case");
		else if (Character.isUpperCase(ch))System.out.println("Upper case");
		else System.out.println("Please enter an alphabet");
	}
}