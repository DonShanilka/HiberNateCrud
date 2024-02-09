package lk.ijse.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnetion {
    private static Connection connection;
    private static DbConnetion dbConnetion;

    private DbConnetion() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibercrud",
                "root",
                "Shanilka800@#");
    }

    public static DbConnetion getInstance() throws SQLException {
        return (null == dbConnetion) ? new DbConnetion(): dbConnetion;
    }

    public Connection getConnection(){
        return connection;
    }

}
