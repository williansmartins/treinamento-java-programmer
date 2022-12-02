package br.com.impacta.testes;

public class ExemploIfElse {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		if(x<y) {
			System.out.println("SIM");
		}else {
			System.out.println("NAO");	
		}
	}
}
