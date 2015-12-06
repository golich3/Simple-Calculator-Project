import java.sql.*;

public class Database {
	public Connection con;
	Statement stmt = null;

	public void save(int result) throws SQLException, ClassNotFoundException {
		connect();
		runQuery(result);
		disconnect();
	}

	public boolean connect() throws ClassNotFoundException, SQLException {
		if (con != null) {
			return true;
		}

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String connectionURL = "jdbc:sqlserver://swsql.mahanair.aero;user=sa;password=123;database=javaTraining";
		con = DriverManager.getConnection(connectionURL);
		System.out.println("Connected");

		if (con == null) {
			return false;
		}
		return true;
	}

	private void runQuery(int result) throws SQLException {
		// TODO Save
		stmt = con.createStatement();
		String sql = "INSERT INTO [JavaTraining].[dbo].[SimpleCalculator]  "
				+ "VALUES (" + result + ",getdate()" + ")";
		stmt.executeUpdate(sql);
		System.out.println("Save");
	}

	public void disconnect() {
		if (con != null) {
			try {
				con.close();
				System.out.println("Disconnected");
			} catch (SQLException e) {
				System.out.println("Could not disconect");
			}
		}
	}
}
