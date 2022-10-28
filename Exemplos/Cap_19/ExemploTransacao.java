import java.sql.*;

public class ExemploTransacao {

    public static void main(String[] args) {
        try {
            realizaOperacao();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void realizaOperacao() throws Exception {
        Connection cn = null;
        Statement st = null;
        
        try {
            cn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/impacta", "root", "impacta");
            cn.setAutoCommit(false);
            
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO tab (...) VALUES (...)");
            st.executeUpdate("DELETE FROM tab WHERE ...");
            st.executeUpdate("UPDATE tab SET ....");
            
            cn.commit();
        } catch (SQLException e) {
            cn.rollback();
            throw new Exception("Falha ao acessar base de dados.", e);
        } finally {
            st.close();
            cn.close();
        }
    }
}
