import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private String name = "root";
    private String passwd = "11235813";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(dbUrl, name, passwd);
    }

    public void showError(SQLException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("sql error code: " + e.getErrorCode());
    }
}
