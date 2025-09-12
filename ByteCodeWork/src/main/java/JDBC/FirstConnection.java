package JDBC;
import java.sql.*;
public class FirstConnection {
	public static void main(String[] args) {
		try {
			//Load The Database
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
			//Query
			String query = "insert into student values(1,'A','CIVIL')";
			//Statement
			Statement smt= conn.createStatement();
			smt.execute(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
