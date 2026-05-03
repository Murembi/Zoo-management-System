import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        String url = "jdbc:postgresql://localhost:5432/Zoo";
        String user = "postgres";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            //System.out.println("Connection successful");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
