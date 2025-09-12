package StudentManagementSystem;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		do {
		System.out.println("=== Student Management System ===");
		System.out.println("1. Admin ");
		System.out.println("2. Student");
		System.out.println("3. Exit");
		System.out.print("Enter your choice = ");
		option = sc.nextInt();
		switch(option) {
		case 1:
			if(Admin.login()) {
				while(true) {
					System.out.println("====================");
					System.out.println("1.Add Student");
					System.out.println("2.Delete Student");
					System.out.println("3.Update Student");
					System.out.println("4.Search Student");
					System.out.println("5.Logout");
					System.out.println("====================");
					System.out.print("Enter an option = ");
					int choice = sc.nextInt();
					
					switch(choice) {
					case 1-> StudentCrud.addStudent();
					case 2-> StudentCrud.deleteStudent();
					case 3-> StudentCrud.updateStudent();
					case 4-> StudentCrud.searchStudent();
					case 5->{return;}
					}
				}
			}
			break;
		case 2:
		    if (Student.markAttendance()) {
		        System.out.println("Welcome Student!");
		    }
		    break;

		case 3:
			System.out.print("Exited");
			break;
		default:
			System.out.print("Invalid Option Please enter the option Shown in the display");
		}
		}
		while(option !=3);
		sc.close();
	}
	
}
