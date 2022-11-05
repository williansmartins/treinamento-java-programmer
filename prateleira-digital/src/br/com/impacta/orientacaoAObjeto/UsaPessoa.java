package br.com.impacta.orientacaoAObjeto;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "JOAO";
		pessoa2.nome = "MARIA"; 
		
		pessoa1.idade = 2;
		pessoa1.quantidadeDeBracos = 8;
		pessoa2.quantidadeDeBracos = 1;
		
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2);
 	}

}
