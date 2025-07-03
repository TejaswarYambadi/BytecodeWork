//Write a program to calculate profit or loss?

import java.util.Scanner;
class Prolos
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Cost Price = ");
		double a = sc.nextDouble();
		System.out.print("Enter a Selling Price = ");
		double b = sc.nextDouble();
		if (b>a)System.out.println("Profit");
		else if (a>b) System.out.println("Loss");
		else System.out.println("No Profit No Loss");
				
	}
}