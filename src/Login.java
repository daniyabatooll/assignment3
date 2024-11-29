import java.sql.*; // Import SQL package

public class Login {
    public boolean authenticate(String username, String password) {
        // Adjust the query based on your actual table and column names
        String query = "SELECT * FROM User WHERE Name = ? AND Password = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // Returns true if a match is found
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Returns false if no match is found
    }
}
