package StudentManagementSystem;
import java.util.Scanner;

public class Admin {
    
    // Default Username and password for ADMIN
    private static final String admin_name = "admin";
    private static final String admin_password = "1234";

    // Static method for login
    public static boolean login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter admin name: ");
        String input_admin_name = sc.nextLine();

        System.out.print("Enter admin password: ");
        String input_admin_password = sc.nextLine();

        if (admin_name.equals(input_admin_name) && admin_password.equals(input_admin_password)) {
            System.out.println(" Login Successful! Welcome Admin.");
            return true;
        }
        else if(input_admin_name.isEmpty() || input_admin_password.isEmpty()){
        	System.out.println("Username/Password required");
        	return false;
        }
        else {
            System.out.println(" Invalid Credentials. Try again.");
            return false;
        }
    }
}
