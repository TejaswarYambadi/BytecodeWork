//Write a program to check whether a number is divisible by 5 and 11 or not?

import java.util.Scanner;
class Div
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int a = sc.nextInt();
		if ((a%5==0)&&(a%11==0))	System.out.print(a+" is divisible by both 5 and 11");
		else if (a%5==0) System.out.print(a+" is divisible by  5 ");
		else if (a%11==0) System.out.print(a+" is divisible by  11 ");
		else System.out.println(a+" is not divisible by both 5 and 11");
	}
}