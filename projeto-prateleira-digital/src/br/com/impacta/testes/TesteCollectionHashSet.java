package br.com.impacta.testes;

import java.util.HashSet;
import java.util.Set;

public class TesteCollectionHashSet {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		
		conjunto.add("Willians");		
		conjunto.add("Luis");		
		conjunto.add("Luis");		
		conjunto.add("Rosalia");		
		
		
		System.out.println(conjunto);	

		System.out.println(conjunto.size());	
		
		conjunto.remove("Luis");
		System.out.println(conjunto);	
		
		conjunto.clear();
		System.out.println(conjunto);
	}


}
