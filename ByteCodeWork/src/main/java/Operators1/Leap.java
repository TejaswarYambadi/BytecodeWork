// Write a Java program to check if a given year is a leap year using the ternary operator? 

import java.util.Scanner;
class Leap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leap year");
		int a =sc.nextInt();
		String s=(a%4==0)?((a%100!=0||a%400==0)?"Leap Year":"Not a Leap Year"):"Not a Leap Year";
		System.out.print(a+" is "+s);
	}
}