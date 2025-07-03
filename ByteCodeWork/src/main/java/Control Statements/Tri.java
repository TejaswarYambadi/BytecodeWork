//Write a program to input angles of a triangle and check whether triangle is valid or not?

import java.util.Scanner;
class Tri
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First Angle = ");
		int a = sc.nextInt();
		System.out.print("Enter a Second Angle = ");
		int b = sc.nextInt();
		System.out.print("Enter a Third Angle = ");
		int c = sc.nextInt();
		if ((a+b+c)==180)System.out.print("Valid Traingle");
		else System.out.println("Invalid Triangle");
		
	}
}