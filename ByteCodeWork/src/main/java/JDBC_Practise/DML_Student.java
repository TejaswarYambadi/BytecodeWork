package JDBC_Practise;
import java.sql.*;
import java.util.Scanner;
public class DML_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=0;
		int marks=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","5459");
			
			String query ="insert into student (sid ,marks) values(?,?)";
		
			PreparedStatement stmt = conn.prepareStatement(query);
			for(int i=0; i<5;i++) {
				System.out.print("Enter student id=");
				id= sc.nextInt();
				System.out.println("Enter student marks = ");
				marks= sc.nextInt();
				stmt.setInt(1,id);
				stmt.setInt(2,marks);
				stmt.executeUpdate();
				System.out.println("Row inserted");
						}
		
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
