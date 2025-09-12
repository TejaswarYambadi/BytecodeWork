package StudentManagementSystem;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Student {

    private static final String STUDENT_FILE =
        "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\StudentManagementSystem\\studentnames.txt";

    private static final String ATTENDANCE_FILE =
        "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\StudentManagementSystem\\attendance.txt";

    // return true if attendance marked, false if login failed
    public static boolean markAttendance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number (User ID) = ");
        String rollNo = sc.nextLine();

        System.out.print("Enter Password = ");
        String password = sc.nextLine();

        boolean authenticated = false;
        String studentName = "";

        // check student database
        try (BufferedReader br = new BufferedReader(new FileReader(STUDENT_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String existingRoll = parts[0].trim();
                    String existingName = parts[1].trim();
                    String existingPass = parts[2].trim();

                    if (existingRoll.equals(rollNo) && existingPass.equals(password)) {
                        authenticated = true;
                        studentName = existingName;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading student database: " + e.getMessage());
            return false;
        }

        if (authenticated) {
            String today = LocalDate.now().toString();

            // Check if attendance already marked for today
            try (BufferedReader br = new BufferedReader(new FileReader(ATTENDANCE_FILE))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String existingRoll = parts[0].trim();
                        String date = parts[2].trim();

                        if (existingRoll.equals(rollNo) && date.equals(today)) {
                            System.out.println("Attendance already marked for " + studentName + " on " + today);
                            return false; // already marked
                        }
                    }
                }
            } catch (IOException e) {
                // File may not exist yet → ignore
            }

            // Append new attendance record
            String record = rollNo + "," + studentName + "," + today + ",Present";
            try (FileWriter fw = new FileWriter(ATTENDANCE_FILE, true)) {
                fw.write(record + System.lineSeparator());
                System.out.println("Attendance marked for " + studentName + " on " + today);
                return true;
            } catch (IOException e) {
                System.out.println("Error saving attendance: " + e.getMessage());
                return false;
            }

        } else {
            System.out.println("Invalid Roll No or Password. Attendance not marked.");
            return false;
        }
    }
}
