//Write a program to count total number of notes in given amount?

import java.util.Scanner;
class Notes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total amount = ");
		int a = sc.nextInt();
		if (a<0)System.out.println("Invalid");
		else if (a==0)System.out.println("No amount")
		else 
		{
			a%=500;
			a/5
		}

	}
}