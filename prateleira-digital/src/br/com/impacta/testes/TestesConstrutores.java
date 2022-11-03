package br.com.impacta.testes;

import br.com.impacta.persistencia.Filme;

public class TestesConstrutores {

	public static void main(String[] args) {
		//Instanciar objeto usando construtor padrão
		Filme f1 = new Filme();
		f1.titulo ="Batman";
		f1.nota = 10;
		f1.duracao = 120;

		//Instanciar objeto usando construtor diferente do padrão
		Filme f2 = new Filme("Star Wars", "diretor1, diretor2",9.9,120,1980, "suspense", 10, "https://www.site.com.br");
		
		System.out.println(f1);
		System.out.println(f2);
	}

}


