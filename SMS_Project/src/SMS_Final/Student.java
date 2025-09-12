package SMS_Final;

public class Student extends User {
    public Student(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("1. UPDATE TASK STATUS");
        System.out.println("2. VIEW RESULT");
        System.out.println("3. VIEW ANNOUNCEMENTS");
        System.out.println("4. CHANGE PASSWORD");
        System.out.println("5. UPDATE EMAIL");
        System.out.println("6. UPDATE PHONE NUMBER");
        System.out.println("7. VIEW PROFILE");
        System.out.println("8. DELETE ANNOUNCEMENTS");
        System.out.println("9. LOGOUT");
    }
}
