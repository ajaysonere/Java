import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        // JDBC connection variables
        String jdbcURL = "jdbc:mysql://localhost:3306/wipro";
        String username = "root";
        String password = "*Ajay#1@";

        // Establishing the connection
        try {
            // Registering the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Creating the connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Checking if the connection is successful
            if (connection != null) {
                System.out.println("Connected to the database!");
                // Perform database operations here
            }

            // Closing the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
