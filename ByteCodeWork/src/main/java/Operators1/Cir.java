// Write a Java program to calculate the area of a circle given its radius? 

import java.util.Scanner;
class Cir
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.println("The area of circle with radius "+ a+" is "+(3.14*a*a));
	}
}