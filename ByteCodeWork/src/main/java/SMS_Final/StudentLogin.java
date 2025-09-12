package SMS_Final;
import java.util.*;
import java.io.*;

public class StudentLogin {
    private static String fileName = "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\SMS_Final\\studentsdet.txt";
    private static String attendanceFile = "C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\SMS_Final\\Attendance.txt";

    public static Student login(Scanner sc) {
        System.out.println("========= ENTER STUDENT DETAILS ========");
        System.out.print("Student ID: ");
        String inputId = sc.next();
        System.out.print("Password: ");
        String inputPswd = sc.next();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                String studentId = "", name = "", pswd = "", email = "";
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals("ID") && i + 1 < parts.length) {
                        studentId = parts[i + 1].replace(":", "");
                    }
                    if (parts[i].equals("NAME") && i + 1 < parts.length) {
                        name = parts[i + 1].replace(":", "");
                    }
                    if (parts[i].equals("MAIL") && i + 2 < parts.length) {
                        email = parts[i + 2];
                    }
                    if (parts[i].equals("PSWD") && i + 1 < parts.length) {
                        pswd = parts[i + 1].replace(":", "");
                    }
                }
                if (inputId.equals(studentId) && inputPswd.equals(pswd)) {
                    System.out.println("=== LOGGED IN SUCCESSFULLY ===");
                    markAttendance(inputId, name);
                    return new Student(studentId, name, email, pswd);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return null;
        }
        System.out.println("INCORRECT DETAILS.....TRY AGAIN");
        return null;
    }
    
    public static void changePassword(Scanner sc, String studentId) {
    List<String> lines = new ArrayList<>();
    boolean found = false;
    System.out.print("Enter new password: ");
    String newPwd = sc.next();
    try (Scanner fileScanner = new Scanner(new File(fileName))) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.contains("ID :" + studentId + " ")) {
                String[] parts = line.split(" ");
                String id = "", name = "", mail = "", pwd = "";
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals("ID") && i + 1 < parts.length) id = parts[i + 1].replace(":", "");
                    if (parts[i].equals("NAME") && i + 1 < parts.length) name = parts[i + 1].replace(":", "");
                    if (parts[i].equals("MAIL") && i + 2 < parts.length) mail = parts[i + 2];
                    if (parts[i].equals("PSWD") && i + 1 < parts.length) pwd = newPwd;
                }
                String updatedLine = "ID :" + id + " NAME :" + name + " MAIL ID:" + mail + " PSWD :" + pwd;
                lines.add(updatedLine);
                found = true;
            } else {
                lines.add(line);
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file.");
        return;
    }
    if (!found) {
        System.out.println("Student not found.");
        return;
    }
    try (FileWriter writer = new FileWriter(fileName, false)) {
        for (String l : lines) {
            writer.write(l + "\n");
        }
        System.out.println("Password changed successfully.");
    } catch (IOException e) {
        System.out.println("Error writing file.");
    }
}

    private static void markAttendance(String studentId, String studentName) {
        List<String> lines = new ArrayList<>();
        boolean alreadyMarked = false;
        try {
            File file = new File(attendanceFile);
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] parts = line.split(",");
                        if (parts.length >= 3 && parts[0].equals(studentId)) {
                            alreadyMarked = true;
                        }
                        lines.add(line);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading attendance file.");
        }
        if (!alreadyMarked) {
            lines.add(studentId + "," + studentName + ",Present");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(attendanceFile))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing attendance file.");
        }
    }
   

    
    public static void changePasswordWithValidation(Scanner sc, String studentId) {
        List<String> lines = new ArrayList<>();
        boolean found = false;
        System.out.print("Enter old password: ");
        String oldPwd = sc.next();
        String newPwd = null;
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains("ID :" + studentId + " ")) {
                    String[] parts = line.split(" ");
                    String id = "", name = "", mail = "", pwd = "", phone = "";
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("ID") && i + 1 < parts.length) id = parts[i + 1].replace(":", "");
                        if (parts[i].equals("NAME") && i + 1 < parts.length) name = parts[i + 1].replace(":", "");
                        if (parts[i].equals("MAIL") && i + 2 < parts.length) mail = parts[i + 2];
                        if (parts[i].equals("PSWD") && i + 1 < parts.length) pwd = parts[i + 1].replace(":", "");
                        if (parts[i].equals("PHONE") && i + 1 < parts.length) phone = parts[i + 1].replace(":", "");
                    }
                    if (!oldPwd.equals(pwd)) {
                        System.out.println("Error: Incorrect old password");
                        lines.add(line);
                        found = true;
                        continue;
                    }
                    System.out.print("Enter new password: ");
                    newPwd = sc.next();
                    String updatedLine = "ID :" + id + " NAME :" + name + " MAIL ID:" + mail + (phone.isEmpty() ? "" : " PHONE :" + phone) + " PSWD :" + newPwd;
                    lines.add(updatedLine);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }
        if (!found) {
            System.out.println("Student not found.");
            return;
        }
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String l : lines) {
                writer.write(l + "\n");
            }
            if (newPwd != null) System.out.println("Password changed successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    
    public static void updateEmail(Scanner sc, String studentId) {
        List<String> lines = new ArrayList<>();
        boolean found = false;
        System.out.print("Enter new email: ");
        String newEmail = sc.next();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains("ID :" + studentId + " ")) {
                    String[] parts = line.split(" ");
                    String id = "", name = "", mail = "", pwd = "", phone = "";
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("ID") && i + 1 < parts.length) id = parts[i + 1].replace(":", "");
                        if (parts[i].equals("NAME") && i + 1 < parts.length) name = parts[i + 1].replace(":", "");
                        if (parts[i].equals("MAIL") && i + 2 < parts.length) mail = newEmail;
                        if (parts[i].equals("PSWD") && i + 1 < parts.length) pwd = parts[i + 1].replace(":", "");
                        if (parts[i].equals("PHONE") && i + 1 < parts.length) phone = parts[i + 1].replace(":", "");
                    }
                    String updatedLine = "ID :" + id + " NAME :" + name + " MAIL ID:" + mail + (phone.isEmpty() ? "" : " PHONE :" + phone) + " PSWD :" + pwd;
                    lines.add(updatedLine);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }
        if (!found) {
            System.out.println("Student not found.");
            return;
        }
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String l : lines) {
                writer.write(l + "\n");
            }
            System.out.println("Email updated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    
    public static void updatePhone(Scanner sc, String studentId) {
        List<String> lines = new ArrayList<>();
        boolean found = false;
        System.out.print("Enter new phone number: ");
        String newPhone = sc.next();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains("ID :" + studentId + " ")) {
                    String[] parts = line.split(" ");
                    String id = "", name = "", mail = "", pwd = "", phone = newPhone;
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("ID") && i + 1 < parts.length) id = parts[i + 1].replace(":", "");
                        if (parts[i].equals("NAME") && i + 1 < parts.length) name = parts[i + 1].replace(":", "");
                        if (parts[i].equals("MAIL") && i + 2 < parts.length) mail = parts[i + 2];
                        if (parts[i].equals("PSWD") && i + 1 < parts.length) pwd = parts[i + 1].replace(":", "");
                    }
                    String updatedLine = "ID :" + id + " NAME :" + name + " MAIL ID:" + mail + " PHONE :" + phone + " PSWD :" + pwd;
                    lines.add(updatedLine);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }
        if (!found) {
            System.out.println("Student not found.");
            return;
        }
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String l : lines) {
                writer.write(l + "\n");
            }
            System.out.println("Phone number updated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

   
    public static void viewProfile(String studentId) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains("ID :" + studentId + " ")) {
                    System.out.println("Profile Details:");
                    String[] parts = line.split(" ");
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("ID") && i + 1 < parts.length)
                            System.out.println("ID: " + parts[i + 1].replace(":", ""));
                        if (parts[i].equals("NAME") && i + 1 < parts.length)
                            System.out.println("Name: " + parts[i + 1].replace(":", ""));
                        if (parts[i].equals("MAIL") && i + 2 < parts.length)
                            System.out.println("Email: " + parts[i + 2]);
                        if (parts[i].equals("PHONE") && i + 1 < parts.length)
                            System.out.println("Phone: " + parts[i + 1].replace(":", ""));
                        if (parts[i].equals("PSWD") && i + 1 < parts.length)
                            System.out.println("Password: " + parts[i + 1].replace(":", ""));
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}