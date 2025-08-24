package hello;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Addition
        int sum = a + b;
        System.out.println("Addition = " + sum);

        
        int product = a * b;
        System.out.println("Multiplication = " + product);

        sc.close();
    }
}
