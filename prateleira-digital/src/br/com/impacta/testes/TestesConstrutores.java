package br.com.impacta.testes;

import br.com.impacta.persistencia.Filme;

public class TestesConstrutores {

	public static void main(String[] args) {
		//Instanciar objeto usando construtor padrão
		Filme f1 = new Filme();
		f1.setTitulo("Batman");
		f1.setNota(10);
		f1.setDuracao(120);

		//Instanciar objeto usando construtor diferente do padrão
		Filme f2 = new Filme();
		
		System.out.println(f1);
		System.out.println(f2);
	}

}


