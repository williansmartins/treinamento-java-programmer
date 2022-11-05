package br.com.impacta.testes;

import java.util.Scanner;

public class TesteTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("*** Insira o ano nascimento 11111***");
		String anoString = scan.nextLine();
		int anoInteiro = Integer.parseInt(anoString);			
		System.out.println( "Idade = " + (2022-anoInteiro) );
		
		
		System.out.println("*** Insira o ano nascimento 22222***");
		anoString = scan.nextLine();
		anoInteiro = Integer.parseInt(anoString);			
		System.out.println( "Idade = " + (2022-anoInteiro) );
	}

}
