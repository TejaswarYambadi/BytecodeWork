
//Write a Java program that takes five numbers as input to calculate and print the average of the numbers

import java.util.Scanner;
class Avg
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		System.out.println((a+b+c+e+d)/5);
	}
}