package TaskOne;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connect connect = new Connect();
        connect.registerDriver();
        Job job = new Job(connect.connectDriver());
        System.out.println(job);
        job.insert();
        System.out.println(job);

    }
}
