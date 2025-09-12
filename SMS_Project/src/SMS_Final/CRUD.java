package SMS_Final;

import java.sql.*;
import java.util.*;

public class CRUD {

    // Add Student
    public static void addStudent(Scanner sc) {
        System.out.print("Student ID: ");
        String sid = sc.next();
        System.out.print("Student Name: ");
        sc.nextLine(); // consume rest
        String sname = sc.nextLine();
        System.out.print("Student EMAIL: ");
        String smail = sc.next();
        System.out.print("Student Password: ");
        String spwd = sc.next();
        System.out.print("Student Phone (optional): ");
        String phone = sc.next();

        String sql = "INSERT INTO STUDENTS (STUDENT_ID, NAME, EMAIL, PASSWORD, PHONE) VALUES (?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, sid);
            pstmt.setString(2, sname);
            pstmt.setString(3, smail);
            pstmt.setString(4, spwd);
            pstmt.setString(5, phone);
            pstmt.executeUpdate();
            System.out.println("Student added successfully to DB.\n");
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    // Search Student
    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Student ID to search: ");
        String searchId = sc.next();

        String sql = "SELECT STUDENT_ID, NAME, EMAIL, PHONE FROM STUDENTS WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, searchId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Student ID: " + rs.getString("STUDENT_ID"));
                System.out.println("Student Name: " + rs.getString("NAME"));
                System.out.println("Student Email: " + rs.getString("EMAIL"));
                System.out.println("Student Phone: " + rs.getString("PHONE"));
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error fetching student: " + e.getMessage());
        }
    }

    // Update Student (name/email/password)
    public static void updateStudent(Scanner sc) {
        System.out.print("Enter Student ID to update: ");
        String searchId = sc.next();

        System.out.println("What do you want to update?");
        System.out.println("1. Name\n2. Email\n3. Password\n4. Phone");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        String column = "";
        switch (choice) {
            case 1:
                column = "NAME";
                System.out.print("Enter new name: ");
                break;
            case 2:
                column = "EMAIL";
                System.out.print("Enter new email: ");
                break;
            case 3:
                column = "PASSWORD";
                System.out.print("Enter new password: ");
                break;
            case 4:
                column = "PHONE";
                System.out.print("Enter new phone: ");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        String newValue = sc.nextLine();

        String sql = "UPDATE STUDENTS SET " + column + " = ? WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newValue);
            pstmt.setString(2, searchId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    // Delete Student
    public static void deleteStudent(Scanner sc) {
        System.out.print("Enter Student ID to delete: ");
        String searchId = sc.next();

        String sql = "DELETE FROM STUDENTS WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, searchId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}
