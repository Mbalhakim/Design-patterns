import Singleton.DatabaseManager;
import Singleton.User;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        DatabaseManager dbm =DatabaseManager.getInstance();
        List<User> userList = dbm.getUsers();

        // Render user data
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
