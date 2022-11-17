package br.com.impacta.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cadastro", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbfuncionarios;");
			
			while(rs.next()) {
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("cargo"));
			}
			
			con.close();
			stmt.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
