package TaskOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static final String URL = "jdbc:mysql://localhost:3306/MyJoinsDB_one";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

    Connect() {
    }

    static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Драйвер завантажено");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Connection connectDriver() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {
            if (!connection.isClosed()) {
                System.out.printf("Звязок налагоджено з базою даних -- %s --  налагоджено\n", URL );
            }
            if (connection.isClosed()) {
                System.out.println("Звязок відсутній");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }
}
