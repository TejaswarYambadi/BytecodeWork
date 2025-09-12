package JDBC;
import java.sql.*;
public class Morahar {

	public static void main(String[] args) {
		try {
			//Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
			
			//Query
			String query ="create table teacher(tid number primary key,tname varchar2(20) )";
			
			//Statement
			Statement stmt = conn.createStatement();
			stmt.execute(query);
			
			System.out.println("Table Created Succesfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
