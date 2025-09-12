package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DQL {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String password = "5459";

        String query = "SELECT * FROM student";

        try {
            // Load driver (optional for modern JDBC, but fine to keep)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Try-with-resources will auto-close
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement p = conn.prepareStatement(query);
                 ResultSet rs = p.executeQuery()) {
            	System.out.println("ok");
            	System.out.println(rs.next());
                while (rs.next()) {
                    System.out.println("id: " + rs.getInt(1));
                    System.out.println("name: " + rs.getString(2));
                    System.out.println("marks: " + rs.getInt(3));
                    System.out.println("class: " + rs.getInt(4));
                    System.out.println("---------------");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}