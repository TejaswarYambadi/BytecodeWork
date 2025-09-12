package SMS_Final;

import java.sql.*;

public class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    // Add student using consistent column names used across the app
    public void addStudent(int id, String name, String email, String password, String phone) {
        String sql = "INSERT INTO STUDENTS (STUDENT_ID, NAME, EMAIL, PASSWORD, PHONE) VALUES (?,?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, String.valueOf(id));
            pst.setString(2, name);
            pst.setString(3, email);
            pst.setString(4, password);
            pst.setString(5, phone);
            pst.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (SQLException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    @Override
    public void displayMenu() {
        System.out.println("1. ADD STUDENT");
        System.out.println("2. SEARCH STUDENT");
        System.out.println("3. UPDATE STUDENT");
        System.out.println("4. DELETE STUDENT");
        System.out.println("5. ASSIGN TASKS");
        System.out.println("6. ENTER MARKS");
        System.out.println("7. UPDATE MARKS");
        System.out.println("8. POST ANNOUNCEMENTS");
        System.out.println("9. EDIT ANNOUNCEMENTS");
        System.out.println("10. DELETE TASKS");
        System.out.println("11. LOGOUT");
    }
}
