import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/stem_systeem",
            "root",
            "Welkom#1"
        );
    }
}
