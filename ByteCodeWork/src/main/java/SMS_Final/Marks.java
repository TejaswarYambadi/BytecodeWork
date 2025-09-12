package SMS_Final;
import java.io.*;
import java.util.*;

public class Marks {
    private static String marksFile = "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\SMS_Final\\Marks.txt";

    public static void enterMarks(Scanner sc) {
        try (FileWriter fw = new FileWriter(marksFile, true)) {
            System.out.print("Enter Student ID: ");
            String id = sc.next();
            System.out.print("Enter Student Name: ");
            String name = sc.next();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            String grade;
            if (marks >= 90) grade = "A";
            else if (marks >= 80) grade = "B";
            else if (marks >= 70) grade = "C";
            else if (marks >= 60) grade = "D";
            else grade = "F";
            fw.write(id + "," + name + "," + marks + "," + grade + "\n");
            System.out.println("Marks and grade saved.\n");
        } catch (IOException e) {
            System.out.println("Error writing marks.");
        }
    }
    public static void updateMarks(Scanner sc) {
    System.out.print("Enter Student ID to update marks: ");
    String id = sc.next();
    List<String> lines = new ArrayList<>();
    boolean found = false;
    try (BufferedReader br = new BufferedReader(new FileReader(marksFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 4 && parts[0].equals(id)) {
                found = true;
                System.out.print("Enter new marks: ");
                int marks = sc.nextInt();
                String grade;
                if (marks >= 90) grade = "A";
                else if (marks >= 80) grade = "B";
                else if (marks >= 70) grade = "C";
                else if (marks >= 60) grade = "D";
                else grade = "F";
                lines.add(id + "," + parts[1] + "," + marks + "," + grade);
            } else {
                lines.add(line);
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading marks.");
        return;
    }
    if (!found) {
        System.out.println("No marks found for student.");
        return;
    }
    try (FileWriter writer = new FileWriter(marksFile, false)) {
        for (String l : lines) writer.write(l + "\n");
        System.out.println("Marks updated successfully.");
    } catch (IOException e) {
        System.out.println("Error writing marks.");
    }
}


    public static void viewMarks(String studentId) {
        try (BufferedReader br = new BufferedReader(new FileReader(marksFile))) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4 && parts[0].equals(studentId)) {
                    System.out.println("Marks: " + parts[2] + ", Grade: " + parts[3]);
                    found = true;
                }
            }
            if (!found) System.out.println("No marks found.");
        } catch (IOException e) {
            System.out.println("Error reading marks.");
        }
    }
}
