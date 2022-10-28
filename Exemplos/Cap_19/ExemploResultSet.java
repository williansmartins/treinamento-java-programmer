import java.sql.*;

public class ExemploResultSet {

    public static void main(String[] args) {
        
        try {

            Connection cn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/db_cadastro", "root", "Imp@ct@");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nome, idade FROM tbfuncionarios");

            while (rs.next()) {
                String nome = rs.getString("nome");
                double sal = rs.getDouble("idade");
                System.out.println(nome + " - " + sal);
            }
            
            rs.close();
            st.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Falha ao realizar a operação.");
            e.printStackTrace();
        }
    }
}
