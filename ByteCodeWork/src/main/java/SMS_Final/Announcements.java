package SMS_Final;
import java.io.*;
import java.util.*;

public class Announcements {
    private static String annFile = "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\SMS_Final\\Announcements.txt";

    public static void postAnnouncement(Scanner sc) {
        try (FileWriter fw = new FileWriter(annFile, true)) {
            System.out.print("Enter announcement: ");
            sc.nextLine(); // consume leftover newline
            String announcement = sc.nextLine();
            fw.write(announcement + "\n");
            System.out.println("Announcement posted.\n");
        } catch (IOException e) {
            System.out.println("Error writing announcement.");
        }
    }
    public static void editAnnouncement(Scanner sc) {
    List<String> lines = new ArrayList<>();
    System.out.print("Enter announcement line number to edit: ");
    int lineNum = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter new announcement: ");
    String newAnn = sc.nextLine();
    boolean found = false;
    try (BufferedReader br = new BufferedReader(new FileReader(annFile))) {
        String line;
        int count = 1;
        while ((line = br.readLine()) != null) {
            if (count == lineNum) {
                lines.add(newAnn);
                found = true;
            } else {
                lines.add(line);
            }
            count++;
        }
    } catch (IOException e) {
        System.out.println("Error reading announcements.");
        return;
    }
    if (!found) {
        System.out.println("Announcement not found.");
        return;
    }
    try (FileWriter writer = new FileWriter(annFile, false)) {
        for (String l : lines) writer.write(l + "\n");
        System.out.println("Announcement updated successfully.");
    } catch (IOException e) {
        System.out.println("Error writing announcements.");
    }
}
public static void deleteAnnouncementAsStudent() {
    System.out.println("Error: Access denied");
}


    public static void viewAnnouncements() {
        try (BufferedReader br = new BufferedReader(new FileReader(annFile))) {
            String line;
            System.out.println("Announcements:");
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading announcements.");
        }
    }
}

