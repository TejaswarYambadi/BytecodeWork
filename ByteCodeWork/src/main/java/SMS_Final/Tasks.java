package SMS_Final;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Tasks {
	private static String filename="C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\SMS_Final\\Assigments.txt";
	public static void AssignTasks(Scanner sc) {
		try {
			FileWriter file=new FileWriter(filename,true);
			System.out.print("Enter Task Name: ");
			String taskname=sc.next();
			file.write("Task :"+taskname+"\n");
			System.out.println("Task Added successfully");
			System.out.println();
			file.close();	
		}
		catch (IOException e) {
	        System.out.println("TRY AGAIN");
	    }
	}
	public static void deleteTask(Scanner sc) {
    List<String> lines = new ArrayList<>();
    System.out.print("Enter Task Name to delete: ");
    String taskToDelete = sc.next();
    boolean found = false;
    try (Scanner fileScanner = new Scanner(new java.io.File(filename))) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            if (line.startsWith("Task :" + taskToDelete)) {
                found = true;
                continue;
            }
            lines.add(line);
        }
    } catch (IOException e) {
        System.out.println("Error reading tasks.");
        return;
    }
    if (!found) {
        System.out.println("Error: Task not found");
        return;
    }
    try (FileWriter writer = new FileWriter(filename, false)) {
        for (String l : lines) writer.write(l + "\n");
        System.out.println("Task deleted successfully.");
    } catch (IOException e) {
        System.out.println("Error writing file.");
    }
}

	public static void TaskStatus(Scanner sc, String studentId, String studentName) {
	    List<String> tasks = new ArrayList<>();
	    
	    try (Scanner fileScanner = new Scanner(new java.io.File(filename))) {
	        while (fileScanner.hasNextLine()) {
	            String line = fileScanner.nextLine().trim();
	            if (line.startsWith("Task :")) {
	                tasks.add(line.substring(6).trim());
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("Error reading tasks.");
	        return;
	    }

	    if (tasks.isEmpty()) {
	        System.out.println("No tasks available.");
	        return;
	    }

	    
	    System.out.println("Available Tasks:");
	    for (int i = 0; i < tasks.size(); i++) {
	        System.out.println((i + 1) + ". " + tasks.get(i));
	    }
	    System.out.print("Select task number: ");
	    int choice = sc.nextInt();
	    if (choice < 1 || choice > tasks.size()) {
	        System.out.println("Error: Task not found");
	        return;
	    }
	    String taskName = tasks.get(choice - 1);

	    
	    System.out.print("Enter Status (completed/pending): ");
	    String status = sc.next();

	    
	    try (FileWriter file = new FileWriter(filename, true)) {
	        file.write(studentId + "," + studentName + "," + taskName + "," + status + "\n");
	        System.out.println("Task status updated successfully\n");
	    } catch (IOException e) {
	        System.out.println("TRY AGAIN");
	    }
	}

	}