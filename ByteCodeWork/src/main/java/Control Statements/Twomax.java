//Write a program to find maximum between two numbers?

import java.util.Scanner;
class Twomax
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First value = ");
		int a = sc.nextInt();
		System.out.print("Enter Second value = ");
		int b = sc.nextInt();
		if(a<b)System.out.println(b+" is greater than "+a);
		else System.out.println(a+" is greater than "+b);
	}
}