package JDBC;
import java.sql.*;
public class DeleteRecords {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
			String query = "delete from student  where sname =?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(2,"A");
			psmt.executeUpdate();
			System.out.println("Delete Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
