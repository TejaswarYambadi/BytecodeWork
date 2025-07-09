//Write a program to check whether a character is alphabet or not?

import java.util.Scanner;
class Alpha
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character = ");
		char ch = sc.next().charAt(0);
		if(Character.isLetter(ch))System.out.println(ch+" is a Alphabet");
		else if (Character.isDigit(ch))System.out.println(ch+" is a Number");
		else System.out.println(ch+" is an special Character");

	}
}