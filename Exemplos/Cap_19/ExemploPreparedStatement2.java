import java.sql.*;

public class ExemploPreparedStatement2 {

    public static void main(String[] args) {
        
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/impacta", "root", "impacta");
            PreparedStatement ps = cn.prepareStatement(
                "INSERT INTO tab_func VALUES (?, ?, ?, ?)");
            
            ps.setInt(1, 108);
            ps.setString(2, "Manuel da Silva");
            ps.setString(3, "São Paulo");
            ps.setDouble(4, 3550.15);
            ps.executeUpdate();

            System.out.println("Funcionário cadastrado com sucesso.");

            ps.close();
            cn.close();
            System.out.println("Conexão encerrada.");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Falha ao carregar driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}
