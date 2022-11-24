import java.sql.*;

public class TestarConexao {
	
	private final static String url = "jdbc:mysql://localhost:3306/db_cadastro";
	
	private final static String username = "root";
	private final static String password = "Imp@ct@";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	private String nome = null;
	private String telefone = null;
	
	public static void main(String args[]){
		TestarConexao b = new TestarConexao();
		b.openDB();
		b.mostra();
		b.closeDB();
	}
	
	public void openDB(){
		try{
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso!\n");
		}catch(SQLException e){
			System.out.println("\nNão foi possível estabelecer conexão " + e + "\n");
			System.exit(1);
		}
	}
	
	public void closeDB(){
		try{
			con.close();
		}catch(SQLException e){
			System.out.println("\nNão foi possível fechar conexão " + e + "\n");
			System.exit(1);
		}
	}
	
	public void setNome(String nome){
		if(nome.trim().length() == 0)
			this.nome = null;
		else
			this.nome = nome;
	}
	
	public void setTelefone(String telefone){
		if(telefone.trim().length() == 0)
			this.telefone = null;
		else
			this.telefone = telefone;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void mostra(){
		String query;
		
		try{
			query = "SELECT * FROM alunos";
			System.out.println("\nMostrando dados.\n");
			
			rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("telefone"));
			}
		}catch(SQLException e){
			setNome(null);
			setTelefone(null);
		}
	}
}
