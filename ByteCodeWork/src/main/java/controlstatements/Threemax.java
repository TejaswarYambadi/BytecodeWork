// Write a program to find maximum between three numbers?

import java.util.Scanner;
class Threemax
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First value = ");
		int a = sc.nextInt();
		System.out.print("Enter Second value = ");
		int b = sc.nextInt();
		System.out.print("Enter Third value = ");
		int c = sc.nextInt();
		if (a>b && a>c)System.out.print(a+" is Greatest Number");
		else if (b>a && b>c)System.out.print(b+" is Greatest Number");
		else if (c>a && c>a)System.out.print(c+" is Greatest Number");
		else System.out.print("All are equal");
	}
}