package project;
import java.util.*;

public class DepartmentalPerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Departments = ");
        int d = sc.nextInt();

        System.out.print("Enter no of students per each department = ");
        int sped = sc.nextInt();

        System.out.print("Enter number of subjects = ");
        int nos = sc.nextInt();
        sc.nextLine();

        for (int de = 0; de < d; de++) {
            System.out.println("Department " + (de + 1) + " ");
            Object[][] dm = new Object[sped][nos + 1];
            for (int i = 0; i < sped; i++) {
                System.out.print("Enter student " + (i + 1) + " name = ");
                dm[i][0] = sc.nextLine();
                System.out.println("Enter marks: ");
                for (int j = 0; j < nos; j++) {
                    dm[i][j + 1] = sc.nextFloat();
                }
                sc.nextLine();
            }
        }
        sc.close();
    }
}

