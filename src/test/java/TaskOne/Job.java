package TaskOne;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Job {
    private final Connection CONNECTION;

    public Job(Connection connection) {
        this.CONNECTION = connection;
    }

    private Statement statement(Connection connection) {
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Client> getInfo() {
        List clients = new ArrayList();
        final String GET_INF0 = "select * from Personal where id>1";
        try {
            ResultSet resultSet = statement(CONNECTION).executeQuery(GET_INF0);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                String phone = resultSet.getString("numb_phone");
                Client client = new Client(id, name, phone);
                clients.add(client);

            }
        } catch (SQLException e) {
            System.out.println("Перший блін комом");
            e.printStackTrace();
        }
        return clients;
    }

    public void insert() {
        final String INSERT = "insert into  Personal\n" +
                "(id, name, numb_phone)\n" +
                "values\n" +
                "(5, \"Ihor\", 7931111);";
        try {
            statement(CONNECTION).execute(INSERT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return getInfo().toString();
    }
}

