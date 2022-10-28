import java.sql.*;

public class Cap19_Lab1 {
	
	private static String url = "jdbc:mysql://localhost:3306/impacta";
	private static String usuario = "root";
	private static String senha = "impacta";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void abreConexao(){
		try{
			con = DriverManager.getConnection(url, usuario, senha);
			stmt = con.createStatement();
			System.out.println("Conexão estabelecida com sucesso!");
		}catch(SQLException e){
			System.out.println("Não foi possível estabelecer conexão " + e);
			System.exit(1);
		}
	}
	
	public void fechaConexao(){
		try{
			con.close();
		}catch(SQLException e){
			System.out.println("Não foi possível fechar conexão " + e);
			System.exit(1);
		}
	}
	
	public void inserirDados(String nome, double nota1, double nota2, double nota3){
		try{
			String query = "INSERT INTO notas(nome, nota1, nota2, nota3) VALUES('"+nome+"',"+nota1+","+nota2+","+nota3+")";
			stmt.execute(query);
			System.out.println("Notas do aluno "+nome+" inseridas com sucesso.");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void imprimir(){		
		try{
			String query = "SELECT * FROM notas";
			System.out.println("Mostrando notas.\n");
			
			rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.print(rs.getString("nome")+" - ");
				System.out.print(rs.getDouble("nota1")+", ");
				System.out.print(rs.getDouble("nota2")+", ");
				System.out.print(rs.getDouble("nota3")+" - ");
				System.out.println("Média: "+(rs.getDouble("nota1")+rs.getDouble("nota2")+rs.getDouble("nota3"))/3);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		Cap18_Lab1 conexao = new Cap18_Lab1();
		conexao.abreConexao();
		
		conexao.inserirDados("Rodrigo", 9.3, 5.6, 4.6);
		conexao.inserirDados("Danilo", 5.2, 7.5, 2.1);
		conexao.inserirDados("Fabio", 6.4, 4.9, 8.3);
		
		conexao.imprimir();
		conexao.fechaConexao();
	}
}
