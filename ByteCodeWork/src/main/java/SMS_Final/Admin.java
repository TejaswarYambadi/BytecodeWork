package SMS_Final;

public class Admin extends User {
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("1.ADD STUDENT\n"
        				+ "2.SEARCH STUDENT\n"
        				+ "3.UPDATE STUDENT\n"
        				+ "4.DELETE STUDENT\n"
        				+ "5.ASSIGN TASKS\n"
        				+ "6.ENTER MARKS\n"
        				+ "7.UPDATE MARKS\n"
        				+ "8.POST ANNOUNCEMENTS\n"
        				+ "9.EDIT ANNOUNCEMENTS\n"
        				+ "10.DELETE TASKS\n"
        				+ "11.LOGOUT\n");
    }
}