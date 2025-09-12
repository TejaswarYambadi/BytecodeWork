package files;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        try {
            FileWriter w = new FileWriter("C:\\Users\\yamba\\OneDrive\\Desktop\\New folder (2)\\BytecodeWork\\ByteCodeWork\\src\\main\\java\\files\\example.txt", true); // append mode
            w.write("Name = " + name + "\n"); // added newline
            w.close();
            System.out.println("Name saved Successfully in example.txt");
        } catch (IOException e) {
            System.out.println("Error!!!...");
            e.printStackTrace();
        }

        sc.close();
    }
}
