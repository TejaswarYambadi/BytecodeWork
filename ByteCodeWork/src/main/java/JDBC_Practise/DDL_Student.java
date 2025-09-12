package JDBC_Practise;
import java.sql.*;
public class DDL_Student {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
			//Create a table student with the given details
			//String query = "create table student(sid number primary key,name varchar2(20),age number,class number,percentage number)";
			
			//query to add the column name 
			//String query = "alter table student add  email varchar2(20) ";
			
			//query to delete the column 
			//String query =  "alter table student drop column email";
			
			//Query to change the column name 
			//String query = "alter table student rename column percentage to marks ";
			
			//Query to delete the table
			String query = "drop table student";
			
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			System.out.println("Database Created Successfully...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
