package SMS_Final;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag1=true;
		boolean flag2=true;
		boolean flag3=true;
		System.out.println("================ STUDENT MANAGEMENT SYSTEM ==================");
		while(flag1)
		{
		System.out.println();
		System.out.println("1.ADMIN LOGIN"+"\n"+ "2.STUDENT LOGIN"+"\n"+"3.EXIT");
		System.out.println();
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();
		System.out.println();
		
		switch(ch) 
		{
		case 1:
			sc.nextLine(); // consume leftover newline after nextInt
			Admin admin = AdminLogin.login(sc);
			if(admin != null)
			{
				while(flag2)
				{
					admin.displayMenu();
					System.out.println();
					System.out.print("Enter your choice: ");
					int ch1=sc.nextInt();
					System.out.println();
					switch(ch1)
					{
					case 1:
						CRUD.addStudent(sc);break;
					case 2:
						CRUD.searchStudent(sc);break;
					case 3:
						CRUD.updateStudent(sc);break;
					case 4:
						CRUD.deleteStudent(sc);break;
					case 5:
						Tasks.AssignTasks(sc);break;
					case 6:
						Marks.enterMarks(sc);break;
					case 7:
						Marks.updateMarks(sc);break;
					case 8:
						Announcements.postAnnouncement(sc);break;
					case 9:
						Announcements.editAnnouncement(sc);break;
					case 10:
						Tasks.deleteTask(sc);break;
					case 11:
						flag2=false;
						break;
					default:
						System.out.println("Invalid Input");
					}
				}
				
			}
			break;
		case 2:
			Student student = StudentLogin.login(sc);
			if (student != null) {
				String studentId = student.getId();
				String name = student.getName();
				while(flag3)
				{
					student.displayMenu();
					System.out.println();
					System.out.print("Enter your choice: ");
					int ch2=sc.nextInt();
					System.out.println();
					switch(ch2)
					{
					case 1:
						Tasks.TaskStatus(sc,studentId, name);break;
					case 2:
						Marks.viewMarks(studentId);break;
					case 3:
						Announcements.viewAnnouncements();break;
					case 4:
						StudentLogin.changePasswordWithValidation(sc, studentId);break;
					case 5:
						StudentLogin.updateEmail(sc, studentId);break;
					case 6:
						StudentLogin.updatePhone(sc, studentId);break;
					case 7:
						StudentLogin.viewProfile(studentId);break;
					case 8:
						Announcements.deleteAnnouncementAsStudent();break;
					case 9:
						flag3=false;
						break;
					default:
						System.out.println("Invalid Input");    
						
					}
				}
			}
			break;
		case 3:
			flag1=false;
			break;
		default:
			System.out.println("Invalid Input");
		}}}}