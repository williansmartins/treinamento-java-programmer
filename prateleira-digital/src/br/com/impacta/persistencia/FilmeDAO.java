package br.com.impacta.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class FilmeDAO {

	//criar (C)
	public void criar(Filme filme){
		
	}
	
	//listar (R)
	public List listar(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_filme;");
			
			while(rs.next()) {
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getInt("codigo"));
			}
			
			con.close();
			stmt.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace(); 
		} 
		return null;
	}
	
	//atualizar (U)
	public void atualizar(Filme filme) {
		
	}
	
	//remover (D)
	public void remover(int codigo) {
		
	}
}
