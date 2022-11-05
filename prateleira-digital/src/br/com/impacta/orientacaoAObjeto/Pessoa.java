package br.com.impacta.orientacaoAObjeto;

public class Pessoa {

	int idade = 1;
	String nome;
	static int quantidadeDeBracos = 2;
	static int quantidade = 0;
	
	Pessoa(){
		System.out.println("Quantidade: " + (++quantidade));
	}
	
	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + ", quantidadeDeBracos=" + quantidadeDeBracos + "]";
	}	

}
