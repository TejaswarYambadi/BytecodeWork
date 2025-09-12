package SMS_Final;

import java.sql.*;
import java.util.*;

public class StudentLogin {

    // Login method
    public static Student login(Scanner sc) {
        System.out.println("========= ENTER STUDENT DETAILS ========");
        System.out.print("Student ID: ");
        String inputId = sc.next();
        System.out.print("Password: ");
        String inputPswd = sc.next();

        String sql = "SELECT * FROM STUDENTS WHERE STUDENT_ID = ? AND PASSWORD = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, inputId);
            pstmt.setString(2, inputPswd);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String name = rs.getString("NAME");
                String email = rs.getString("EMAIL");
                String pswd = rs.getString("PASSWORD");
                System.out.println("=== LOGGED IN SUCCESSFULLY ===");
                markAttendance(inputId, name);
                return new Student(inputId, name, email, pswd);
            } else {
                System.out.println("INCORRECT DETAILS.....TRY AGAIN");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error logging in: " + e.getMessage());
            return null;
        }
    }

    // Change password directly
    public static void changePassword(Scanner sc, String studentId) {
        System.out.print("Enter new password: ");
        String newPwd = sc.next();

        String sql = "UPDATE STUDENTS SET PASSWORD = ? WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newPwd);
            pstmt.setString(2, studentId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Password changed successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error changing password: " + e.getMessage());
        }
    }

    // Change password with validation
    public static void changePasswordWithValidation(Scanner sc, String studentId) {
        System.out.print("Enter old password: ");
        String oldPwd = sc.next();

        String checkSql = "SELECT PASSWORD FROM STUDENTS WHERE STUDENT_ID = ?";
        String updateSql = "UPDATE STUDENTS SET PASSWORD = ? WHERE STUDENT_ID = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            checkStmt.setString(1, studentId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                String currentPwd = rs.getString("PASSWORD");
                if (!currentPwd.equals(oldPwd)) {
                    System.out.println("Error: Incorrect old password");
                    return;
                }
                System.out.print("Enter new password: ");
                String newPwd = sc.next();
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                    updateStmt.setString(1, newPwd);
                    updateStmt.setString(2, studentId);
                    updateStmt.executeUpdate();
                    System.out.println("Password changed successfully.");
                }
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error changing password: " + e.getMessage());
        }
    }

    // Update email
    public static void updateEmail(Scanner sc, String studentId) {
        System.out.print("Enter new email: ");
        String newEmail = sc.next();
        String sql = "UPDATE STUDENTS SET EMAIL = ? WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setString(2, studentId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Email updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating email: " + e.getMessage());
        }
    }

    // Update phone number
    public static void updatePhone(Scanner sc, String studentId) {
        System.out.print("Enter new phone number: ");
        String newPhone = sc.next();
        String sql = "UPDATE STUDENTS SET PHONE = ? WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newPhone);
            pstmt.setString(2, studentId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Phone number updated successfully.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating phone: " + e.getMessage());
        }
    }

    // View profile
    public static void viewProfile(String studentId) {
        String sql = "SELECT * FROM STUDENTS WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Profile Details:");
                System.out.println("ID: " + rs.getString("STUDENT_ID"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("Email: " + rs.getString("EMAIL"));
                System.out.println("Phone: " + rs.getString("PHONE"));
                System.out.println("Password: " + rs.getString("PASSWORD"));
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error viewing profile: " + e.getMessage());
        }
    }

    // Mark attendance
    private static void markAttendance(String studentId, String studentName) {
        String checkSql = "SELECT * FROM ATTENDANCE WHERE STUDENT_ID = ? AND TRUNC(ATTENDANCE_DATE) = TRUNC(SYSDATE)";
        String insertSql = "INSERT INTO ATTENDANCE (STUDENT_ID, NAME, ATTENDANCE_DATE, STATUS) VALUES (?,?,SYSDATE,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            checkStmt.setString(1, studentId);
            ResultSet rs = checkStmt.executeQuery();
            if (!rs.next()) { // if not already marked today
                try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                    insertStmt.setString(1, studentId);
                    insertStmt.setString(2, studentName);
                    insertStmt.setString(3, "Present");
                    insertStmt.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.out.println("Error marking attendance: " + e.getMessage());
        }
    }
}
