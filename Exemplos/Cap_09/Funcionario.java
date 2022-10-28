
public class Funcionario {
	// atributos
	private String nome;
	private String email;

	// construtores
	public Funcionario(){}
	public Funcionario(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	// métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
