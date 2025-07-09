// Write a program to input any alphabet and check whether it is vowel or consonant?

import java.util.Scanner;
class Vowcon
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
        	char ch = sc.next().charAt(0);
		char c= Character.toLowerCase(ch);
		if (c>='a' && c<='z')
		{
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')System.out.println(ch +" is Vowel");
			else System.out.println(ch +" is Consonant");
		}
		else System.out.println("Invalid Input... Please enter an alphabet");
	}
}