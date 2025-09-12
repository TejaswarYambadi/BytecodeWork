package SMS_Final;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class CRUD {
	private static String fileName="C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\SMS_Final\\studentsdet.txt";
public static void addStudent(Scanner sc) {
	try {
		FileWriter file=new FileWriter(fileName,true);
		System.out.print("Student ID: ");
		String sid=sc.next();
		System.out.print("Student Name: ");
		String sname=sc.next();
		System.out.print("Student EMAIL: ");
		String smail=sc.next();
		System.out.print("Student Password : ");
		String spwd=sc.next();
		file.write("ID :"+sid+" NAME :"+sname+" MAIL ID:"+smail+" PSWD :"+spwd+"\n");
		System.out.println("Student Added successfully");
		System.out.println();
		file.close();	
	}
	catch (IOException e) {
        System.out.println("TRY AGAIN");
    }
} 

public static void searchStudent(Scanner sc) {
    System.out.print("Enter Student ID to search: ");
    String searchId = sc.next();
    boolean found = false;
    try (Scanner fileScanner = new Scanner(new java.io.File(fileName))) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.contains("ID :" + searchId + " ")) {
                String[] parts = line.split(" ");
                String id = "", name = "";
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals("ID") && i + 1 < parts.length) {
                        id = parts[i + 1].replace(":", "");
                    }
                    if (parts[i].equals("NAME") && i + 1 < parts.length) {
                        name = parts[i + 1].replace(":", "");
                    }
                }
                System.out.println("Student ID: " + id);
                System.out.println("Student Name: " + name);
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

public static void updateStudent(Scanner sc) {
    System.out.print("Enter Student ID to update: ");
    String searchId = sc.next();
    List<String> lines = new ArrayList<>();
    boolean found = false;

    try (Scanner fileScanner = new Scanner(new java.io.File(fileName))) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.contains("ID :" + searchId + " ")) {
                found = true;
                System.out.println("What do you want to update?");
                System.out.println("1. Name\n2. Email\n3. Password");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                String[] parts = line.split(" ");
                String id = "", name = "", mail = "", pwd = "";
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals("ID") && i + 1 < parts.length) id = parts[i + 1].replace(":", "");
                    if (parts[i].equals("NAME") && i + 1 < parts.length) name = parts[i + 1].replace(":", "");
                    if (parts[i].equals("MAIL") && i + 1 < parts.length) mail = parts[i + 2];
                    if (parts[i].equals("PSWD") && i + 1 < parts.length) pwd = parts[i + 1].replace(":", "");
                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        name = sc.next();
                        break;
                    case 2:
                        System.out.print("Enter new email: ");
                        mail = sc.next();
                        break;
                    case 3:
                        System.out.print("Enter new password: ");
                        pwd = sc.next();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                String updatedLine = "ID :" + id + " NAME :" + name + " MAIL ID:" + mail + " PSWD :" + pwd;
                lines.add(updatedLine);
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
        System.out.println("Student details updated successfully.");
    } catch (IOException e) {
        System.out.println("Error writing file.");
    }
}

public static void deleteStudent(Scanner sc) {
    System.out.print("Enter Student ID to delete: ");
    String searchId = sc.next();
    List<String> lines = new ArrayList<>();
    boolean found = false;

    try (Scanner fileScanner = new Scanner(new java.io.File(fileName))) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.contains("ID :" + searchId + " ")) {
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
        System.out.println("Error: Student not found.");
        return;
    }

    try (FileWriter writer = new FileWriter(fileName, false)) {
        for (String l : lines) {
            writer.write(l + "\n");
        }
        System.out.println("Student deleted successfully.");
    } catch (IOException e) {
        System.out.println("Error writing file.");
    }
}


}

