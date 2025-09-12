package SMS_Final;

public class Student extends User {
    public Student(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("1.UPDATE TASK STATUS\n"
        					+ "2.VIEW RESULT\n"
        					+ "3.VIEW ANNOUNCEMENTS\n"
        					+ "4.CHANGE PASSWORD\n"
        					+ "5.UPDATE EMAIL\n"
        					+ "6.UPDATE PHONE NUMBER\n"
        					+ "7.VIEW PROFILE\n"
        					+ "8.DELETE ANNOUNCEMENTS\n"
        					+ "9.LOGOUT");
    }
}