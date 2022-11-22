package br.com.impacta.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
	
	List<Filme> galeria = new ArrayList();
	
	//criar (C)
	public void criar(Filme filme){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://172.16.23.9:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			String sql = "INSERT INTO tb_filme (titulo, ano) VALUES('xxx', 2022) ";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
			con.close();
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace(); 
		} 
	}
	
	//listar (R)
	public List<Filme> listar(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://172.16.23.9:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_filme;");			
			while(rs.next()) {
				Filme filme = new Filme();
				filme.codigo = rs.getInt("codigo");
				filme.titulo = rs.getString("titulo");
				filme.generos = rs.getString("generos");
				filme.diretores = rs.getString("diretores");
				filme.url = rs.getString("url");
				filme.votos = rs.getInt("votos");
				filme.nota = rs.getDouble("nota");
				filme.ano = rs.getInt("ano");
				filme.duracao = rs.getInt("duracao");

				galeria.add(filme);
			}
			
			con.close();
			stmt.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace(); 
		} 
		return galeria;
	}
	
	//atualizar (U)
	public void atualizar(Filme filme) {
		
	}
	
	//remover (D)
	public void remover(int codigo) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://172.16.23.9:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			Statement stmt = con.createStatement();
			stmt.execute("delete  from tb_filme where codigo = " + codigo);
		} catch (SQLException e) {
			e.printStackTrace(); 
		} 
	}
}
