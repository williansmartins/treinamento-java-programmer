package br.com.impacta.testes;

import br.com.impacta.persistencia.Filme;

public class TesteArray {

	public static void main(String[] args) {
		int[] idade = {12, 13, 14, 15};
		String[] textos = {"Gustavo", "lima", "e você"};
		
		Filme f1 = new Filme();
		Filme f2 = new Filme();
		Filme f3 = new Filme();
		
		Filme[] filmes = {f1,f2,f3};
		
		
		int ints[][] = {idade,idade,idade};
		
		System.out.println(textos[0]);
		System.out.println(textos[1]);
		System.out.println(textos[2]);		
				
		System.out.println();
		
		
		
		
	}

}
