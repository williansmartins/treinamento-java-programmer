package br.com.impacta.testes;

import java.util.ArrayList;
import java.util.List;

public class TesteCollectionArrayList {

	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add("Willians");
		lista.add("Luis");
		lista.add("Luis");
		lista.add("Rosalia");	
		
		
		System.out.println(lista);	

		System.out.println(lista.size());	
		
		lista.remove("Luis");
		System.out.println(lista);	
		
		lista.clear();
		System.out.println(lista);
	}


}
