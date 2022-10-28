
public class Aluno {

	public static int contadorDeAlunos;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimeAluno() {
		System.out.println("Aluno: " + this.nome);
	}	
}