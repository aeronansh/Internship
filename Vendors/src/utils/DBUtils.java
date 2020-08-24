package utils;
//JDBC API
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	public static Connection fetchConnection() throws Exception {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "aman", "amansharma");
	}
}
