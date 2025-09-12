package JDBC;
import java.sql.*;
public class UpdateRecords {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5459");
			String query= "update student set sno = ? where sno = ?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1,4);
			psmt.setInt(2,101);
			//psmt.setString(2,"X");
			//psmt.setString(3,"MECH");
			psmt.executeUpdate();
			System.out.println("Update Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
