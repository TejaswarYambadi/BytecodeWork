package SMS_Final;

import java.sql.*;
import java.util.*;

public class Tasks {

    // Assign a new task (Admin)
    public static void assignTask(Scanner sc) {
        System.out.print("Enter Task Name: ");
        sc.nextLine();
        String taskName = sc.nextLine();
        String sql = "INSERT INTO TASKS (TASK_NAME) VALUES (?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, taskName);
            pstmt.executeUpdate();
            System.out.println("Task added successfully.\n");
        } catch (SQLException e) {
            if (e.getMessage().toLowerCase().contains("unique")) {
                System.out.println("Task already exists.");
            } else {
                System.out.println("Error adding task: " + e.getMessage());
            }
        }
    }

    // Delete task
    public static void deleteTask(Scanner sc) {
        System.out.print("Enter Task Name to delete: ");
        sc.nextLine();
        String taskName = sc.nextLine();

        String sql = "DELETE FROM TASKS WHERE TASK_NAME = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, taskName);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Task deleted successfully.");
            } else {
                System.out.println("Error: Task not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting task: " + e.getMessage());
        }
    }

    // Student updates task status
    public static void updateTaskStatus(Scanner sc, String studentId, String studentName) {
        List<Integer> taskIds = new ArrayList<>();
        List<String> taskNames = new ArrayList<>();

        // Fetch all tasks from DB
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("SELECT TASK_ID, TASK_NAME FROM TASKS ORDER BY TASK_ID")) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                taskIds.add(rs.getInt("TASK_ID"));
                taskNames.add(rs.getString("TASK_NAME"));
            }
        } catch (SQLException e) {
            System.out.println("Error reading tasks: " + e.getMessage());
            return;
        }

        if (taskNames.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        // Show tasks to student
        System.out.println("Available Tasks:");
        for (int i = 0; i < taskNames.size(); i++) {
            System.out.println((i + 1) + ". " + taskNames.get(i));
        }
        System.out.print("Select task number: ");
        int choice = sc.nextInt();
        if (choice < 1 || choice > taskNames.size()) {
            System.out.println("Error: Task not found");
            return;
        }
        int taskId = taskIds.get(choice - 1);
        String taskName = taskNames.get(choice - 1);

        // Ask for status
        System.out.print("Enter Status (completed/pending): ");
        String status = sc.next();

        // Insert or update student-task status
        String checkSql = "SELECT * FROM STUDENT_TASKS WHERE STUDENT_ID=? AND TASK_ID=?";
        String insertSql = "INSERT INTO STUDENT_TASKS (STUDENT_ID, STUDENT_NAME, TASK_ID, STATUS) VALUES (?,?,?,?)";
        String updateSql = "UPDATE STUDENT_TASKS SET STATUS=? WHERE STUDENT_ID=? AND TASK_ID=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            checkStmt.setString(1, studentId);
            checkStmt.setInt(2, taskId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // update existing status
                try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                    updateStmt.setString(1, status);
                    updateStmt.setString(2, studentId);
                    updateStmt.setInt(3, taskId);
                    updateStmt.executeUpdate();
                    System.out.println("Task status updated successfully for: " + taskName);
                }
            } else {
                // insert new status
                try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                    insertStmt.setString(1, studentId);
                    insertStmt.setString(2, studentName);
                    insertStmt.setInt(3, taskId);
                    insertStmt.setString(4, status);
                    insertStmt.executeUpdate();
                    System.out.println("Task status saved successfully for: " + taskName);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error saving task status: " + e.getMessage());
        }
    }

    // View all tasks assigned to a student
    public static void viewStudentTasks(String studentId) {
        String sql = "SELECT T.TASK_NAME, S.STATUS FROM STUDENT_TASKS S JOIN TASKS T ON S.TASK_ID=T.TASK_ID WHERE S.STUDENT_ID=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            boolean found = false;
            System.out.println("Your Tasks:");
            while (rs.next()) {
                found = true;
                System.out.println("Task: " + rs.getString("TASK_NAME") + " | Status: " + rs.getString("STATUS"));
            }
            if (!found) System.out.println("No tasks found for this student.");
        } catch (SQLException e) {
            System.out.println("Error viewing tasks: " + e.getMessage());
        }
    }
}
