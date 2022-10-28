import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexaoJDBC {
	static String url = "jdbc:mysql://localhost:3306/db_cadastro";
	static String user = "root";
	static String password = "Imp@ct@";

	public static void main(String[] args) {
		openDB();
	}

	public static void openDB() {
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from tbfuncionarios");) {
			System.out.println("\nConexão estabelecida com sucesso!\n");

		} catch (SQLException e) {
			System.out.println("\nNão foi possivel estabelecer conexão" + e
					+ "\n");
			System.exit(1);
		}
	}

}
