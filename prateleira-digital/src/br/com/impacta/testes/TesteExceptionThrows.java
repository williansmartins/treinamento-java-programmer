package br.com.impacta.testes;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteExceptionThrows {
	
	public static void main(String[] args) {
					
		try {
			DriverManager.getConnection("http://servidor.com.br/banco");
		} catch (SQLException e) {
			System.out.println("deu erro" + e.getMessage());
		}		
		
	}
}