package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerJTDSConnUtils {
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

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			// jdbc:jtds:sqlserver://localhost:1433/automation;instance=SQLEXPRESS
			String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" + database + ";instance="
					+ sqlInstanceName;

			conn = DriverManager.getConnection(connectionURL, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
