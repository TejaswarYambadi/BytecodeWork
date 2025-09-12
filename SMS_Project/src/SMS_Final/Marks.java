package SMS_Final;

import java.sql.*;
import java.util.*;

public class Marks {

    // Calculate grade based on marks
    private static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    // Enter marks
    public static void enterMarks(Scanner sc) {
        System.out.print("Enter Student ID: ");
        String id = sc.next();
        System.out.print("Enter Subject Name: ");
        sc.nextLine();
        String subject = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String grade = calculateGrade(marks);

        String sql = "INSERT INTO MARKS (STUDENT_ID, SUBJECT_NAME, MARKS, GRADE) VALUES (?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.setString(2, subject);
            pstmt.setInt(3, marks);
            pstmt.setString(4, grade);
            pstmt.executeUpdate();
            System.out.println("Marks and grade saved to DB.\n");
        } catch (SQLException e) {
            System.out.println("Error inserting marks: " + e.getMessage());
        }
    }

    // Update marks
    public static void updateMarks(Scanner sc) {
        System.out.print("Enter Student ID to update marks: ");
        String id = sc.next();
        System.out.print("Enter Subject Name to update: ");
        sc.nextLine();
        String subject = sc.nextLine();

        System.out.print("Enter new marks: ");
        int marks = sc.nextInt();
        String grade = calculateGrade(marks);

        String sql = "UPDATE MARKS SET MARKS = ?, GRADE = ? WHERE STUDENT_ID = ? AND SUBJECT_NAME = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, marks);
            pstmt.setString(2, grade);
            pstmt.setString(3, id);
            pstmt.setString(4, subject);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Marks updated successfully.");
            } else {
                System.out.println("No marks found for that student and subject.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating marks: " + e.getMessage());
        }
    }

    // View marks for a student
    public static void viewMarks(String studentId) {
        String sql = "SELECT SUBJECT_NAME, MARKS, GRADE FROM MARKS WHERE STUDENT_ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                System.out.println("Subject: " + rs.getString("SUBJECT_NAME") +
                                   " | Marks: " + rs.getInt("MARKS") +
                                   " | Grade: " + rs.getString("GRADE"));
                found = true;
            }
            if (!found) {
                System.out.println("No marks found.");
            }
        } catch (SQLException e) {
            System.out.println("Error reading marks: " + e.getMessage());
        }
    }
}
