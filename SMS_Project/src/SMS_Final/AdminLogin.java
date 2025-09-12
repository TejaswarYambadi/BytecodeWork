package SMS_Final;

import java.util.*;

public class AdminLogin {
    public static Admin login(Scanner sc) {
        System.out.println("========= ENTER ADMIN DETAILS ========");
        System.out.println();
        System.out.print("Username: ");
        String aun = sc.nextLine().trim();
        System.out.print("Password: ");
        String apswd = sc.nextLine().trim();
        System.out.println();
        if (aun.isEmpty() || apswd.isEmpty()) {
            System.out.println("Error: Username/Password required");
            System.out.println();
            return null;
        }
        // For demo: hardcoded admin credentials. Replace with DB lookup if desired.
        if (aun.equals("admin") && apswd.equals("admin123")) {
            System.out.println("=== LOGGED IN SUCCESSFULLY ===");
            System.out.println();
            return new Admin("admin", "Admin", "admin@system.com", "admin123");
        } else {
            System.out.println("Error: Invalid credentials");
            System.out.println();
            return null;
        }
    }
}
