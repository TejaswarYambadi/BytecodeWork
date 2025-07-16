//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle?

import java.util.Scanner;
class Eist
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
		if((a+b+c)==180)
		{ 
			if(a==b && b==c)System.out.println("Equilateral Triangle");
			else if (a==b||b==c||c==a)System.out.println("Isosceles Triangle");
			else System.out.println("Scalene Triangle");
		}
		else System.out.println("Angles doesnot form Triangle");
	}
}