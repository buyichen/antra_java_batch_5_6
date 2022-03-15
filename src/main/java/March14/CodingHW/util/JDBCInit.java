package March14.CodingHW.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCInit {
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String username = "root";
    private static final String password = "Database123!";
    private static Connection connection = null;

    public Connection Initialization(){
        try{
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

}
