package myTwiterProject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by ua001022 on 29.05.2015.
 */
public class BaseDAO {
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/test_bd";
    public static final String USER = "root";
    public static final String PASSWORD = ",ekjxrf24";

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
