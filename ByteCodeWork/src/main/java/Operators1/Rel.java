// Write a Java program to compare two integers using relational operators and Write the results? 

import java.util.Scanner;
class Rel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a == b : " + (a == b));
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a != b : " + (a != b));
	}
}