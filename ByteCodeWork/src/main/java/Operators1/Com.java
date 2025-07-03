//Write a Java program to compare two characters and print the results? 

import java.util.Scanner;
class Com{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
        System.out.println("ch1 == ch2 : " + (ch1 == ch2));
        System.out.println("ch1 != ch2 : " + (ch1 != ch2));
        System.out.println("ch1 > ch2  : " + (ch1 > ch2));
        System.out.println("ch1 < ch2  : " + (ch1 < ch2));
        System.out.println("ch1 >= ch2 : " + (ch1 >= ch2));
        System.out.println("ch1 <= ch2 : " + (ch1 <= ch2));
    }
}
