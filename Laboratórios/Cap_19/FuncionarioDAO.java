package br.com.impacta.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.java.model.Funcionario;

public class FuncionarioDAO {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/impacta";
    private static final String USER = "aluno";
    private static final String PASSWORD = "java";

    public void persist(Funcionario func) throws DAOException {

        Connection cn = null;
        PreparedStatement ps = null;

        try {

            cn = getConnection();
            ps = cn.prepareStatement("INSERT INTO tab_func (func_name, func_rmnt_val, role_code) VALUES (?, ?, ?)");

            ps.setString(1, func.getNome());
            ps.setDouble(2, func.getSalario());
            ps.setInt(3, func.getCargoId());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new DAOException("Falha ao salvar dados do funcionário", e);
        } finally {
            closeResources(cn, ps, null);
        }
    }

    public List<Funcionario> findByName(String nome) throws DAOException {
        
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            cn = getConnection();
            ps = cn.prepareStatement("SELECT func_code, func_name, func_rmnt_val, role_code FROM tab_func WHERE func_name LIKE ?");

            ps.setString(1, "%" + nome + "%");
            rs = ps.executeQuery();

            List<Funcionario> funcionarioList = new ArrayList<>();
            Funcionario funcionario;

            while (rs.next()) {
                funcionario = new Funcionario();
                funcionario.setId(rs.getInt("func_code"));
                funcionario.setNome(rs.getString("func_name"));
                funcionario.setSalario(rs.getDouble("func_rmnt_val"));
                funcionario.setCargoId(rs.getInt("role_code"));
                funcionarioList.add(funcionario);
            }
            
            return funcionarioList;

        } catch (SQLException e) {
            throw new DAOException("Falha ao realizar consulta", e);
        } finally {
            closeResources(cn, ps, rs);
        }
    }

    private Connection getConnection() throws DAOException {

        try {

            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            throw new DAOException("Falha ao carregar o driver.", e);
        } catch (SQLException e) {
            throw new DAOException("Falha ao abrir conexão.", e);
        }
    }

    private void closeResources(Connection cn, Statement st, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {}
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {}
        }
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException e) {}
        }
    }
}
