package Arrays;
import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float[] a = new float[5];

        System.out.println("Enter 5 product costs:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextFloat();  
        }
        for (int j = 0; j < a.length; j++) {
            sum += a[j];
        }

        System.out.println("Total Cost = " + sum);
        System.out.println("Average Cost = " + (sum / a.length));
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Lowest Cost = " + a[0]);
        System.out.println("Highest Cost = " + a[a.length - 1]);
    }
}
