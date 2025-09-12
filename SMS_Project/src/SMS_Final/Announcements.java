package SMS_Final;

import java.sql.*;
import java.util.*;

public class Announcements {

    // Post a new announcement
    public static void postAnnouncement(Scanner sc) {
        System.out.print("Enter announcement: ");
        sc.nextLine(); // ensure we are at line-start
        String announcement = sc.nextLine();

        String sql = "INSERT INTO ANNOUNCEMENTS (ANNOUNCEMENT) VALUES (?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, announcement);
            pstmt.executeUpdate();
            System.out.println("Announcement posted to DB.\n");
        } catch (SQLException e) {
            System.out.println("Error inserting announcement: " + e.getMessage());
        }
    }

    // Edit announcement
    public static void editAnnouncement(Scanner sc) {
        System.out.print("Enter announcement ID to edit: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new announcement: ");
        String newAnn = sc.nextLine();

        String sql = "UPDATE ANNOUNCEMENTS SET ANNOUNCEMENT = ? WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newAnn);
            pstmt.setInt(2, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Announcement updated successfully.");
            } else {
                System.out.println("Announcement ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating announcement: " + e.getMessage());
        }
    }

    // View announcements
    public static void viewAnnouncements() {
        String sql = "SELECT * FROM ANNOUNCEMENTS ORDER BY ID";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Announcements:");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String ann = rs.getString("ANNOUNCEMENT");
                System.out.println(id + ": " + ann);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching announcements: " + e.getMessage());
        }
    }

    // Delete announcement as admin
    public static void deleteAnnouncementAsAdmin(Scanner sc) {
        System.out.print("Enter announcement ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        String sql = "DELETE FROM ANNOUNCEMENTS WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Announcement deleted successfully.");
            } else {
                System.out.println("Announcement ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting announcement: " + e.getMessage());
        }
    }

    // Students cannot delete announcements
    public static void deleteAnnouncementAsStudent() {
        System.out.println("Error: Access denied");
    }
}
