package SMS_Final;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean runApp = true;
        System.out.println("================ STUDENT MANAGEMENT SYSTEM ==================");

        while (runApp) {
            System.out.println();
            System.out.println("1. ADMIN LOGIN");
            System.out.println("2. STUDENT LOGIN");
            System.out.println("3. EXIT");
            System.out.println();
            System.out.print("Enter your choice: ");
            int ch = -1;
            try {
                ch = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }
            System.out.println();

            switch (ch) {
                case 1:
                    sc.nextLine(); // prepare for admin login which reads lines
                    Admin admin = AdminLogin.login(sc);
                    if (admin != null) {
                        boolean adminMenu = true;
                        while (adminMenu) {
                            admin.displayMenu();
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            int ch1;
                            try {
                                ch1 = Integer.parseInt(sc.next());
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input.");
                                continue;
                            }
                            System.out.println();
                            switch (ch1) {
                                case 1:
                                    CRUD.addStudent(sc);
                                    break;
                                case 2:
                                    CRUD.searchStudent(sc);
                                    break;
                                case 3:
                                    CRUD.updateStudent(sc);
                                    break;
                                case 4:
                                    CRUD.deleteStudent(sc);
                                    break;
                                case 5:
                                    Tasks.assignTask(sc);
                                    break;
                                case 6:
                                    Marks.enterMarks(sc);
                                    break;
                                case 7:
                                    Marks.updateMarks(sc);
                                    break;
                                case 8:
                                    Announcements.postAnnouncement(sc);
                                    break;
                                case 9:
                                    Announcements.editAnnouncement(sc);
                                    break;
                                case 10:
                                    Tasks.deleteTask(sc);
                                    break;
                                case 11:
                                    adminMenu = false;
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
                        boolean studentMenu = true;
                        while (studentMenu) {
                            student.displayMenu();
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            int ch2;
                            try {
                                ch2 = Integer.parseInt(sc.next());
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input.");
                                continue;
                            }
                            System.out.println();
                            switch (ch2) {
                                case 1:
                                    Tasks.updateTaskStatus(sc, student.getId(), student.getName());
                                    break;
                                case 2:
                                    Marks.viewMarks(student.getId());
                                    break;
                                case 3:
                                    Announcements.viewAnnouncements();
                                    break;
                                case 4:
                                    StudentLogin.changePasswordWithValidation(sc, student.getId());
                                    break;
                                case 5:
                                    StudentLogin.updateEmail(sc, student.getId());
                                    break;
                                case 6:
                                    StudentLogin.updatePhone(sc, student.getId());
                                    break;
                                case 7:
                                    StudentLogin.viewProfile(student.getId());
                                    break;
                                case 8:
                                    Announcements.deleteAnnouncementAsStudent();
                                    break;
                                case 9:
                                    studentMenu = false;
                                    break;
                                default:
                                    System.out.println("Invalid Input");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exited Successfully");
                    runApp = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

        sc.close();
    }
}
