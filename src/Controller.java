import java.sql.SQLException;

public class Controller {
	Database db;

	public Controller() {
		db = new Database();
	}

	public void save(int input) throws SQLException {
		this.db.save(input);
	}
}
