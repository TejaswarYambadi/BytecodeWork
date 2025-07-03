//Greatest of four numbers using nested ternary operator

import java.util.Scanner;
class Ternary{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Four numbers one by one = ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int m=(((a>b)?a:b)>((c>d)?c:d))?((a>b)?a:b):((c>d)?c:d);
System.out.println("Largest number = "+m);
}
}