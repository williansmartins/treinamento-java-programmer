package br.com.impacta.testes;

public class TesteFor {

	public static void main(String[] args) {
		
		for(int i = 0; i<=100; i++){
			boolean ehPar = (i % 2 == 0);
			boolean naoEhDezena = (i%10 != 0 || i==0);
			
			if(ehPar && naoEhDezena) {
				System.out.println(i + "...");
			}
		}
	}

}
