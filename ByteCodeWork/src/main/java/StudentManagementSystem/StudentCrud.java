package StudentManagementSystem;
import java.io.*;
import java.util.Scanner;

public class StudentCrud {

    // File path for storing students
    private static final String FILE_PATH =
        "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\StudentManagementSystem\\studentnames.txt";

    // =============================
    // Method to add a new student
    // =============================
    public static void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Roll Number = ");
        String student_roll_no = sc.nextLine();

        System.out.print("Enter Student Username = ");
        String name = sc.nextLine();

        System.out.print("Enter Student Password = ");
        String password = sc.nextLine();

        boolean exists = false;

        // Check if roll number already exists in the file
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    String existingRoll = parts[0].trim();
                    if (existingRoll.equals(student_roll_no)) {
                        exists = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            // File may not exist initially → that’s fine
        }

        if (exists) {
            System.out.println("Student with Roll No " + student_roll_no + " is already created.");
        } else {
            // Append new student to file
            try (FileWriter w = new FileWriter(FILE_PATH, true)) {
                w.write(student_roll_no + "," + name + "," + password + "\n");
                System.out.println("Student with Roll No " + student_roll_no + " created successfully.");
            } catch (IOException e) {
                System.out.println("Error saving student: " + e.getMessage());
            }
        }
    }

    // =============================
    // Method to delete a student
    // =============================
    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No of student to delete = ");
        String rollNoToDelete = sc.nextLine();

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("File not found. No students exist yet.");
            return;
        }

        StringBuilder newContent = new StringBuilder();
        boolean found = false;

        // Read file content into memory
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].trim().equals(rollNoToDelete)) {
                    found = true; // skip this line → student deleted
                    continue;
                }
                newContent.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (found) {
            try (FileWriter fw = new FileWriter(file, false)) { // overwrite mode
                fw.write(newContent.toString());
                System.out.println("Student with Roll No " + rollNoToDelete + " deleted successfully.");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } else {
            System.out.println("Student with Roll No " + rollNoToDelete + " not found.");
        }
    }

    // =============================
    // Method to update a student
    // =============================
    public static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No of student to update = ");
        String rollNoToUpdate = sc.nextLine();

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("File not found. No students exist yet.");
            return;
        }

        StringBuilder newContent = new StringBuilder();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].trim().equals(rollNoToUpdate)) {
                    found = true;

                    // Ask for new details
                    System.out.print("Enter new Student Username = ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Student Password = ");
                    String newPassword = sc.nextLine();

                    // Replace with updated details
                    newContent.append(rollNoToUpdate).append(",").append(newName).append(",").append(newPassword).append(System.lineSeparator());
                } else {
                    newContent.append(line).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (found) {
            try (FileWriter fw = new FileWriter(file, false)) { // overwrite mode
                fw.write(newContent.toString());
                System.out.println("Student with Roll No " + rollNoToUpdate + " updated successfully.");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } else {
            System.out.println("Student with Roll No " + rollNoToUpdate + " not found.");
        }
    }

    // =============================
    // Method to search a student
    // =============================
    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No of student to search = ");
        String rollNoToSearch = sc.nextLine();

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("File not found. No students exist yet.");
            return;
        }

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].trim().equals(rollNoToSearch)) {
                    found = true;
                    System.out.println("Roll No: " + parts[0]);
                    System.out.println("Username: " + parts[1]);
                    System.out.println("Password: " + parts[2]);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (!found) {
            System.out.println("Student with Roll No " + rollNoToSearch + " not found.");
        }
    }
}
