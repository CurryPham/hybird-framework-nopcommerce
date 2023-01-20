package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnUtils {
	public static Connection getSQLServerConnection() {
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "automation";
		String userName = "sa";
		String password = "123456";
		return getSQLServerConnection(hostName, sqlInstanceName, database, userName, password);
	}

	public static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String database,
			String userName, String password) {
		Connection conn = null;
		try {
			// Class.forName("net.sourceforge.jtds.jdbc.Driver");
			// jdbc:sqlserver://:1433;instance=SQLEXPRESS;databaseName=automation
			String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + sqlInstanceName
					+ ";databaseName=" + database;

			conn = DriverManager.getConnection(connectionURL, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
