//Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;
class Calc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values = ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("The addition of "+ a+" and "+b+" is "+(a+b));
		System.out.println("The subtraction of "+ a+" and "+b+" is "+(a-b));
		System.out.println("The multiplication of "+ a+" and "+b+" is "+(a*b));
		System.out.println("The division of "+ a+" and "+b+" is "+(a/b));

	}
}