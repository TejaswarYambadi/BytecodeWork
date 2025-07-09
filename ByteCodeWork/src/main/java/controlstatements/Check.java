//Write a program to check whether a number is negative, positive or zero?

import java.util.Scanner;
class Check
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a = sc.nextInt();
		if (a>0) System.out.println("Positive number");
		else if (a<0) System.out.println("Negative number");
		else System.out.println("Zero");

	}
}