// Write a Java function to swap two variables without using a third variable?

import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for A = ");
		int a=sc.nextInt();
		System.out.print("Enter the value for B = ");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of A = "+a);
		System.out.println("The value of B = "+b);
	}
}