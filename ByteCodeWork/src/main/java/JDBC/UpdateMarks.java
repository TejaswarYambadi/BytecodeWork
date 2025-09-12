package JDBC;
import java.util.Scanner;
import java.sql.*;
public class UpdateMarks {
	public static void main(String[] args) {
		int sisd;
		/*System.out.println("Enter sid to delete = ");
		Scanner sc = new Scanner(System.in);
		sisd = sc.nextInt();*/
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
		
		/*String query = "delete  from student where sid = ? ";
		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setInt(1, sisd);
		int i = stmt.executeUpdate();
		if(i>0) {
			System.out.println("Student Deleted Succesfully");
		}
		else {
			System.out.println("Student Not found");
		}*/
		
		/*Statement stmt = conn.createStatement();
		stmt.addBatch("insert into student values(101,90)");
		stmt.addBatch("insert into student values(102,80)");
		
		int [] results = stmt.executeBatch();
		 
		System.out.println("Done");*/
		
		String query = "select * from student";
		Statement stmt = conn.createStatement();
		stmt.execute(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
