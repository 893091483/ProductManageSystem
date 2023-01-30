package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
	private static String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc_demos?useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String jdbcUserName = "root";
	private static String jdbcPassword = "A893091483a";
	


	public static Connection getConnection() {
Connection conn = null;
		
		try {
			conn =  DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}                    
		return conn;
	}
}
