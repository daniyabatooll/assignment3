import java.sql.*; // Import the SQL package for database classes

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/a2";
    private static final String USER = "root";
    private static final String PASSWORD = "Daniya.555";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
        }
        return connection;
    }
}
