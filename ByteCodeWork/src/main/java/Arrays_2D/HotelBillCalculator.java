import java.util.Scanner;

public class HotelBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] bills = new int[3][3]; // 3 customers × 3 items

        // Input bill amounts
        System.out.println("Enter bill amounts for 3 customers :");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 3 item bills for Customer " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                bills[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += bills[i][j];
            }
            System.out.println("Customer " + (i + 1) + " Bill: ₹ " + total);
        }
    }
}
