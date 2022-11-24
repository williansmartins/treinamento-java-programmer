import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploSQL {

    public static void main(String[] args) {

        try {

            Connection cn;
            cn = DriverManager.getConnection(
                "jdbc:oracle:thin:localhost:1521:orcl", "scott", "tiger");

        } catch (SQLException e) {
            System.out.println("Não foi possível realizar a conexão.");
            e.printStackTrace();
        }
    }
}
