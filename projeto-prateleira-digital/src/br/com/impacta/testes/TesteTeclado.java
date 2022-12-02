package br.com.impacta.testes;

import java.util.Scanner;

public class TesteTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("*** Insira o ano nascimento ***");
		String anoString = scan.nextLine();
		int anoInteiro = Integer.parseInt(anoString);			
		System.out.println( "Idade = " + (2022-anoInteiro) );
	}

}
