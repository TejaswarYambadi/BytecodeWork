package JDBC;
import java.util.Scanner;
import java.sql.*;
public class Dynamic_Input_Values_To_DB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int id=0;
		String name=" ";
		String stream=" ";
		System.out.println("Enter the count of no of Student Details you want to enter = ");
		count = sc.nextInt();
		try {
			//Loading and Registring the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Creating Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
			//Query
			String query1 = "create table Student(sno number,sname varchar2(20),branch varchar2(20))";
			Statement stmt = conn.createStatement();
			stmt.execute(query1);
			String query = "insert into student values (?,?,?)";
			//statement
			PreparedStatement psmt = conn.prepareStatement(query);
			for(int i=0;i<count;i++) {
				System.out.print("Enter student roll No = ");
				id = sc.nextInt();
				System.out.print("Enter student Name = ");
				name = sc.next();
				System.out.print("Enter student Branch = ");
				stream = sc.next();
				psmt.setInt(1,id);
				psmt.setString(2,name);
				psmt.setString(3,stream);
				psmt.executeUpdate();
			}
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
