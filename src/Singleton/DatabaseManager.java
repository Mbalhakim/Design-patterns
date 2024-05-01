package Singleton;
import io.github.cdimascio.dotenv.Dotenv;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final Dotenv dotenv = Dotenv.load();
    public static final String URL = dotenv.get("DATABASEURL");
    private static final String USERNAME = dotenv.get("DATABASE_USERNAME");
    private static final String PASSWORD = dotenv.get("DATABASE_PASSWORD");
    private static DatabaseManager instance;
    private Connection connection;


    private DatabaseManager() {
        try {
            // Establish the database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




    public static synchronized DatabaseManager getInstance() {
        // If the instance is null, create a new instance
        if (instance == null) {
            instance = new DatabaseManager();
        }
        // Return the instance
        return instance;
    }
    // Method to get the database connection
    public Connection getConnection() {

        return connection;
    }

    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                int userId = resultSet.getInt(1);
                String first_name = resultSet.getString(2);
                String last_name = resultSet.getString(5);
                String email = resultSet.getString(6);
                // Create Singleton.User object and add to list
                userList.add(new User(userId, first_name, last_name, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }




}
