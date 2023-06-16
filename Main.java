import config.JdbcConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        여기가 메인
        Connection conn = new JdbcConnection().getJdbc();
    }
}
